/*Ralph Gorham
 *CS 650
 *
 *Scheduling Assignment
 *
 *
 */

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;


public class Scheduler
{
    public static void main(String[] args) throws InterruptedException,IOException
    {
        try
        {
          FileReader reader = new FileReader("Simulation1-data.txt");
          Scanner in = new Scanner(reader);

          List <Integer> data = new ArrayList<Integer>();
          while(in.hasNextInt())
          {
              data.add(in.nextInt());
          }

          //list of all the ids
          List <Integer> ids = new ArrayList<Integer>();
          //list of the arrival times
          List <Integer> aT = new ArrayList<Integer>();
          //list of the runtimes
          List <Integer> rT = new ArrayList<Integer>();
          //list of PCBs from the data
          List <PCB> PCBs = new ArrayList<PCB>();

          for (int k = 0;k < data.size();k+=3)
              ids.add(data.get(k));

          for (int k = 1;k < data.size();k+=3)
              aT.add(data.get(k));

          for (int k = 2;k < data.size();k+=3)
              rT.add(data.get(k));


          //Create list of PCBs from the data
          for (int i = 0;i < 100;i++)
          {
              PCBs.add(new PCB(ids.get(i),aT.get(i),rT.get(i)));
          }



          PCB p1 = PCBs.get(0);
          PCB p2 = PCBs.get(1);
          PCB p3 = PCBs.get(2);
          PCB p4 = PCBs.get(3);

		 //Test set
          List<PCB> test = new ArrayList<PCB>();
          test.add(p1);
          test.add(p2);
          test.add(p3);
          test.add(p4);


          Clock m = new Clock();
          //m.setClock();



          RunClock time = new RunClock(m);
          Thread t = new Thread(time);

          t.start();
          t.join();


          System.out.println(m.getTime());

          /*List <PCB> waitList = new LinkedList<PCB>();
          ReadyList ready = new ReadyList(waitList,m,p1);
          RunReadyList waitingProcesses = new RunReadyList(ready,m,p1);
          Thread t2 = new Thread(waitingProcesses);
          t2.start();
          t2.join();

          for (PCB p: waitList)
            System.out.println(p.getID());

            */


          /*List<PCB> bus = new ArrayList<PCB>();
          for (int t=0;t < 3;t++){
              bus.add(p)
          }*/

        }
        catch(IOException e)
        {
            System.out.println("Error opening file: " + e);
            System.exit(1);
        }
    }
    }



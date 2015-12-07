/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jarro_000
 */

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;


public class Scheduler
{
    public static void main(String[] args)
    {
        try
        {
            ArrayList<String> data =reader();
            String test = "test";
            System.out.println(test);
            //System.out.println(data);
            //ArrayList<String> st = new ArrayList<String>(data.subList(0,2));

            for (String st:data){
                st.split(" ");
                int t = Integer.parseInt(st);
                System.out.println(t);}

            System.out.println(data);
        }

        catch(IOException e)
        {
        System.out.println("Error opening file: " + e);
        System.exit(1);
        }

        Clock cl = new Clock();
        long c = cl.getTime();
        System.out.println(c);



    }

    private static ArrayList<String> reader() throws IOException
    {
        FileInputStream reader = new FileInputStream("Simulation1-data.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(reader));

        String line = null;
        ArrayList<String> list = new ArrayList<String>();
        while ((line = in.readLine()) != null)
        {

            list.add(line);
        }

        in.close();

        return list;
    }

}

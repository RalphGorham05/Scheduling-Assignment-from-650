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


public class Finished
{
    private List <PCB> finished = new LinkedList<>();
    private ArrayList<PCB> currentlyRunning;
    private int started;
    private int end;
    //private PCB currentlyRunning;
    
    public Finished(List finish, int start, int e, ArrayList running)
    {
        finished = finish;
        started = start;
        end = e;
        currentlyRunning = running;
        
    }
    
    
    public void putFinished(List finish, ArrayList current, PCB pcb, int start)
    {
        if(end == pcb.getST() + start +1)
        {
            finish.add(pcb);
            current.remove(pcb);
        }
     
    }
    
    
}

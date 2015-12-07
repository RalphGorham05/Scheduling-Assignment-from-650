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

public class ReadyList 
{
    List<PCB> waiting = new LinkedList();
    Clock clock = new Clock();
    PCB process = new PCB();
    
    public ReadyList(List wait,Clock c, PCB pro)
    {
        waiting = wait;
        clock = c;
        process = pro;
    }
  
    
    public void putInReady(List list, Clock clock, PCB pcb)
    {
        
        if (pcb.getAT() == clock.getTime())
        {
            list.add(pcb);
        }
        
    }

    
}

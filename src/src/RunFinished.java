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

public class RunFinished implements Runnable
{
    private Finished finished;
    private List <PCB> finishedProcesses;
    private ArrayList <PCB> currentProcess;
    private PCB process;
    private int started;
    
    public RunFinished(Finished f, List fProcesses, ArrayList cProcess,PCB p, int s)
    {
        finished = f;
        finishedProcesses = fProcesses;
        currentProcess = cProcess;
        process = p;
        started = s;
        
    }
    
    
    
    public void run()
    {
        finished.putFinished(finishedProcesses, currentProcess, process, started);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jarro_000
 */
public class RunReadyList implements Runnable
{
    private ReadyList readyS;
    private Clock clock;
    private PCB process;
    
    public RunReadyList(ReadyList ready, Clock cl, PCB pro)
    {
        readyS = ready;
        clock = cl;
        process = pro;
    }
    
    public void run()
    {
        readyS.putInReady(readyS.waiting, clock, process);
        
    }
    
}

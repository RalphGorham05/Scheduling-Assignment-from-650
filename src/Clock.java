/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jarro_000
 */


import java.util.concurrent.TimeUnit;


public class Clock 
{
    private long startTime;
    private long stopTime;
    private int currentTime;
    
    
    
    public Clock()
    {  
        startTime = System.currentTimeMillis();
    }
    
    public void setClock()
    {
        currentTime = 0;
        for(;;)
        {
            try
            {
                Thread.sleep(1000);
                currentTime++;
            }
            
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    
    public long getTime()
    {
        currentTime = 0;
        long s = 0;
        long min = 1;
        stopTime = System.currentTimeMillis();
        long et = stopTime - currentTime;
        long t = et / 1000;
        Long timeSeconds = TimeUnit.MILLISECONDS.toSeconds(et);
        long seconds = timeSeconds % 60;
        if (0 <= seconds && seconds < 60)
            s = seconds;
        else
            min++;
        System.out.print(min);
        //long elapsedMinutes = (timeSeconds / 60) % 60;
        //Integer t = Integer.valueOf(timeSeconds.intValue());
        
       //int t2 = t/100000;
        
        return s;
        
    }
}

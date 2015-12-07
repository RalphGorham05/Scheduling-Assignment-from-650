/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jarro_000
 */
public class RunClock implements Runnable
{
    private Clock clock;
    
    
    public RunClock(Clock clock)
    {
        this.clock = clock;
    }
    
    
    
    public void run()
    {
        clock.setClock();
    }
    
}

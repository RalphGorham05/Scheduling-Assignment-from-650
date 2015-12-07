/*Clock
 *


 */

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;


public class Clock
{

    private int currentTime;
    private boolean isOn;

    public Clock()
    {
        currentTime = 0;

    }

    public int getTime()
    {
        return this.currentTime;
    }

    public boolean isOn()
    {
        return this.isOn;
    }


    public void setClock()
    {
        isOn = true;

        try
        {
            for (currentTime = 0; currentTime <= 100; currentTime++)
            {
                Thread.sleep(10);
                //System.out.println("Current time is: " + currentTime);
            }

        }

        catch (InterruptedException e)
        {
            e.printStackTrace();

        }
    }




}

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

public class Tclock
{
    public static void main(String[]args) throws InterruptedException
    {
       
            int i;
            
            for (i = 0; i <= 10; i++)
            {
                Thread.sleep(500);
                System.out.println("Current time is: " + i);
            }
        
    }
}

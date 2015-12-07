/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jarro_000
 */
public class PCB 
{
    private int pid;
    private int pST;
    private int pAT;
    
    public PCB(){}
    
    public PCB(int id, int aT, int rT)
    {
        pid = id;
        pST = rT;
        pAT = aT;
    }
    
    public int getID()
    {
        return this.pid;
    }
    
    public int getST()
    {
        return this.pST;
    }
    
    public int getAT()
    {
        return this.pAT;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serrano
 */
public class SleepThread extends Thread
{
    @Override
    public void run() 
    {
            while(true)
            {
                try
                {
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){}
                
                System.out.println("Thread Sleep");
            }
}
    
}

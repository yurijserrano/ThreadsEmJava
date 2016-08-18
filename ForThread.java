
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serrano
 */
public class ForThread extends Thread
{

    /**
     *
     */
    @Override
        public void run() 
        {
                for(int i=0;i<22000;i++)
                {
                    try 
                    {
                        Thread.sleep(100);
                    } 
                    catch (InterruptedException ex)
                    {
                        Logger.getLogger(ForThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Thread For "+i);
                }
        }

    
}


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
public class ThreadManager extends Thread
{
    private Queue<Thread> ready;
    private int count;
    Thread current;
    private final int timeSlice = 1000;
    
    ThreadManager()
    {
        ready= new Queue<>(5);
        current=null;
    }
    
    @SuppressWarnings({"deprecation", "deprecation"})
    public void addThread(Thread t) throws SecurityException, InterruptedException            
    {
        
        ready.enqueue(t); 
        t.start();
        t.suspend();
           
        
    }
    public void switchContext() throws EmptyQueueException, InterruptedException
    {
            ready.front().sleep(1000);
            current=ready.front();
            
             if ( (current != null) && (current.isAlive()) ) 
             {
                 ready.enqueue(current);
             }
                  
        
    }
    
    @Override
    public void run()
    { 
        
            while (true) 
            {
                    
                    try 
                    {
                       
                       
                        current = ready.front();
                        
                        if ( (current != null) && (current.isAlive()) ) 
                        {
                             ready.front().resume();     

                            switchContext();
                        }
                        
                         ready.dequeue();

                    } 
                    catch (NullPointerException e3) { } catch (EmptyQueueException ex) {
                    Logger.getLogger(ThreadManager.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadManager.class.getName()).log(Level.SEVERE, null, ex);
                } ;

            }

    }

}
 
     

    
    
    


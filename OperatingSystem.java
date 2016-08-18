/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serrano
 */
public class OperatingSystem 
{
    public static void main(String[] args) throws SecurityException, InterruptedException
    {
        ThreadManager tm = new ThreadManager();
        // Adiciona as threads no gerenciador
        tm.addThread(new SimpleThread());
        tm.addThread(new ForThread());
        tm.addThread(new WhileThread());
        tm.addThread(new SleepThread());
        // Inicia o algoritmo Round-Robin
        tm.start();
    }

}
    


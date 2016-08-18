/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @param <E>
 */
public class Queue<E>
        extends Vector<E>
        implements IQueue<E> {


    
    
    public Queue(int capacity)
    {
        // Cria uma fila com uma certa capacidade inicial (capacity)
        super(capacity);
    }
    
    
    
   
  

    @Override
    public int size() 
    {
        return super.size();

    }

    @Override
    public boolean isEmpty() 
    {
     // Verifica se a fila está vazia
        return super.isEmpty(); 

    }

    @Override
    public void enqueue(E e) throws ArrayIndexOutOfBoundsException {
     // Enfileira, caso a fila não esteja cheia, o element E

        add(size(),e);
        
    }

    @Override
    public void dequeue() throws EmptyQueueException {
     // Desenfileira, caso a fila não esteja vazia, o primeiro elemento

        if (size()==0) 
                throw new EmptyQueueException(); 
        remove(0); 

        
    }

    @Override
    public E front() throws EmptyQueueException {
     // Devolve, sem desenfileirar, o primeiro elemento da fila

        if (size()==0) 
                throw new EmptyQueueException(); 
        return get(0); 

        
    }
}

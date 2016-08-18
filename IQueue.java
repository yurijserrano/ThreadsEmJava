/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucianosilva
 */
public interface IQueue<E> {
     public int size();
     public boolean isEmpty();
     public void enqueue(E e) throws ArrayIndexOutOfBoundsException;
     public void dequeue() throws EmptyQueueException;
     public E front() throws EmptyQueueException;
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucianosilva
 */
public interface IStack<E> {
     public int size();
     public boolean isEmpty();
     public void push(E e) throws ArrayIndexOutOfBoundsException;
     public void pop() throws EmptyStackException;
     public E top() throws EmptyStackException;
}


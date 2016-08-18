/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucianosilva
 */
public class Stack<E>
        extends Vector<E>
        implements IStack<E> {

    private int top;	// topo da pilha (índice do último elemento inserido)

    public Stack(int capacity) {
        // Cria uma pilha com uma certa capacidade inicial (capacity)
        super(capacity);
        top = -1;
    }

    public int size() {
        // Devolve o número de elementos da pilha
        return top + 1;
    }

    public boolean isEmpty() {
        // Verifica se a pilha está vazia
        return top == -1;
    }

    public void push(E e) throws ArrayIndexOutOfBoundsException {
        // Empilha, caso a pilha não esteja cheia, o element E
        add(top + 1, e);
        top++;
    }

    public void pop() throws EmptyStackException {
        // Desempilha, caso a pilha não esteja vazia, o elemento do topo
        if (top == -1) {
            throw new EmptyStackException();
        }
        remove(top);
        top--;
    }

    public E top() throws EmptyStackException {
        // Devolve, sem desempilhar, o elemento do topo caso a pilha não esteja vazia
        if (top == -1) {
            throw new EmptyStackException();
        }
        return get(top);
    }
}

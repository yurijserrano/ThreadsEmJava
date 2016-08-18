/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucianosilva
 */
public class Vector<E>
        implements IndexList<E> {

    private E[] A;   		// armazena os elementos do vetor
    private int capacity;	// capacidade do vetor
    private int size;		// tamanho do vetor

    
    
    public Vector()
    {
        this.size=0;
    }
    
    public Vector(int capacity) {
        // implementação da operação empty, que cria um vetor com certa capacidade
        A = (E[]) new Object[capacity];
        this.capacity=capacity;
        this.size=0;
    }
    
    public Vector (E[] A, int capacity, int size){
        this.A=A;
        this.capacity=capacity;
        this.size=size;
    }

    public boolean isEmpty() {
       return size==0;
    }

    public int size() {
        return size;
    }

    public E get(int i) throws ArrayIndexOutOfBoundsException {
        return A[i];
    }

    public E set(int i, E e) throws ArrayIndexOutOfBoundsException {
        E obj=A[i];
        A[i]=e;
        return obj;
    }

    public void add(int i, E e) throws ArrayIndexOutOfBoundsException {
        if (size==capacity){ // Se há estouro da capacidade, aloca mais espaço
            E[] obj = (E[]) new Object[2*capacity];
            for(int j=0;j<size;j++) // Copia valores do antigo vetor
                obj[j]=A[j];
            A=obj;
        }
        for (int j=size-1;j>=i;j--)
            A[j+1]=A[j];
        A[i]=e;
        size++;
            
    }

    public void remove(int i) throws ArrayIndexOutOfBoundsException {
        for(int j=i;j<=size-2;j++)
            A[j]=A[j+1];
        size--;
    }

    protected Object clone()
            throws CloneNotSupportedException {
        E[] obj = (E[]) new Object[capacity];
        for (int i=0;i<size;i++) 
            obj[i]=A[i];
        Vector v = new Vector(obj,capacity,size);
        return v;
    }

    public E[] getArray() {
        return A;
    }

}


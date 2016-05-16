package chapter2.lesson11;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by wangzhenhua on 16/5/8.
 */
public class Stack<E> implements Cloneable{

    private Object[] elements;

    private int size = 0 ;

    public static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack () {
        elements =new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push ( E obj ) {
        ensureCapacity();
        elements[size++] = obj;
    }

    public E pop() {
        if (size <= 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;  //eliminate obsolete reference
        return (E)result;
    }

    private void ensureCapacity() {
        if ( elements.length == size ){
            elements = Arrays.copyOf(elements,size * 2 + 1);
        }
    }

    @Override
    public Stack clone() throws CloneNotSupportedException {
        Stack copyStack = (Stack) super.clone();
        copyStack.elements = elements.clone();
        return copyStack;
    }

    public static void main(String[] args) {

    }

}

package net.mattlabs.colorstack;

public class ColorStack<E>{

    public static final int CAPACITY = 1000;
    private E[] data;
    private int lRed = -1, lBlue;

    public ColorStack() {
        this(CAPACITY);
    }

    public ColorStack(int capacity) {
        data = (E[]) new Object[capacity];
        lBlue = (capacity / 2) - 1;
    }

    // Returns the number of elements in the red stack
    public int sizeRed() {
        return lRed + 1;
    }

    // Returns the number of elements in the blue stack
    public int sizeBlue() {
        return (lBlue - (data.length / 2)) + 1;
    }

    // Tests whether the red stack is empty
    public boolean isEmptyRed() {
        return (lRed == -1);
    }

    // Tests whether the blue stack is empty
    public boolean isEmptyBlue() {
        return (lBlue == (data.length / 2) - 1);
    }

    // Inserts an element at the front of the red stack
    public void pushRed(E e) throws IllegalStateException {
        if (sizeRed() == data.length / 2) throw new IllegalStateException("Red stack is full");
        data[++lRed] = e;
    }

    // Inserts an element at the front of the blue stack
    public void pushBlue(E e) throws IllegalStateException {
        if (sizeBlue() == data.length / 2) throw new IllegalStateException("Blue stack is full");
        data[++lBlue] = e;
    }

    // Returns the top object of the red stack
    public E topRed() {
        if (isEmptyRed()) return null;
        return data[lRed];
    }

    // Returns the top object of the blue stack
    public E topBlue() {
        if (isEmptyBlue()) return null;
        return data[lBlue];
    }

    // Pops and returns the top object of the red stack
    public E popRed() {
        if (isEmptyRed()) return null;
        E answer = data[lRed];
        data[lRed] = null;
        lRed--;
        return answer;
    }

    // Pops and returns the top object of the blue stack
    public E popBlue() {
        if (isEmptyBlue()) return null;
        E answer = data[lBlue];
        data[lBlue] = null;
        lBlue--;
        return answer;
    }
}

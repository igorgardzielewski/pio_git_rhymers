package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int LIMIT = 12;

    private static final int FALSE = -1;

    private int[] numbers = new int[LIMIT];

    public int total = FALSE;

    public void countIn(int in) {
        if (!isFull()) numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == FALSE;
    }

    public boolean isFull() {
        return total == LIMIT - 1;
    }

    protected int peekaboo() {
        if (callCheck()) return FALSE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) return FALSE;
        return numbers[total--];
    }

}

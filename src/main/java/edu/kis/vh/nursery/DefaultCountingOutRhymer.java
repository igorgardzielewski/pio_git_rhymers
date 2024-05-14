package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int LIMIT = 12;
    private static final int LAST_INDEX = LIMIT - 1;

    private static final int IF_EMPTY = -1;

    private static final int INIT_VALUE = -1;

    private final int[] numbers = new int[LIMIT];

    private int total = INIT_VALUE;

    public int getTotal() {
        return total;
    }
    public void countIn(int in) {
        if (!isFull()) numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == IF_EMPTY;
    }

    public boolean isFull() {
        return total == LAST_INDEX;
    }

    protected int peekaboo() {
        if (callCheck()) return IF_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) return IF_EMPTY;
        return numbers[total--];
    }

}

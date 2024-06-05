package edu.kis.vh.nursery;

/**
 Klasa DefaultCountingOutRhymer
 posiada metody:
 getTotal()- sluzaca do zwracania liczby elementow
 isFull()- do sprawdzania czy jest pelna
 peekaboo()- do zwracania ostatniego elementu
 callCheck()-do sprawdzania czy jest empty
 countIn()- do dodawania elementu jezeli nie jest pelny
 countOut()- zwraca ostatni element
 oraz posiada definicje:
 LIMIT=12, służąca do okreslania max rozmiaru tablicy,
 LAST_INDEX = LIMIT - 1, określa ostatni index w tablicy
 IF_EMPTY = -1, określa czy tablica jest pusta
 INIT_VALUE = -1, ile mamy elementow
 *
 */
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

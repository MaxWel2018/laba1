package com.maksym.laba1.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertSortTest {

    private  int[] arrayForSorting = new int[]{4, -8, 11, -4, 5, -9, 10, 1, 6};
    private  int[] expected = new int[]{-9, -8, -4, 1, 4, 5, 6, 10, 11};
    private Sort insertSort = new InsertSort();
    @Test
    public void sort() {

        insertSort.sort(arrayForSorting);
        assertArrayEquals(expected, arrayForSorting);
    }
}
package com.maksym.laba1.sort;

public interface Sort {
    void sort(int[] arrayForSorting);
     static void swap(int[] arrayForSorting, int j,int k) {
        int temp = arrayForSorting[j];
        arrayForSorting[j] = arrayForSorting[k];
        arrayForSorting[k] = temp;
    }
}

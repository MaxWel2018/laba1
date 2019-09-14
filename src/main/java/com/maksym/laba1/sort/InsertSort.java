package com.maksym.laba1.sort;


public class InsertSort implements Sort {

    @Override
    public void sort(int[] arrayForSorting) {
        for (int i = 1; i < arrayForSorting.length; i++)
            for (int j = i; j > 0 && arrayForSorting[j - 1] > arrayForSorting[j]; j--) {
                Sort.swap(arrayForSorting,j-1,j);
            }
    }
}

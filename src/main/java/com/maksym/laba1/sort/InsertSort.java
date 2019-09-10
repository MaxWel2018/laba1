package com.maksym.laba1.sort;


import com.maksym.laba1.utility.UtilityForSorting;

public class InsertSort implements Sort {

    @Override
    public void sort(int[] arrayForSorting) {
        for (int i = 1; i < arrayForSorting.length; i++)
            for (int j = i; j > 0 && arrayForSorting[j - 1] > arrayForSorting[j]; j--) {
                UtilityForSorting.swap(arrayForSorting,j-1);
            }
    }
}

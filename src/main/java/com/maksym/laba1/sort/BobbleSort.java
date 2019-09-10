package com.maksym.laba1.sort;

import com.maksym.laba1.utility.UtilityForSorting;

public class BobbleSort implements Sort {
    @Override
    public void sort(int[] arrayForSorting) {
        for (int i = 0; i < arrayForSorting.length; i++) {
            for (int j = 0; j < arrayForSorting.length-i-1; j++) {
                if (arrayForSorting[j] > arrayForSorting[j + 1]) {
                    UtilityForSorting.swap(arrayForSorting, j);
                }
            }

        }
    }


}

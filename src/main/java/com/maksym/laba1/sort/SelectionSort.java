package com.maksym.laba1.sort;

import com.maksym.laba1.utility.UtilityForSorting;

public class SelectionSort implements Sort{

    @Override
    public void sort(int[] arrayForSorting) {
        int n = arrayForSorting.length;
        for (int i = 0; i < n-1; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < n; j++)
                if (arrayForSorting[j] < arrayForSorting[minIndex])
                    minIndex = j;
            UtilityForSorting.swap(arrayForSorting, minIndex,i);
        }
    }
}

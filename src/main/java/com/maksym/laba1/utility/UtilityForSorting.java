package com.maksym.laba1.utility;

public class UtilityForSorting {
        public static void swap(int[] arrayForSorting, int j) {
            int temp = arrayForSorting[j];
            arrayForSorting[j] = arrayForSorting[j + 1];
            arrayForSorting[j + 1] = temp;
        }
}

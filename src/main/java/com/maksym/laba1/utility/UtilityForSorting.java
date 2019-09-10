package com.maksym.laba1.utility;

public class UtilityForSorting {
        public static void swap(int[] arrayForSorting, int j,int k) {
            int temp = arrayForSorting[j];
            arrayForSorting[j] = arrayForSorting[k];
            arrayForSorting[k] = temp;
        }

}

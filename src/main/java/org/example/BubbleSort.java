package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> myIntList = Arrays.asList(2, 11, 12, 1, 15, 2, 1, 121212, 3, 23);
        bubbleSort(myIntList);
    }

    public static void bubbleSort(List<Integer> list) {
        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            for (int j = 0; j < --listSize - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }


    }
}

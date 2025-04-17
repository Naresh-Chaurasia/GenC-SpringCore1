package com.sorting;

public class MainSort {

    public static void main(String[] args) {

        int userInput = 0;
        ISort sortAlgorithm;

        int arr [] = {10};

        if(userInput > 10){
            sortAlgorithm = new BubbleSort();
        }else{
            sortAlgorithm = new QuickSort();
        }

        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm(sortAlgorithm);
        sortingAlgorithm.performSort(arr);
    }
}

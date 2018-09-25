package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BinarySearchImpl{

    @Autowired
    private SortAlg sortAlg;

    public int binarySearch(int[] numbers, int numberToSearch)
    {
        int[] sortedNumber =  sortAlg.sort(numbers);
        System.out.println(sortAlg);
        return 3;
    }

}

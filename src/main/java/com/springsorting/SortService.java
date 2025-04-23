package com.springsorting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class SortService {

    @Autowired
    @Qualifier("quickSort")
    private SortAlgorithm algorithm;

    // public SortService(SortAlgorithm algorithm) {
    //     this.algorithm = algorithm;
    // }

    public int[] sortNumbers(int[] numbers) {
        return algorithm.sort(numbers);
    }
}

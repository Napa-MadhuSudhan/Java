package com.madhu.assignements;

public class assignment4 {
    public int sumOfPrimes(int from, int to) {
        int sum=0;
        for(int i=from;i<=to;i++){
            if(assignment2.isPrimeNumber(i))
                sum += i;
        }
        return sum;
    }
}

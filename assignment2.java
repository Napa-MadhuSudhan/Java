package com.madhu.assignements;

public class assignment2 {
    static boolean isPrimeNumber(int num) {
        if(num%2==0){
            return false;
        }
        else{
            for(int i=3;i<num/2;i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}

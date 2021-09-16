package com.madhu.assignements;

public class assignment5 {

    public int fibonacci(int index) {
        int fib0=0;
        int fib1=1;
        int fib2=fib0+fib1;
        if(index==1) return fib0;
        else if (index==2) return fib1;
        else if(index==3) return fib2;
        else{
            index-=3;
            while(index!=0){
                index-=1;
                fib0 = fib1;
                fib1=fib2;
                fib2=fib1+fib0;

            }
        }
        return fib2;
    }
}

package com.madhu.assignements;

public class assignment3 {
    public void sortThreeNumbers(int a, int b, int c) {
        // do stuff here

        if(a>b && a>c){
            if(b>c)
            {System.out.println(a+" "+b+" "+c);}
            else{
                System.out.println(a+" "+c+" "+b);
            }
        }
        else if(b>a && b>c){
            if(a>c)
            {System.out.println(b+" "+a+" "+c);}
            else{
                System.out.println(b+" "+c+" "+a);
            }
        }
        else{

            if(a>b){

                    System.out.println(c+" "+a+" "+b);
                }
            else{
                System.out.println(c+" "+b+" "+a);
            }

        }

    }
}

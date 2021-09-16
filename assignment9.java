package com.madhu.assignements;

public class assignment9 {
    public int[] sumOfEvensAndOdds(int []nums) {
        int even=0;
        int odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even+=nums[i];
            }
            else{
                odd+=nums[i];
            }
        }
        int[] arr=new int[2];
        arr[0]=even;
        arr[1]=odd;
        return arr;
    }
}

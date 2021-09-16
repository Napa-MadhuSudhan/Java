package com.madhu.assignements;
import java.util.*;
public class assignment1 {
    static boolean isValidDate(int year, int month, int day) {
        int isleap=0;
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            isleap=1;
        }
        if(month==1 && day<=31){
            return true;
        }
        else if(month==2){
            if(isleap==1 && day<=29){
                return true;

            }
            else return isleap == 0 && day <= 28;
        }
        else if(month==3 && day<=31){
            return true;
        }
        else if(month==4 && day<=30){
            return true;
        }
        else if(month==5 && day<=31){
            return true;
        }
        else if(month==6 && day<=30){
            return true;
        }
        else if(month==7 && day<=31){
            return true;
        }
        else if(month==8 && day<=31){
            return true;
        }
        else if(month==9 && day<=30){
            return true;
        }
        else if(month==10 && day<=31){
            return true;
        }
        else if(month==11 && day<=30){
            return true;
        }
        else return month == 12 && day <= 31;
    }
    int give_me_year=KeyboardUtil.getInt("give me year");
    int give_me_month=KeyboardUtil.getInt("give me month");
    int give_me_day=KeyboardUtil.getInt("give me year");
    boolean result=isValidDate(give_me_year,give_me_month,give_me_day);

}

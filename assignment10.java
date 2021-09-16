package com.madhu.assignements;

public class assignment10 {
    public String reverseByWords(String sentence) {
        String[] s = sentence.split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i] + " ";
        }


        return ans;
    }
}

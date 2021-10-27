package edu.northeastern.fxmy;

import java.util.HashMap;

public class question4 {

    public static void main(String[] args) {

        String s1 = "abcabcbb";
        System.out.println(question4(s1));
    }

    //Time: O(n) Space: O(1)
    public static String question4(String s) {
        if (s.length()<=1)
            return s;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        int start = 0;
        int end = 0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            if(max<i-j+1){
                max = i-j+1;
                start = j;
                end = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = start;i<=end;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
//abcab
//0123
//max = 3
//j = 2

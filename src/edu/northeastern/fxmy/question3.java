package edu.northeastern.fxmy;

import java.util.HashMap;

public class question3 {

    public static void main(String[] args) {

        int[] nums = {1,3,-1,3,4,-1};
        System.out.println(question3(nums));
    }


    //Time: O(n) Space: O(1)
    public static int question3(int nums[]){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int sum = 0;
        for(int i:nums){
            if(map.get(i) >1){
                sum += i;
                map.put(i,0);
            }
        }

        return sum;
    }
}

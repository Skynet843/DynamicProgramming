/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author skynet
 */
public class SubArray {
    public static void main(String []args){
        int[] arr={2,6,10,4,5,45,5,454,48,3,41,84,8,6,8,9,8,100,10,10,948,48,88,9,4,1,23,8,74,4,52,5,7,5,5,1,1,4};
        int sum=1000;
        System.out.println(find(arr,sum));
    }
static int find(int[] arr,int sum){
    Map<String,Integer> memo=new HashMap<>();
    return rec(arr,sum,arr.length-1,memo);
}
    static int rec(int[] arr,int sum,int i,Map<String,Integer> memo){
        int to_return;
        String key=sum +":" + i;
        if(memo.containsKey(key)){
            return memo.get(key);
        }else if(sum==0){
            return 1;
        }else if(i<0){
            return 0;
        }else if(sum<arr[i]){
           to_return=rec(arr,sum,i-1,memo);
        }else{
           to_return=rec(arr,sum,i-1,memo) +rec(arr,sum-arr[i],i-1,memo);
        }
        memo.put(key, to_return);
        return to_return;
        }
}
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming;

/**
 *
 * @author skynet
 */
public class CombitionOfCoin {
    public static void main(String[] args){
        int amount=3;
        int[] money={1,2};
        System.out.println(rec(amount,money));
    }
    static int rec(int a,int[] m){
        int ans=0;
        if(a<0){
            return 0;
        }else if(a==0){
            return 1;
        }else{
            for(int i=0;i<m.length;i++){
                ans=ans + rec(a-m[i],m);
            }
            return ans;
    }
    }
    
}

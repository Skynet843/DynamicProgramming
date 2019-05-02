/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StairCase_2;

/**
 *
 * @author skynet
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author skynet
 */
public class StairCaseAd {
    
    public static void main(String[] args){
        int N_s=1000;
        
    System.out.println(Num_ways(N_s));
    }
   static int count=1;
    static int Num_ways(int N){
        System.out.println(count++);
        if(N==0||N==1){
            return 1;
        }
        int[] memo=new int[N+1];
        memo[0]=1;
        memo[1]=1;
        for(int i=2;i<=N;i++){
            memo[i]=memo[i-1]+memo[i-2];
            
        }
        return memo[N];
    }
    
}


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
public class StairCase {
    
    public static void main(String[] args){
        int N_s=1000;
        int[] memo=new int[N_s+1];
        memo[0]=1;
        memo[1]=1;
    System.out.println(Num_ways(N_s,memo));
    }
   static int count=1;
    static int Num_ways(int N,int[] mem){
        System.out.println(count++);
        int ans;
        if(mem[N]!=0){
            return mem[N];
        }
        if(N==0||N==1){
            return 1;
        }else{
            ans=Num_ways(N-1,mem)+Num_ways(N-2,mem);
            mem[N]=ans;
            return mem[N];
        }
    }
    
}


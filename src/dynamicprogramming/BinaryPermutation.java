/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming;



public class BinaryPermutation {

  public static void main(String[] args) {
  	int n=15;
  	int[] arr=new int[n];
  	binary(n,arr,0);
   
  }
  static void binary(int n,int[] memo,int i){
  if(i==n){
    print(memo,n);
  }else{
    memo[i]=0;
    binary(n,memo,i+1);
    memo[i]=1;
    binary(n,memo,i+1);
  }
  }
  static void print(int[] arr,int n){
    for (int i = 0; i < n; i++)  

    { 

        System.out.print(arr[i]+" "); 

    } 

    System.out.println(); 
  }
}

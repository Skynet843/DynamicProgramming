/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming;



public class SubCarray {
static int ans=0;
  public static void main(String[] args) {
   	int[] array={2,4,6,10};
   	int l_array=4;
   	int[] memo=new int[l_array];
   	int sum=16;
   	fun(array,memo,0,l_array,sum);
  }
  static void fun(int[] array,int[] memo,int n,int l,int sum){
        
    if(n>l-1 ){
          if(SumArray(memo,l)==sum){
              ans++;
           System.out.println(ans); 
          }
    }else{
      memo[n]=array[n];
     fun(array,memo,n+1,l,sum);
      memo[n]=0;
      fun(array,memo,n+1,l,sum);
      
    }
  }
  static int SumArray(int[] memo,int l){
  int sumation=0;
    for(int i=0;i<l;i++){
      sumation=sumation+memo[i];
      
    }
    return sumation;
  }
}


package dynamicprogramming;

/**
 *
 * @author skynet
 */
public class FibonacciSeries {
    
    public static void main(String []args){
        int n=30;
        int[] arr=new int[n+1];
        arr[1]=1;
        arr[2]=1;
        int ans=Fib(n,arr);
        System.out.println(n+"th Fibonacci number is "+ ans);
    }
    static int Fib(int N,int[] temp){
        
        
        if(N==1||N==2){
            
            return temp[N];
        }else{
            if(temp[N]==0){
                temp[N]=Fib(N-1,temp)+Fib(N-2,temp);
                return temp[N];
            }
            return temp[N];
        }
    }
}

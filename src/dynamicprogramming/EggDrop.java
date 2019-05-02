
package dynamicprogramming;



public class EggDrop {
    public static void main(String[] args) {
        int ans;
        int n=1000000;
        ans=tries(n);
        System.out.println("ans is "+ans);
    }
       static int tries(int N){
            if(N==2){
                return 2;
            }else{
                
                return (tries((N/2)+(N%2))+1);
            }
        }
}

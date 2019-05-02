
package dynamicprogramming;

public class TowerOfHanoi {
    public static void main(String[] args) {
        
        ans(50,"A","B","C");
                
    }
    static void ans(int n,String start,String aux,String end){
        if(n==1){
            System.out.println("Move "+ n +"th disk from " + start +" to " +end);
            
        }else{
            ans(n-1,start,end,aux);
            System.out.println("Move "+ n +"th disk from " + start +" to " +end);
            ans(n-1,aux,start,end);
            
        }
    }
    
}

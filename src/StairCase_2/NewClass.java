package StairCase_2;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. ADITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIFICATION");
        System.out.println("4. DIVISION");
        System.out.println("_____________________________________________________");
        int choice=sc.nextInt();
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        if(choice==1){
            System.out.println(N1+N2);
        }else if(choice==2){
            System.out.println(N1-N2);
        
    }else if(choice==4){
        System.out.println(N1/N2);
    }else if(choice==3){
        System.out.println(N1*N2);
    }else{
        System.out.println("invalid");
    }
}
}

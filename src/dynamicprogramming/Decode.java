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
public class Decode {
    public static void main(String []args){
        String input="1224151152412521223656788551125322152115212525652312151212121213";
        int[] memo=new int[input.length()+1];
        System.out.println(num_ways(input,0,memo));
        
    }
    static int num_ways(String in,int index,int[] mem){
        if(Integer.parseInt(in.substring(0, 1))==0){
            return 0;
        }else if(mem[index]!=0){
            return mem[index];
        } else if(index>=in.length()-1){
            return 1;
        }else if(26<=Integer.valueOf(in.substring(index, index+2))){
            mem[index]=num_ways(in,index+1,mem);
            return mem[index];
        }else{
            mem[index]=num_ways(in,index+1,mem)+num_ways(in,index+2,mem);
            return mem[index];
        }
    }
}

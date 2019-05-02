package dynamicprogramming;

public class PermutationString {

  public static void main(String[] args) {
  	String s="ABC";
  	int index=s.length();
    	permutations (s,0,index-1);
  }
  static void permutations(String str,int i,int r) {
    if(i==r){
      System.out.println(str);
    }else{
      for(int j=i;j<=r;j++){
        str=swap(str,i,j);
        permutations(str,i+1,r);
        str=swap(str,i,j);
      }
    }
  }
  static String swap(String str,int i,int r){
    char temp;
    char[] array=str.toCharArray();
    temp=array[i];
    array[i]=array[r];
    array[r]=temp;
    return String.valueOf(array);
  }
}


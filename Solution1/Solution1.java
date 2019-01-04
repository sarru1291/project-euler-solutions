/*
Multiples of 3 and 5
Problem 1 

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class Solution1{
  static boolean isMultiple(int x){
      if(x%3==0||x%5==0){
        return true;
      }
    return false;
  }
  public static void main(String... args){
    final int limit=1000;
    int sum=0;
    for(int i=1;i<limit;i++){
          if(isMultiple(i)){
              sum=sum+i;
          }
    }
    System.out.println(sum);
  }
}
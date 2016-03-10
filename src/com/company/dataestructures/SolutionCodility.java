package com.company.dataestructures;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class SolutionCodility {
  
  public static void main(String[] args){
    int[] a = {-1,3,-4,5,1,-6,2,1}; 
    System.out.println(solution(a));
  }
 
  //N is the size of array
  //P is eqIndex and should  =< P < N
  // N = 8 Array{ -1, 3, -4, 5, 1, -6, 2 ,1 }
  //sum all elements is -11 12 = 1
  //-1-1=0
  //-1 + (-10+9) = -2
  //A[P-1] -> P=1 (ok)
  //    A[0]=-1= smu(A[2] until A[7])
   public static int solution(int[] A) {
       // write your code in Java SE 8
       for(int index=0; index<A.length; index++){
           int beforeSum = sumBefore(A,index-1);
           int afterSum = sumAfter(A,index-1);
           boolean validIndex = isValidIndex(A[index],beforeSum,afterSum);
           if(validIndex){
             return index;
           }
       }
       return -1;
   }

   private static boolean isValidIndex(int index, int lowerSum, int afterSum) {
     if(lowerSum==afterSum && afterSum==index){
       return true;
     }else{
       return false;
     }
   }

   private static int sumAfter(int[] a,int indOfx) {
     if(indOfx<0 || indOfx==a.length){
       return 0;
     }else{
       int sum=0;
       for(int i=0; i<indOfx; i++){
         sum=+a[i];
       }
       return sum;
     }
   }
   

   private static int sumBefore(int[] a, int indOfx) {
     if(indOfx<0 || indOfx==a.length){
       return 0;
     }else{
       int sum=0;
        for(int i=indOfx; i>indOfx; i--){
         sum=+a[i];
       }
       return sum;
     }
   }
}
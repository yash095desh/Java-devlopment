package array;

public class arrayProblems {
 public static void main (String[] args){
     int arr [] = {24,2,23,42,22,83,3,5};

     // find the sum of numbers in this arr
     int sum = 0 ;
     for(int num:arr){
         sum += num ;
     }
     System.out.println("Sum of all numbers in arr is :"+sum);

     // find the max of them
     int max = 0;
     for(int num:arr){
         if(num>max) max = num ;
     }
     System.out.println("Max number is:"+max);

     // find the min number in arr
     int min = arr[0];
     for(int num:arr){
         if(num<min){
             min = num;
         }
     }
     System.out.println("Minimum numbers is :"+min);

 }
}

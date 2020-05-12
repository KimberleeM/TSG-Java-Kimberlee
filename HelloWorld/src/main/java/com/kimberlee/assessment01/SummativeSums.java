package com.kimberlee.assessment01;

/**
 *
 * @author Max
 */
public class SummativeSums {
    public static void main(String[] args) {
    int sum = 0; 
        int [] numbers1 =   { 1, 90, -33, -55, 67, -16, 28, -55, 15 };     
        for(int a=0; a<numbers1.length;a++){
           sum = sum+numbers1[a]; //
        }
        System.out.println("#1 Array Sum: "+sum);
        sum = 0; 
       
        
        
        
        int [] numbers2 =   { 999, -60, -77, 14, 160, 301 }; 
        sum = sumarray(numbers2, sum); 
         
        int [] numbers3 =   { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
          for(int a=0; a<numbers3.length;a++){
           sum = sum+numbers3[a]; 
        }
        System.out.println("#3 Array Sum: "+sum);
        sum = 0; 
    }   

    private static int sumarray(int[] numbers2, int sum) {
        for(int a=0; a<numbers2.length;a++){
            sum = sum+numbers2[a];
        }
        System.out.println("#2 Array Sum: "+sum);
        sum = 0;
        return sum;
    }
}
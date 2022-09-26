/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jktv21_task5_odintsovakseniia;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class JKTV21_Task5_OdintsovaKseniia {

    public static void main(String[] args) {
       Random random = new Random();
        int [][] nums = new int[5][];
        int min = 50, max = 100;
        
        nums[0]=new int[3];
        nums[1]=new int[5];
        nums[2]=new int[7];
        nums[3]=new int[8];
        nums[4]=new int[9];
        
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j]=random.nextInt(max-min+1)+min;
                
            }      
        }

        
        System.out.println("Зубчатый массив без сортировки:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
            System.out.printf("%4d",nums[i][j]);
            }   
        }
        System.out.println("");
        
        
        int numslength=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
            numslength++;   
            }   
        }
        
        int tempmass[]=new int[numslength];
        int tempint2=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                
                    tempmass[tempint2]=nums[i][j];
                    tempint2++;
            }
        }
        
        
        
        
        System.out.println("Зубчатый массив с сортировкой");
        int[][] jaggedArray = new int[10][];
        jaggedArray[0] = new int[10];
        jaggedArray[1] = new int[9];
        jaggedArray[2] = new int[8];
        jaggedArray[3] = new int[7];
        jaggedArray[4] = new int[6];
        jaggedArray[5] = new int[5];
        jaggedArray[6] = new int[4];
        jaggedArray[7] = new int[3];
        jaggedArray[8] = new int[2];
        jaggedArray[9] = new int[1];
        System.out.println("Зубчатый массив");
        for (int[] jaggedArray1 : jaggedArray) {
            System.out.println(Arrays.toString(jaggedArray1));
        }
        int[][]array10D = {
            {1,2,3,4,5,6,7,8,9,},
            {2,4,6,7,8,}
            
        };
       
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
            System.out.printf("%4d",nums[i][j]);
            }   
        }
    }
}

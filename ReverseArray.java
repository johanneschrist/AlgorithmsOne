/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package searchingalgorithms;

import java.util.Arrays;

/**
 *
 * @author Pavilion
 */
public class  ReverseArray {
    
    
    public int[] reverseArray(int[] array){
        
        int[] myArray = new int[array.length];
        System.arraycopy(array, 0, myArray, 0, array.length);
        Arrays.sort(myArray);
        int[] reversed = new int[array.length];        
        
        for (int i = 0; i < myArray.length; i++){
            
            reversed[(myArray.length - 1) - i] = myArray[i];           
        }                  
        return reversed;
    }   
    
}

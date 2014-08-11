/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package searchingalgorithms;

/**
 *
 * @author bposso00
 */
public class OrderedArray {
    
    
    public int [] orderArray(int[] array){
//        int[] ordered = new int[array.length];
        
        for (int i = 0; i < (array.length); i++){ 
           for (int j = 0; j < (array.length - 1); j++){
                if (array[j] > array[j+1]){
                     int temp = array[j];
                     array[j] = array[j+1];
                     array[j+1] = temp;
                     
                   
                } 
            }
        }
    return array;    
}
}
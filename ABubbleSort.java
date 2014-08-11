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
public class ABubbleSort {
    
    public int[] sortArray(int [] array, int size, char type){
        boolean swapped = false;
        //int counter = 0;
        int temp;
        
         if (type == 'n'){
            if (size == 500) SearchingAlgorithms.ad_bubbleSortCounter500n+=2;
            if (size == 2500) SearchingAlgorithms.ad_bubbleSortCounter2500n+=2;
            if (size == 12500) SearchingAlgorithms.ad_bubbleSortCounter12500n+=2;
            if (size == 62500) SearchingAlgorithms.ad_bubbleSortCounter62500n+=2;
         }
         else if (type == 'r'){
            if (size == 500) SearchingAlgorithms.ad_bubbleSortCounter500r+=2;
            if (size == 2500) SearchingAlgorithms.ad_bubbleSortCounter2500r+=2;
            if (size == 12500) SearchingAlgorithms.ad_bubbleSortCounter12500r+=2;
            if (size == 62500) SearchingAlgorithms.ad_bubbleSortCounter62500r+=2;
         }
         else if (type == 't'){
            if (size == 500) SearchingAlgorithms.ad_bubbleSortCounter500t+=2;
            if (size == 2500) SearchingAlgorithms.ad_bubbleSortCounter2500t+=2;
            if (size == 12500) SearchingAlgorithms.ad_bubbleSortCounter12500t+=2;
            if (size == 62500) SearchingAlgorithms.ad_bubbleSortCounter62500t+=2;
         }
        
            
       for (int h = 0; h < array.length; h++){
           for (int g = 1; g < array.length-1; g++){
             //int min = g+1;
             
             //if (array[g] > array[g+1]){
                 while (array[g] > array[g+1]){
                     swapped = true;
                     //counter++;
                     temp = array[g];
                     array[g] = array[g + 1];
                     array[g + 1] = temp;
                     //swapped = true;
                  
         if (type == 'n'){
            if (size == 500) SearchingAlgorithms.ad_bubbleSortCounter500n+=2;
            if (size == 2500) SearchingAlgorithms.ad_bubbleSortCounter2500n+=2;
            if (size == 12500) SearchingAlgorithms.ad_bubbleSortCounter12500n+=2;
            if (size == 62500) SearchingAlgorithms.ad_bubbleSortCounter62500n+=2;
         }
         else if (type == 'r'){
            if (size == 500) SearchingAlgorithms.ad_bubbleSortCounter500r+=2;
            if (size == 2500) SearchingAlgorithms.ad_bubbleSortCounter2500r+=2;
            if (size == 12500) SearchingAlgorithms.ad_bubbleSortCounter12500r+=2;
            if (size == 62500) SearchingAlgorithms.ad_bubbleSortCounter62500r+=2;
         }
         else if (type == 't'){
            if (size == 500) SearchingAlgorithms.ad_bubbleSortCounter500t+=2;
            if (size == 2500) SearchingAlgorithms.ad_bubbleSortCounter2500t+=2;
            if (size == 12500) SearchingAlgorithms.ad_bubbleSortCounter12500t+=2;
            if (size == 62500) SearchingAlgorithms.ad_bubbleSortCounter62500t+=2;
         }
          }
           
         if (array[g] < array[g+1]){        //just for comparison
            if (type == 'n'){
            if (size == 500) SearchingAlgorithms.ad_bubbleSortCounter500n++;
            if (size == 2500) SearchingAlgorithms.ad_bubbleSortCounter2500n++;
            if (size == 12500) SearchingAlgorithms.ad_bubbleSortCounter12500n++;
            if (size == 62500) SearchingAlgorithms.ad_bubbleSortCounter62500n++;
            }  
         else if (type == 'r'){
            if (size == 500) SearchingAlgorithms.ad_bubbleSortCounter500r++;
            if (size == 2500) SearchingAlgorithms.ad_bubbleSortCounter2500r++;
            if (size == 12500) SearchingAlgorithms.ad_bubbleSortCounter12500r++;
            if (size == 62500) SearchingAlgorithms.ad_bubbleSortCounter62500r++;
         }
         else if (type == 't'){
            if (size == 500) SearchingAlgorithms.ad_bubbleSortCounter500t++;
            if (size == 2500) SearchingAlgorithms.ad_bubbleSortCounter2500t++;
            if (size == 12500) SearchingAlgorithms.ad_bubbleSortCounter12500t++;
            if (size == 62500) SearchingAlgorithms.ad_bubbleSortCounter62500t++;
         }
          }
                 
                 
            }
            
        }
    return array;
    }
 
    
}
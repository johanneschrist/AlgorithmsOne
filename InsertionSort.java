/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingalgorithms;
/**
 *
 * @author Pavilion
 */
public class InsertionSort {
    
        
   public int[] sortArray(int[] array, int size, char type){
        
       for (int j = 1; j < array.length; j++){
                    
        int key = array[j]; 
        int i = j-1;          
        
        if (type == 'n'){
         if (size == 500) SearchingAlgorithms.insertionSortCounter500n+=2;
         if (size == 2500) SearchingAlgorithms.insertionSortCounter2500n+=2;
         if (size == 12500) SearchingAlgorithms.insertionSortCounter12500n+=2;
         if (size == 62500) SearchingAlgorithms.insertionSortCounter62500n+=2;
        }
        if (type == 'r'){
         if (size == 500) SearchingAlgorithms.insertionSortCounter500r+=2;
         if (size == 2500) SearchingAlgorithms.insertionSortCounter2500r+=2;
         if (size == 12500) SearchingAlgorithms.insertionSortCounter12500r+=2;
         if (size == 62500) SearchingAlgorithms.insertionSortCounter62500r+=2;
        }
        if (type == 't'){
         if (size == 500) SearchingAlgorithms.insertionSortCounter500t+=2;
         if (size == 2500) SearchingAlgorithms.insertionSortCounter2500t+=2;
         if (size == 12500) SearchingAlgorithms.insertionSortCounter12500t+=2;
         if (size == 62500) SearchingAlgorithms.insertionSortCounter62500t+=2;
        }
        
        
        for (int x = i ;x > -1; x-- ){
            if (array[x] > key){     // comparisons...      
                int temp = array[x];    //this counts as a 1 swapp...
                array[x] = array[x+1];
                array[x+1] = temp;
                        
                if (type == 'n'){
                    if (size == 500) SearchingAlgorithms.insertionSortCounter500n+=2;
                    if (size == 2500) SearchingAlgorithms.insertionSortCounter2500n+=2;
                    if (size == 12500) SearchingAlgorithms.insertionSortCounter12500n+=2;
                    if (size == 62500) SearchingAlgorithms.insertionSortCounter62500n+=2;
                }
                if (type == 'r'){
                    if (size == 500) SearchingAlgorithms.insertionSortCounter500r+=2;
                    if (size == 2500) SearchingAlgorithms.insertionSortCounter2500r+=2;
                    if (size == 12500) SearchingAlgorithms.insertionSortCounter12500r+=2;
                    if (size == 62500) SearchingAlgorithms.insertionSortCounter62500r+=2;
                }
                if (type == 't'){
                    if (size == 500) SearchingAlgorithms.insertionSortCounter500t+=2;
                    if (size == 2500) SearchingAlgorithms.insertionSortCounter2500t+=2;
                    if (size == 12500) SearchingAlgorithms.insertionSortCounter12500t+=2;
                    if (size == 62500) SearchingAlgorithms.insertionSortCounter62500t+=2;
                }
                }
            
            else{   
           
           ///only account for the comparisons...     
            if (type == 'n'){
                if (size == 500) SearchingAlgorithms.insertionSortCounter500n+=1;
                if (size == 2500) SearchingAlgorithms.insertionSortCounter2500n+=1;
                if (size == 12500) SearchingAlgorithms.insertionSortCounter12500n+=1;
                if (size == 62500) SearchingAlgorithms.insertionSortCounter62500n+=1;
            }
            if (type == 'r'){
                if (size == 500) SearchingAlgorithms.insertionSortCounter500r+=1;
                if (size == 2500) SearchingAlgorithms.insertionSortCounter2500r+=1;
                if (size == 12500) SearchingAlgorithms.insertionSortCounter12500r+=1;
                if (size == 62500) SearchingAlgorithms.insertionSortCounter62500r+=1;
            }
            if (type == 't'){
                if (size == 500) SearchingAlgorithms.insertionSortCounter500t+=1;
                if (size == 2500) SearchingAlgorithms.insertionSortCounter2500t+=1;
                if (size == 12500) SearchingAlgorithms.insertionSortCounter12500t+=1;
                if (size == 62500) SearchingAlgorithms.insertionSortCounter62500t+=1;
            }
          }   
        }
       }
               
       return array;
        
    }   
    
}

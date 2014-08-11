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
public class BubbleSort {
    
    public int[] sortArray(int[] array, int size, char type){
        
        for (int j = 0; j < array.length;j++){
            for (int f = 0; f < array.length-1; f++){
                          
             if (array[f] > array[f+1]){     //comparison
                   
                 int temp = array[f];        //one swapp
                   array[f] = array[f+1];
                   array[f+1] = temp;
                    
                    if (type == 'n'){
                        if (size == 500) SearchingAlgorithms.bubbleSortCounter500n+=2;
                        if (size == 2500) SearchingAlgorithms.bubbleSortCounter2500n+=2;
                        if (size == 12500) SearchingAlgorithms.bubbleSortCounter12500n+=2;
                        if (size == 62500) SearchingAlgorithms.bubbleSortCounter62500n+=2;
                    }
                    else if (type == 'r'){
                        if (size == 500) SearchingAlgorithms.bubbleSortCounter500r+=2;
                        if (size == 2500) SearchingAlgorithms.bubbleSortCounter2500r+=2;
                        if (size == 12500) SearchingAlgorithms.bubbleSortCounter12500r+=2;
                        if (size == 62500) SearchingAlgorithms.bubbleSortCounter62500r+=2;
                    }
                    else if (type == 't'){
                        if (size == 500) SearchingAlgorithms.bubbleSortCounter500t+=2;
                        if (size == 2500) SearchingAlgorithms.bubbleSortCounter2500t+=2;
                        if (size == 12500) SearchingAlgorithms.bubbleSortCounter12500t+=2;
                        if (size == 62500) SearchingAlgorithms.bubbleSortCounter62500t+=2;
                    }
                }
             else {                 
                if (type == 'n'){
                    if (size == 500) SearchingAlgorithms.bubbleSortCounter500n++;
                    if (size == 2500) SearchingAlgorithms.bubbleSortCounter2500n++;
                    if (size == 12500) SearchingAlgorithms.bubbleSortCounter12500n++;
                    if (size == 62500) SearchingAlgorithms.bubbleSortCounter62500n++;
                }
                else if (type == 'r'){
                    if (size == 500) SearchingAlgorithms.bubbleSortCounter500r++;
                    if (size == 2500) SearchingAlgorithms.bubbleSortCounter2500r++;
                    if (size == 12500) SearchingAlgorithms.bubbleSortCounter12500r++;
                    if (size == 62500) SearchingAlgorithms.bubbleSortCounter62500r++;
                }
                else if (type == 't'){
                    if (size == 500) SearchingAlgorithms.bubbleSortCounter500t++;
                    if (size == 2500) SearchingAlgorithms.bubbleSortCounter2500t++;
                    if (size == 12500) SearchingAlgorithms.bubbleSortCounter12500t++;
                    if (size == 62500) SearchingAlgorithms.bubbleSortCounter62500t++;
                }            
                 
             }
            
              }
            }
        return array;    
        }
        
}
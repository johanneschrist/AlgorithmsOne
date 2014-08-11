/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package searchingalgorithms;

import javax.swing.JOptionPane;

/**
 *
 * @author Pavilion
 */
public class SelectionSort {
    
    
    public int[] sortArray(int[] array, int size, char type){
        char type2 = type;
                    
            for (int j = 0; j < array.length; j++){
            
                int min = j;
            
            if (type == 'n'){
                if (size == 500) SearchingAlgorithms.selectionSortCounter500n+=1;
                if (size == 2500) SearchingAlgorithms.selectionSortCounter2500n+=1;
                if (size == 12500) SearchingAlgorithms.selectionSortCounter12500n+=1;
                if (size == 62500) SearchingAlgorithms.selectionSortCounter62500n+=1;
                
            }
            else if (type == 'r'){
                if (size == 500) SearchingAlgorithms.selectionSortCounter500r+=1;
                if (size == 2500) SearchingAlgorithms.selectionSortCounter2500r+=1;
                if (size == 12500) SearchingAlgorithms.selectionSortCounter12500r+=1;
                if (size == 62500) SearchingAlgorithms.selectionSortCounter62500r+=1;
            }
            else if (type == 't'){
                if (size == 500) SearchingAlgorithms.selectionSortCounter500t+=1;
                if (size == 2500) SearchingAlgorithms.selectionSortCounter2500t+=1;
                if (size == 12500) SearchingAlgorithms.selectionSortCounter12500t+=1;
                if (size == 62500) SearchingAlgorithms.selectionSortCounter62500t+=1;
            }
                         
            for (int h = j; h < array.length; h++){
                                    
                if (array[min] > array[h]){
                    min = h; ///account for the comparisons and assignments..                     
                    char typeme = type;
                    //JOptionPane.showMessageDialog(null, typeme);
                  
                    if (typeme == 'n'){                              
                        //JOptionPane.showMessageDialog(null, "i am here 222");                        
                        if (size == 500){ SearchingAlgorithms.selectionSortCounter500n+=2;}
                        if (size == 2500){ SearchingAlgorithms.selectionSortCounter2500n+=2;}
                        if (size == 12500){ SearchingAlgorithms.selectionSortCounter12500n+=2;}
                        if (size == 62500){ SearchingAlgorithms.selectionSortCounter62500n+=2;}
                        }                    
                    else if (typeme == 'r'){
                       /// JOptionPane.showMessageDialog(null, "i am here 222");
                        if (size == 500) SearchingAlgorithms.selectionSortCounter500r+=2;
                        if (size == 2500) SearchingAlgorithms.selectionSortCounter2500r+=2;
                        if (size == 12500) SearchingAlgorithms.selectionSortCounter12500r+=2;
                        if (size == 62500) SearchingAlgorithms.selectionSortCounter62500r+=2;                    }
                    else {
                        //JOptionPane.showMessageDialog(null, "i am here 222");
                        if (size == 500) SearchingAlgorithms.selectionSortCounter500t+=2;
                        if (size == 2500) SearchingAlgorithms.selectionSortCounter2500t+=2;
                        if (size == 12500) SearchingAlgorithms.selectionSortCounter12500t+=2;
                        if (size == 62500) SearchingAlgorithms.selectionSortCounter62500t+=2;
                    }
                }
                                       
                else{
                   //only account for the comparisons...
                   
                if (type == 'n'){
                     //JOptionPane.showMessageDialog(null, "i am here");
                if (size == 500) SearchingAlgorithms.selectionSortCounter500n+=1;
                if (size == 2500) SearchingAlgorithms.selectionSortCounter2500n+=1;
                if (size == 12500) SearchingAlgorithms.selectionSortCounter12500n+=1;
                if (size == 62500) SearchingAlgorithms.selectionSortCounter62500n+=1;
            }
             if (type == 'r'){
                if (size == 500) SearchingAlgorithms.selectionSortCounter500r+=1;
                if (size == 2500) SearchingAlgorithms.selectionSortCounter2500r+=1;
                if (size == 12500) SearchingAlgorithms.selectionSortCounter12500r+=1;
                if (size == 62500) SearchingAlgorithms.selectionSortCounter62500r+=1;
            }
              if (type == 't'){
                if (size == 500) SearchingAlgorithms.selectionSortCounter500t+=1;
                if (size == 2500) SearchingAlgorithms.selectionSortCounter2500t+=1;
                if (size == 12500) SearchingAlgorithms.selectionSortCounter12500t+=1;
                if (size == 62500) SearchingAlgorithms.selectionSortCounter62500t+=1;
            }                 
                    
                }
             }
             int temp = array[j];
             array[j] = array[min];
             array[min] = temp; 
             ///account for the swaps...
           if (type == 'n'){
               //JOptionPane.showMessageDialog(null, "i am here");
                if (size == 500) SearchingAlgorithms.selectionSortCounter500n+=1;
                if (size == 2500) SearchingAlgorithms.selectionSortCounter2500n+=1;
                if (size == 12500) SearchingAlgorithms.selectionSortCounter12500n+=1;
                if (size == 62500) SearchingAlgorithms.selectionSortCounter62500n+=1;
            }
             if (type == 'r'){
                if (size == 500) SearchingAlgorithms.selectionSortCounter500r+=1;
                if (size == 2500) SearchingAlgorithms.selectionSortCounter2500r+=1;
                if (size == 12500) SearchingAlgorithms.selectionSortCounter12500r+=1;
                if (size == 62500) SearchingAlgorithms.selectionSortCounter62500r+=1;
            }
              if (type == 't'){
                if (size == 500) SearchingAlgorithms.selectionSortCounter500t+=1;
                if (size == 2500) SearchingAlgorithms.selectionSortCounter2500t+=1;
                if (size == 12500) SearchingAlgorithms.selectionSortCounter12500t+=1;
                if (size == 62500) SearchingAlgorithms.selectionSortCounter62500t+=1;
            }
         }    
    return array;
    }
    
    
}

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
public class SequentialSearch {
    
    
    public int searchArray(int[] array, int numberForSearch, char type){
        
//        int numberForSearch = 0;
//          int key = 0;
//        
//        if (key > 499) { numberForSearch = 1000000;}
//        else if (key > 2499) { numberForSearch = 1000000;}
//        else if (key > 12499) { numberForSearch = 1000000;}
//        else if (key > 62499) { numberForSearch = 1000000;}
//        
//        else  {numberForSearch = array[key];}
        
        int size = array.length;
        for (int j = 0; j < array.length-1; j++){
            
            if (type == 'n'){
             if (size == 500) SearchingAlgorithms.seqSearchCounter500n+=1;
             if (size == 2500) SearchingAlgorithms.seqSearchCounter2500n+=1;
             if (size == 12500) SearchingAlgorithms.seqSearchCounter12500n+=1;
             if (size == 62500) SearchingAlgorithms.seqSearchCounter62500n+=1;
            }    
            
            if (type == 'o'){
             if (size == 500) SearchingAlgorithms.ord_seqSearchCounter500o+=1;
             if (size == 2500) SearchingAlgorithms.ord_seqSearchCounter2500o+=1;
             if (size == 12500) SearchingAlgorithms.ord_seqSearchCounter12500o+=1;
             if (size == 62500) SearchingAlgorithms.ord_seqSearchCounter62500o+=1;
            } 
            
            if( array[j] == numberForSearch){
                return j;
   
            }
        }
            
        return -1;
    }
}

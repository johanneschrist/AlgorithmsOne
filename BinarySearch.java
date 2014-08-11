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
public class BinarySearch {
    //int init = 0;
    String result;
    int n = 0;
    public String bsearch(int[] array, int initIndex, int lenghtArray, int key){
        n++;
        JOptionPane.showMessageDialog(null,"recursion was done " + n + " times" );
        if (array[lenghtArray/2] == key){ 
            result = "The key " + key + " was found at position " + lenghtArray/2;
            return result;
        }
        else if (key > array[lenghtArray/2] && lenghtArray != 0) //search on right
            bsearch (array, ((lenghtArray/2) + 1), lenghtArray, key );
        else if (key < array[lenghtArray/2] && lenghtArray != 0) //search on left
            bsearch (array, 0, lenghtArray/2, key);
        else{
            result =  "The key " + key + " was not found";}
        return result;
        
    }    
}

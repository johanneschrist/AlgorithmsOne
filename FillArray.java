/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package searchingalgorithms;

import java.util.Random;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

/**
 *
 * @author Pavilion
 */
public class FillArray {
    
    Random generator = new Random();
    String showArray;
    
    public int[] fillArray(int size){
    
    int[] array = new int[size];
    
   // JOptionPane.showMessageDialog(null, "Size inside Fillaray is " + size);
    
    for (int index = 0; index < size; index++){
    
        ///JOptionPane.showMessageDialog(null, "I am in the loop");
        
        array[index] = generator.nextInt(1000000);
        
        //JOptionPane.showMessageDialog(null, "array elemts: " + array[index]);
        
        //if (!showArray.equals("")) 
            //showArray = showArray + array[index] + " ";
        //else showArray = array[index] + " ";
    
    }
    
    //JOptionPane.showMessageDialog(null, "Array unsorted is: " + showArray);
    return array;
}
 
    
} 
    
    
    


package searchingalgorithms;

//the purpose of this class is to remove 20% of inversions on the array...

import java.util.Arrays;


public class BubbleS20 {
    
    public int[] sortArray(int [] myArray){
        
        int[] array = new int[myArray.length];
        System.arraycopy(myArray, 0, array, 0, array.length);       
        
        int[] subarray = new int[array.length/5];
        int index = 0;
                   
       for (int h = 0; h < ((array.length)); h+=((array.length)/(array.length/5))){ ///this means that it will only pass 20% of N
           subarray[index] = array[h];
           index++;
       }
       
       Arrays.sort(subarray);
       index = 0;
       
       for (int h = 0; h < ((array.length)); h+=((array.length)/(array.length/5))){ ///this means that it will only pass 20% of N
           array[h] = subarray[index];
           index++;
       }
                  
     return array;    
}
}
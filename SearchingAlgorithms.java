package searchingalgorithms;

import javax.swing.JOptionPane;
import java.util.Random;

public class SearchingAlgorithms {
    
    ////Operation Count variables...////
    
    static double selectionSortCounter500n = 0;
    static double selectionSortCounter2500n = 0;
    static double selectionSortCounter12500n = 0;
    static double selectionSortCounter62500n = 0;    
    static double selectionSortCounter500r = 0;
    static double selectionSortCounter2500r = 0;
    static double selectionSortCounter12500r = 0;
    static double selectionSortCounter62500r = 0;  
    static double selectionSortCounter500t = 0;
    static double selectionSortCounter2500t = 0;
    static double selectionSortCounter12500t = 0;
    static double selectionSortCounter62500t = 0;  
        
    static double insertionSortCounter500n = 0;
    static double insertionSortCounter2500n = 0;
    static double insertionSortCounter12500n = 0;
    static double insertionSortCounter62500n = 0; 
    static double insertionSortCounter500r = 0;
    static double insertionSortCounter2500r = 0;
    static double insertionSortCounter12500r = 0;
    static double insertionSortCounter62500r = 0; 
    static double insertionSortCounter500t = 0;
    static double insertionSortCounter2500t = 0;
    static double insertionSortCounter12500t = 0;
    static double insertionSortCounter62500t = 0; 
    
    static double bubbleSortCounter500n = 0;
    static double bubbleSortCounter2500n = 0;
    static double bubbleSortCounter12500n = 0;
    static double bubbleSortCounter62500n = 0;
    static double bubbleSortCounter500r = 0;
    static double bubbleSortCounter2500r = 0;
    static double bubbleSortCounter12500r = 0;
    static double bubbleSortCounter62500r = 0;
    static double bubbleSortCounter500t = 0;
    static double bubbleSortCounter2500t = 0;
    static double bubbleSortCounter12500t = 0;
    static double bubbleSortCounter62500t = 0;
    
    static double ad_bubbleSortCounter500n = 0;
    static double ad_bubbleSortCounter2500n = 0;
    static double ad_bubbleSortCounter12500n = 0;
    static double ad_bubbleSortCounter62500n = 0;
    static double ad_bubbleSortCounter500r = 0;
    static double ad_bubbleSortCounter2500r = 0;
    static double ad_bubbleSortCounter12500r = 0;
    static double ad_bubbleSortCounter62500r = 0;
    static double ad_bubbleSortCounter500t = 0;
    static double ad_bubbleSortCounter2500t = 0;
    static double ad_bubbleSortCounter12500t = 0;
    static double ad_bubbleSortCounter62500t = 0;
    
    static double seqSearchCounter500n = 0;
    static double seqSearchCounter2500n = 0;
    static double seqSearchCounter12500n = 0;   
    static double seqSearchCounter62500n = 0;
    static double seqSearchCounter500r = 0;
    static double seqSearchCounter2500r = 0;
    static double seqSearchCounter12500r = 0;   
    static double seqSearchCounter62500r = 0;
    static double seqSearchCounter500t = 0;
    static double seqSearchCounter2500t = 0;
    static double seqSearchCounter12500t = 0;   
    static double seqSearchCounter62500t = 0; 
    
    static double ord_seqSearchCounter500o = 0;
    static double ord_seqSearchCounter2500o = 0;
    static double ord_seqSearchCounter12500o = 0;
    static double ord_seqSearchCounter62500o = 0;
    static double ord_seqSearchCounter500r = 0;
    static double ord_seqSearchCounter2500nr = 0;
    static double ord_seqSearchCounter12500r = 0;
    static double ord_seqSearchCounter62500nr = 0;
    static double ord_seqSearchCounter500t = 0;
    static double ord_seqSearchCounter2500t = 0;
    static double ord_seqSearchCounter12500nt = 0;
    static double ord_seqSearchCounter62500t = 0;
    
    static double adap1_seqSearchCounter500n = 0;
    static double adap1_seqSearchCounter2500n = 0;
    static double adap1_seqSearchCounter12500n = 0;
    static double adap1_seqSearchCounter62500n = 0;
    static double adap1_seqSearchCounter500r = 0;
    static double adap1_seqSearchCounter2500r = 0;
    static double adap1_seqSearchCounter12500r = 0;
    static double adap1_seqSearchCounter62500r = 0;
    static double adap1_seqSearchCounter500t = 0;
    static double adap1_seqSearchCounter2500t = 0;
    static double adap1_seqSearchCounter12500t = 0;
    static double adap1_seqSearchCounter62500t = 0;
    
    static double adap2_seqSearchCounter500n = 0;
    static double adap2_seqSearchCounter2500n = 0;
    static double adap2_seqSearchCounter12500n = 0;
    static double adap2_seqSearchCounter62500n = 0;
    static double adap2_seqSearchCounter500r = 0;
    static double adap2_seqSearchCounter2500r = 0;
    static double adap2_seqSearchCounter12500r = 0;
    static double adap2_seqSearchCounter62500r = 0;
    static double adap2_seqSearchCounter500t = 0;
    static double adap2_seqSearchCounter2500t = 0;
    static double adap2_seqSearchCounter12500t = 0;
    static double adap2_seqSearchCounter62500t = 0;
       
    public static void main(String[] args) {
        
    FillArray arrayGenerator = new FillArray();
    ReverseArray reversor = new ReverseArray();
    BubbleS20 sortTwenty = new BubbleS20();
    OrderedArray orderSeq = new OrderedArray();
    InsertionSort iSort = new InsertionSort();
    SelectionSort sSort = new SelectionSort();
    BubbleSort dSort = new BubbleSort();
    ABubbleSort adSort = new ABubbleSort();    
    SequentialSearch sSearch = new SequentialSearch();
    AdaptiveSeqSearch1 as1Search = new AdaptiveSeqSearch1();
    AdaptiveSeqSearch2 as2Search = new AdaptiveSeqSearch2();
    
    
    int[] array500original  = arrayGenerator.fillArray(500);
       
    int[] array500in = new int[array500original.length]; // = array500original; //making sure all arrays are equal for each method;
            System.arraycopy(array500original, 0, array500in, 0, array500in.length);
    int[] array500sn = new int[array500original.length]; // = array500original;
            System.arraycopy(array500original, 0, array500sn, 0, array500in.length);
    int[] array500dn= new int[array500original.length]; // = array500original;
            System.arraycopy(array500original, 0, array500dn, 0, array500in.length);
    int[] array500adn= new int[array500original.length];// = array500original; 
            System.arraycopy(array500original, 0, array500adn, 0, array500in.length);   
    int[] array500ir = reversor.reverseArray(array500original); 
    int[] array500sr = reversor.reverseArray(array500original);
    int[] array500dr = reversor.reverseArray(array500original);
    int[] array500adr = reversor.reverseArray(array500original);
    int[] array500it = sortTwenty.sortArray(array500original);
    int[] array500st = sortTwenty.sortArray(array500sn); 
    int[] array500dt = sortTwenty.sortArray(array500original); 
    int[] array500adt = sortTwenty.sortArray(array500original);    
    int[] array500sq = new int[array500original.length];
            System.arraycopy(array500original, 0, array500sq, 0, array500in.length);            
    int[] array500sqo = new int[500];                
            System.arraycopy(array500original, 0, array500sqo, 0, array500in.length);
            orderSeq.orderArray(array500sqo);
    int[] array500asq1 = new int[500];
            System.arraycopy(array500original, 0, array500asq1, 0, array500in.length);
    int[] array500asq2 = new int[500];
            System.arraycopy(array500original, 0, array500asq2, 0, array500in.length);
    
    
    final int[] array2500b = arrayGenerator.fillArray(2500);
    int[] array2500in = new int[array2500b.length]; // = array500original; //making sure all arrays are equal for each method;
            System.arraycopy(array2500b, 0, array2500in, 0, array2500in.length);
    int[] array2500sn = new int[array2500b.length]; // = array500original;
            System.arraycopy(array2500b, 0, array2500sn, 0, array2500in.length);
    int[] array2500dn= new int[array2500b.length]; // = array500original;
            System.arraycopy(array2500b, 0, array2500dn, 0, array2500in.length);
    int[] array2500adn= new int[array2500b.length];// = array500original; 
            System.arraycopy(array2500b, 0, array2500adn, 0, array2500in.length); 
            
    int[] array2500ir = reversor.reverseArray(array2500b); 
    int[] array2500sr = reversor.reverseArray(array2500b); 
    int[] array2500dr = reversor.reverseArray(array2500b); 
    int[] array2500adr = reversor.reverseArray(array2500b); 
    int[] array2500it = sortTwenty.sortArray(array2500b); 
    int[] array2500st = sortTwenty.sortArray(array2500b);
    int[] array2500dt = sortTwenty.sortArray(array2500b);
    int[] array2500adt = sortTwenty.sortArray(array2500b);  
    
    int[] array2500sq = new int[array2500b.length];
            System.arraycopy(array2500b, 0, array2500sq, 0, array2500in.length);            
    int[] array2500sqo = new int[2500];                
            System.arraycopy(array2500b, 0, array2500sqo, 0, array2500in.length);
            orderSeq.orderArray(array2500sqo);
    int[] array2500asq1 = new int[2500];
            System.arraycopy(array2500b, 0, array2500asq1, 0, array2500in.length);
    int[] array2500asq2 = new int[2500];
            System.arraycopy(array2500b, 0, array2500asq2, 0, array2500in.length);
    
    final int[] array12500b = arrayGenerator.fillArray(12500);
    int[] array12500in = new int[array12500b.length]; // = array500original; //making sure all arrays are equal for each method;
            System.arraycopy(array12500b, 0, array12500in, 0, array12500in.length);
    int[] array12500sn = new int[array12500b.length]; // = array500original;
            System.arraycopy(array12500b, 0, array12500sn, 0, array12500in.length);
    int[] array12500dn= new int[array12500b.length]; // = array500original;
            System.arraycopy(array12500b, 0, array12500dn, 0, array12500in.length);
    int[] array12500adn= new int[array12500b.length];// = array500original; 
            System.arraycopy(array12500b, 0, array12500adn, 0, array12500in.length); 
    int[] array12500ir = reversor.reverseArray(array12500b); 
    int[] array12500sr = reversor.reverseArray(array12500b); 
    int[] array12500dr = reversor.reverseArray(array12500b); 
    int[] array12500adr = reversor.reverseArray(array12500b); 
    int[] array12500it = sortTwenty.sortArray(array12500b); 
    int[] array12500st = sortTwenty.sortArray(array12500b);
    int[] array12500dt = sortTwenty.sortArray(array12500b);
    int[] array12500adt = sortTwenty.sortArray(array12500b);
     int[] array12500sq = new int[array12500b.length];
            System.arraycopy(array12500b, 0, array12500sq, 0, array12500in.length);            
    int[] array12500sqo = new int[12500];                
            System.arraycopy(array12500b, 0, array12500sqo, 0, array12500in.length);
            orderSeq.orderArray(array12500sqo);
    int[] array12500asq1 = new int[12500];
            System.arraycopy(array12500b, 0, array12500asq1, 0, array12500in.length);
    int[] array12500asq2 = new int[12500];
            System.arraycopy(array12500b, 0, array12500asq2, 0, array12500in.length);
    
    final int[] array62500b = arrayGenerator.fillArray(62500);
    int[] array62500in = new int[array62500b.length]; // = array500original; //making sure all arrays are equal for each method;
            System.arraycopy(array62500b, 0, array62500in, 0, array62500in.length);
    int[] array62500sn = new int[array62500b.length]; // = array500original;
            System.arraycopy(array62500b, 0, array62500sn, 0, array62500in.length);
    int[] array62500dn= new int[array62500b.length]; // = array500original;
            System.arraycopy(array62500b, 0, array62500dn, 0, array62500in.length);
    int[] array62500adn= new int[array62500b.length];// = array500original; 
            System.arraycopy(array62500b, 0, array62500adn, 0, array62500in.length);             
    int[] array62500ir = reversor.reverseArray(array62500b); 
    int[] array62500sr = reversor.reverseArray(array62500b);
    int[] array62500dr = reversor.reverseArray(array62500b);
    int[] array62500adr = reversor.reverseArray(array62500b);
    int[] array62500it = sortTwenty.sortArray(array62500b);
    int[] array62500st = sortTwenty.sortArray(array62500b);
    int[] array62500dt = sortTwenty.sortArray(array62500b);
    int[] array62500adt = sortTwenty.sortArray(array62500b);     
     int[] array62500sq = new int[array62500b.length];
            System.arraycopy(array62500b, 0, array62500sq, 0, array62500in.length);            
    int[] array62500sqo = new int[62500];                
            System.arraycopy(array62500b, 0, array62500sqo, 0, array62500in.length);
            orderSeq.orderArray(array62500sqo);
    int[] array62500asq1 = new int[62500];
            System.arraycopy(array62500b, 0, array62500asq1, 0, array62500in.length);
    int[] array62500asq2 = new int[62500];
            System.arraycopy(array2500b, 0, array2500asq2, 0, array2500in.length);
        
    
    sSort.sortArray(array500sn, 500, 'n'); 
    sSort.sortArray(array2500sn, 2500, 'n');
    sSort.sortArray(array12500sn, 12500, 'n');
    sSort.sortArray(array62500sn, 62500, 'n');
    sSort.sortArray(array500sr, 500, 'r'); 
    sSort.sortArray(array2500sr, 2500, 'r');                //Selection Sort
    sSort.sortArray(array12500sr, 12500, 'r');
    sSort.sortArray(array62500sr, 62500, 'r');
    sSort.sortArray(array500st, 500, 't'); 
    sSort.sortArray(array2500st, 2500, 't');
    sSort.sortArray(array12500st, 12500, 't');
    sSort.sortArray(array62500st, 62500, 't');
    
    iSort.sortArray(array500in, 500, 'n');
    iSort.sortArray(array2500in, 2500, 'n');
    iSort.sortArray(array12500in, 12500, 'n');
    iSort.sortArray(array62500in, 62500, 'n');
    iSort.sortArray(array500ir, 500, 'r');
    iSort.sortArray(array2500ir, 2500, 'r');                //Insertion Sort
    iSort.sortArray(array12500ir, 12500, 'r');
    iSort.sortArray(array62500ir, 62500, 'r');
    iSort.sortArray(array500it, 500, 't');
    iSort.sortArray(array2500it, 2500, 't');
    iSort.sortArray(array12500it, 12500, 't');
    iSort.sortArray(array62500it, 62500, 't');
    
    dSort.sortArray(array500dn, 500, 'n');
    dSort.sortArray(array2500dn, 2500,'n');
    dSort.sortArray(array12500dn, 12500,'n');
    dSort.sortArray(array62500dn, 62500,'n');
    dSort.sortArray(array500dr, 500, 'r');                  //Bubble Sort
    dSort.sortArray(array2500dr, 2500, 'r');
    dSort.sortArray(array12500dr, 12500, 'r');
    dSort.sortArray(array62500dr, 62500, 'r');
    dSort.sortArray(array500dt, 500, 't');
    dSort.sortArray(array2500dt, 2500, 't');
    dSort.sortArray(array12500dt, 12500, 't');
    dSort.sortArray(array62500dt, 62500, 't');
    
    adSort.sortArray(array500adn, 500, 'n');
    adSort.sortArray(array2500adn, 2500, 'n');
    adSort.sortArray(array12500adn, 12500, 'n');
    adSort.sortArray(array62500adn, 62500, 'n');
    adSort.sortArray(array500adr, 500, 'r');
    adSort.sortArray(array2500adr, 2500, 'r');              //Adaptive Bubble
    adSort.sortArray(array12500adr, 12500, 'r');
    adSort.sortArray(array62500adr, 62500, 'r');
    adSort.sortArray(array500adt, 500, 't');
    adSort.sortArray(array2500adt, 2500, 't');
    adSort.sortArray(array12500adt, 12500, 't');
    adSort.sortArray(array62500adt, 62500, 't');
    
    
    sSearch.searchArray(array500sq, 500, 'n');
    sSearch.searchArray(array2500sq, 2500, 'n');            // Sequential Search
    sSearch.searchArray(array12500sq, 12500, 'n');
    sSearch.searchArray(array62500sq, 62500, 'n');
    
    sSearch.searchArray(array500sqo, 500, 'o');             // Ordered Seq Search
    sSearch.searchArray(array2500sqo, 2500, 'o');
    sSearch.searchArray(array12500sqo, 12500, 'o');
    sSearch.searchArray(array62500sqo, 62500, 'o');
    
    as1Search.searchArray(array500asq1, 500, 'n');           // Adaptive Seq Search
    as1Search.searchArray(array2500asq1, 2500, 'n');
    as1Search.searchArray(array12500asq1, 12500, 'n');
    as1Search.searchArray(array62500asq1, 62500, 'n');
    
    as2Search.searchArray(array500asq2, 500, 'n');           // Adaptive Seq Search
    as2Search.searchArray(array2500asq2, 2500, 'n');
    as2Search.searchArray(array12500asq2, 12500, 'n');
    as2Search.searchArray(array62500asq2, 62500, 'n');
    
    
    
    /////////Finding Random Number in array sizes
    Random randomForSearch = new Random();
    int numberForSearch1 = array500sq[randomForSearch.nextInt(500)];            //Random num search for Seq Search
    int numberForSearch2 = array2500sq[randomForSearch.nextInt(2500)];
    int numberForSearch3 = array12500sq[randomForSearch.nextInt(12500)];
    int numberForSearch4 = array62500sq[randomForSearch.nextInt(62500)];
    
    int numberForSearch5 = array500sqo[randomForSearch.nextInt(500)];           //Random num search for Ordered Seq Search
    int numberForSearch6 = array2500sqo[randomForSearch.nextInt(2500)];
    int numberForSearch7 = array12500sqo[randomForSearch.nextInt(12500)];
    int numberForSearch8 = array62500sqo[randomForSearch.nextInt(62500)];
    
    
    int position1 = sSearch.searchArray(array500sq, numberForSearch1, 'n');     //Index position in Seq Search
    int position2 = sSearch.searchArray(array2500sq, numberForSearch2, 'n');
    int position3 = sSearch.searchArray(array12500sq, numberForSearch3, 'n');
    int position4 = sSearch.searchArray(array62500sq, numberForSearch4, 'n');
    
    int position5 = sSearch.searchArray(array500sqo, numberForSearch5, 'o');    //Index position in Ordered Seq Search
    int position6 = sSearch.searchArray(array2500sqo, numberForSearch6, 'o');
    int position7 = sSearch.searchArray(array12500sqo, numberForSearch7, 'o');
    int position8 = sSearch.searchArray(array62500sqo, numberForSearch8, 'o');
//    
//    
//    JOptionPane.showMessageDialog(null, "The key for number " + numberForSearch1 + " was found at position " + position1);
//    JOptionPane.showMessageDialog(null, "The key for number " + numberForSearch2 + " was found at position " + position2);
//    JOptionPane.showMessageDialog(null, "The key for number " + numberForSearch3 + " was found at position " + position3);
//    JOptionPane.showMessageDialog(null, "The key for number " + numberForSearch4 + " was found at position " + position4);
//    
//    JOptionPane.showMessageDialog(null, "The key for number " + numberForSearch5 + " was found at position " + position5);
//    JOptionPane.showMessageDialog(null, "The key for number " + numberForSearch6 + " was found at position " + position6);
//    JOptionPane.showMessageDialog(null, "The key for number " + numberForSearch7 + " was found at position " + position7);
//    JOptionPane.showMessageDialog(null, "The key for number " + numberForSearch8 + " was found at position " + position8);
//  
    Report.createAndShowGUI();
    
    }
         
}

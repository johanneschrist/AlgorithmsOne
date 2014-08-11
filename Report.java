/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

package searchingalgorithms;

/*
 * SimpleTableDemo.java requires no other files.
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Report extends JPanel {
    private boolean DEBUG = false;

    public Report() {
        super(new GridLayout(1,0));

        String[] columnNames = {"Algorithm Name",
                                "500",
                                "2,500",
                                "12,500",
                                "62,500",};

        Object[][] data = {
	    {"Bubble Sort Random", new Double(SearchingAlgorithms.bubbleSortCounter500n),	     new Double(SearchingAlgorithms.bubbleSortCounter2500n), new Double(SearchingAlgorithms.bubbleSortCounter12500n), new Double(SearchingAlgorithms.bubbleSortCounter62500n)},
	    {"Bubble Sort Reverse Order", new Double(SearchingAlgorithms.bubbleSortCounter500r),	     new Double(SearchingAlgorithms.bubbleSortCounter2500r), new Double(SearchingAlgorithms.bubbleSortCounter12500r), new Double(SearchingAlgorithms.bubbleSortCounter62500r)},
            {"Bubble Sort 20% sorted", new Double(SearchingAlgorithms.bubbleSortCounter500t),	     new Double(SearchingAlgorithms.bubbleSortCounter2500t), new Double(SearchingAlgorithms.bubbleSortCounter12500t), new Double(SearchingAlgorithms.bubbleSortCounter62500t)},
            
            {"Adaptive Bubble Sort Random", new Double(SearchingAlgorithms.ad_bubbleSortCounter500n),	     new Double(SearchingAlgorithms.ad_bubbleSortCounter2500n), new Double(SearchingAlgorithms.ad_bubbleSortCounter12500n), new Double(SearchingAlgorithms.ad_bubbleSortCounter62500n)},
            {"Adaptive Bubble Sort Reverse", new Double(SearchingAlgorithms.ad_bubbleSortCounter500r),	     new Double(SearchingAlgorithms.ad_bubbleSortCounter2500r), new Double(SearchingAlgorithms.ad_bubbleSortCounter12500r), new Double(SearchingAlgorithms.ad_bubbleSortCounter62500r)},
            {"Adaptive Bubble Sort 20% sorted", new Double(SearchingAlgorithms.ad_bubbleSortCounter500t),	     new Double(SearchingAlgorithms.ad_bubbleSortCounter2500t), new Double(SearchingAlgorithms.ad_bubbleSortCounter12500t), new Double(SearchingAlgorithms.ad_bubbleSortCounter62500t)},
           
            {"Insertion Sort Random", new Double(SearchingAlgorithms.insertionSortCounter500n),	     new Double(SearchingAlgorithms.insertionSortCounter2500n), new Double(SearchingAlgorithms.insertionSortCounter12500n), new Double(SearchingAlgorithms.insertionSortCounter62500n)},
            {"Insertion Sort Reverse", new Double(SearchingAlgorithms.insertionSortCounter500r),	     new Double(SearchingAlgorithms.insertionSortCounter2500r), new Double(SearchingAlgorithms.insertionSortCounter12500r), new Double(SearchingAlgorithms.insertionSortCounter62500r)},
            {"Insertion Sort 20% sorted", new Double(SearchingAlgorithms.insertionSortCounter500t),	     new Double(SearchingAlgorithms.insertionSortCounter2500t), new Double(SearchingAlgorithms.insertionSortCounter12500t), new Double(SearchingAlgorithms.insertionSortCounter62500t)},
            	    
            {"Selection Sort Random", new Double(SearchingAlgorithms.selectionSortCounter500n),   new Double(SearchingAlgorithms.selectionSortCounter2500n), new Double(SearchingAlgorithms.selectionSortCounter12500n), new Double(SearchingAlgorithms.selectionSortCounter62500n)},
            {"Selection Sort Reverse", new Double(SearchingAlgorithms.selectionSortCounter500r),   new Double(SearchingAlgorithms.selectionSortCounter2500r), new Double(SearchingAlgorithms.selectionSortCounter12500r), new Double(SearchingAlgorithms.selectionSortCounter62500r)},
            {"Selection Sort 20% sorted", new Double(SearchingAlgorithms.selectionSortCounter500t),   new Double(SearchingAlgorithms.selectionSortCounter2500t), new Double(SearchingAlgorithms.selectionSortCounter12500t), new Double(SearchingAlgorithms.selectionSortCounter62500t)},
	    
            {"Sequential Search", new Double(SearchingAlgorithms.seqSearchCounter500n),	     new Double(SearchingAlgorithms.seqSearchCounter2500n), new Double(SearchingAlgorithms.seqSearchCounter12500n), new Double(SearchingAlgorithms.seqSearchCounter62500n)},
            {"Ordered Sequential Search", new Double(SearchingAlgorithms.ord_seqSearchCounter500o),	     new Double(SearchingAlgorithms.ord_seqSearchCounter2500o), new Double(SearchingAlgorithms.ord_seqSearchCounter12500o), new Double(SearchingAlgorithms.ord_seqSearchCounter62500o)},
            {"Adaptive Sequential Search 1", new Double(SearchingAlgorithms.adap1_seqSearchCounter500n),	     new Double(SearchingAlgorithms.adap1_seqSearchCounter2500n), new Double(SearchingAlgorithms.adap1_seqSearchCounter12500n), new Double(SearchingAlgorithms.adap1_seqSearchCounter62500n)},
            {"Adaptive Sequential Search 2", new Double(SearchingAlgorithms.adap2_seqSearchCounter500n),	     new Double(SearchingAlgorithms.adap2_seqSearchCounter2500n), new Double(SearchingAlgorithms.adap2_seqSearchCounter12500n), new Double(SearchingAlgorithms.adap2_seqSearchCounter62500n)},
            
        };

        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(1000, 258));
        table.setFillsViewportHeight(true);

        if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    printDebugData(table);
                }
            });
        }

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane);
    }

    private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();

        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Algorithms Analysis");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        Report newContentPane = new Report();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

//    public static void main(String[] args) {
//        //Schedule a job for the event-dispatching thread:
//        //creating and showing this application's GUI.
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                createAndShowGUI();
//            }
//        });
//    }
}
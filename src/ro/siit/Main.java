package ro.siit;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(".....Generate and print new ARRAY of SalesRepresentative.....");
        SalesRepresentative[] reps = new SalesRepresentative[10];
        //generate representatives
        SalesRepresentative.randomRepresentative(reps);
        //print representatives
        SalesRepresentative.printRepresentative(reps);
        //sort representative
        System.out.println(".........................Bubble Sort.............................");
        SortAlgorithms algo1=new SortAlgorithms();
        SalesRepresentative[] sortedReps= algo1.sortBubbleSort(reps);
        //print sorted representative
        SalesRepresentative.printRepresentative(sortedReps);

        System.out.println(".....Generate and print new ARRAY of SalesRepresentative.....");
        SalesRepresentative[] reps1 = new SalesRepresentative[12];
        //generate representatives
        SalesRepresentative.randomRepresentative(reps1);
        //print representatives
        SalesRepresentative.printRepresentative(reps1);
        //sort representative
        System.out.println("...........................Insertion Sort.......................");
        SortAlgorithms algo2=new SortAlgorithms();
        SalesRepresentative[] sortedReps1= algo2.sortInsertionSort(reps1);
        //print sorted representative
        SalesRepresentative.printRepresentative(sortedReps1);

        System.out.println(".....Generate and print new ARRAY of SalesRepresentative.....");
        SalesRepresentative[] reps2 = new SalesRepresentative[9];
        //generate representatives
        SalesRepresentative.randomRepresentative(reps2);
        //print representatives
        SalesRepresentative.printRepresentative(reps2);
        //sort representative
        System.out.println(".............................Merge Sort.........................");
        SortAlgorithms algo3=new SortAlgorithms();
        SalesRepresentative[] sortedReps3= algo3.sortMergeSort(reps2, 0, reps2.length-1);
        //print sorted representative
        SalesRepresentative.printRepresentative(reps2);

        System.out.println(".....Generate and print new ARRAYLIST of SalesRepresentative.....");
        ArrayList<SalesRepresentative> reps3 = new ArrayList<>();
        //generate representatives
        SalesRepresentative.randomRepresentative(reps3, 10);
        //print representatives
        SalesRepresentative.printRepresentative(reps3);
        System.out.println(".....................Sorting with comparator........................");
        //sort representative
        Collections.sort(reps3,SalesRepresentative.repSalesComparator);
        //print sorted representative
        SalesRepresentative.printRepresentative(reps3);
    }
}

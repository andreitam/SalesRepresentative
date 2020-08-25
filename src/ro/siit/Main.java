package ro.siit;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //declare arrays
        System.out.println(".....Generate and print new ARRAY of SalesRepresentative.....");
        SalesRepresentative[] reps = new SalesRepresentative[10];
        //generate representatives
        SalesRepresentative.randomRepresentative(reps);
        //clone representatives to test different algorithms with the same ARRAY
        SalesRepresentative[] reps1 = reps.clone();
        SalesRepresentative[] reps2 = reps.clone();
        //print representatives, reps 1 and reps 2 are identical
        SalesRepresentative.printRepresentative(reps);
        System.out.println(" ");

        //declare sortReps object
        SortRepresentatives sortReps;
        //sorting with bubble sort algorithm
        SortAlgorithm bubbleSort = new BubbleSort();
        sortReps = new SortRepresentatives(bubbleSort);
        SalesRepresentative.printRepresentative(sortReps.sort(reps));
        //sorting with insertion sort algorithm
        SortAlgorithm insertionSort = new InsertionSort();
        sortReps = new SortRepresentatives(insertionSort);
        SalesRepresentative.printRepresentative(sortReps.sort(reps1));
        //sorting with merge sort algorithm
        SortAlgorithm mergeSort = new MergeSort();
        sortReps = new SortRepresentatives(mergeSort);
        SalesRepresentative.printRepresentative(sortReps.sort(reps2));

        //sorting with Comparator implemented in the SalesRepresentatives class
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

package ro.siit;

/**
 * Class SortAlgorithms contains methods
 * sortBubbleSort(SalesRepresentative[] reps),
 * sortInsertionSort(SalesRepresentative[] reps),
 * sortMergeSort(SalesRepresentative[] reps, int l, int r).
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-12
 */
public class SortAlgorithms {
    /**
     * Method for sorting and array of SalesRepresentative objects
     * using Bubble Sort algorithm.
     * Adapted from https://www.geeksforgeeks.org/java-program-for-bubble-sort/
     *
     * @param reps the array of SalesRepresentative objects
     * @return an array of SalesRepresentative objects
     * (returns the input array sorted in descending order)
     */
    public SalesRepresentative[] sortBubbleSort(SalesRepresentative[] reps) {

        int n = reps.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (reps[j].getSales() < reps[j + 1].getSales()) {
                    // swap temp and arr[i]
                    SalesRepresentative tempRep = reps[j];
                    reps[j] = reps[j + 1];
                    reps[j + 1] = tempRep;
                }
            }
        }
        return reps;
    }
    /**
     * Method for sorting and array of SalesRepresentative objects
     * using Insertion Sort algorithm.
     * Adapted from https://www.geeksforgeeks.org/insertion-sort/
     *
     * @param reps the array of SalesRepresentative objects
     * @return an array of SalesRepresentative objects
     * (returns the input array sorted in descending order)
     */
    public SalesRepresentative[] sortInsertionSort(SalesRepresentative[] reps)
    {
        SalesRepresentative key;

        int n = reps.length;
        for (int i = 1; i < n; ++i) {
            key = reps[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && reps[j].getSales() < key.getSales()) {
                reps[j + 1] = reps[j];
                j = j - 1;
            }
            reps[j + 1] = key;
        }
        return reps;
    }
    /**
     * Method for merging two subarrays of SalesRepresentative objects
     * First subarray is arr[l..m]
     * Second subarray is arr[m+1..r]
     * Adapted from https://www.geeksforgeeks.org/merge-sort/
     *
     * @param reps the array of SalesRepresentative objects
     * @param l first index
     * @param m last index of first subarray
     * @param r last index of second subbaray
     */
    private void mergeMergeSort(SalesRepresentative[] reps, int l, int m, int r ) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        SalesRepresentative[] L = new SalesRepresentative[n1];
        SalesRepresentative[] R = new SalesRepresentative[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = reps[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = reps[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getSales() >= R[j].getSales()) {
                reps[k] = L[i];
                i++;
            }
            else {
                reps[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            reps[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            reps[k] = R[j];
            j++;
            k++;
        }
    }
    /**
     * Method for sorting an array of SalesRepresentative objects
     * using Merge Sort algorithm
     * Adapted from https://www.geeksforgeeks.org/merge-sort/
     *
     * @param reps the array of SalesRepresentative objects
     * @param l first index
     * @param r last index
     * @return an array of SalesRepresentative objects
     * (returns the input array sorted in descending order)
     */
    public SalesRepresentative[] sortMergeSort(SalesRepresentative[] reps, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sortMergeSort(reps, l, m);
            sortMergeSort(reps, m + 1, r);

            // Merge the sorted halves
            mergeMergeSort(reps, l, m, r);
        }
        return reps;
    }

}

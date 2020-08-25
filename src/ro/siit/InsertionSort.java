package ro.siit;
/**
 * Class InsertionSort is concrete implementation of
 * SortAlgorithm strategy interface
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-25
 */
public class InsertionSort implements SortAlgorithm {
    /**
     * Method for sorting and array of SalesRepresentative objects
     * using Insertion Sort algorithm.
     * Adapted from https://www.geeksforgeeks.org/insertion-sort/
     *
     * @param reps the array of SalesRepresentative objects
     * @return an array of SalesRepresentative objects
     * (returns the input array sorted in descending order)
     */
    public SalesRepresentative[] sort(SalesRepresentative[] reps)
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
}

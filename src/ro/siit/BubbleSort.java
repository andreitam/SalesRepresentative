package ro.siit;
/**
 * Class BubbleSort is concrete implementation of
 * SortAlgorithm strategy interface
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-25
 */
public class BubbleSort implements SortAlgorithm {
    /**
     * Method for sorting and array of SalesRepresentative objects
     * using Bubble Sort algorithm.
     * Adapted from https://www.geeksforgeeks.org/java-program-for-bubble-sort/
     *
     * @param reps the array of SalesRepresentative objects
     * @return an array of SalesRepresentative objects
     * (returns the input array sorted in descending order)
     */
    public SalesRepresentative[] sort(SalesRepresentative[] reps) {

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
}

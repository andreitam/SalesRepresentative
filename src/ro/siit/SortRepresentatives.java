package ro.siit;
/**
 * Class SortRepresentatives is the context class
 * for applying a sort algorithm to a SalesRepresentatives array
 * using the strategy design pattern.
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-25
 */
public class SortRepresentatives {
    private SortAlgorithm sortAlgorithm;
    private SalesRepresentative[] reps;
    /**
     * Constructor method for selecting the algorithm used for sorting.
     *
     * @param sortAlgorithm algorithm for sorting
     */
    public SortRepresentatives(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    /**
     * Method for sorting the SalesRepresentative array.
     * Prints the algorithm selected.
     *
     * @param reps SalesRepresentative array to be sorted
     * @return sorted SalesRepresentative array
     */
    public SalesRepresentative[] sort(SalesRepresentative[] reps) {
        printAlgorithm();
        return this.reps = sortAlgorithm.sort(reps);
    }
    /**
     * Method for printing the type of alforithm
     * selected in the strategy, depending of the
     * type of object instanciated.
     *
     */
    private void printAlgorithm() {
        if ( sortAlgorithm instanceof BubbleSort) {
            System.out.println(".........................Bubble Sort.............................");
        }
        else if ( sortAlgorithm instanceof InsertionSort) {
            System.out.println("...........................Insertion Sort.......................");
        }
        else if ( sortAlgorithm instanceof MergeSort) {
            System.out.println(".............................Merge Sort.........................");
        }

    }

}

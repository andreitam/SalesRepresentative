package ro.siit;
/**
 * Interface SortAlgorithm serves
 * as the strategy interface for different sorting algorithms
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-25
 */
public interface SortAlgorithm {
    SalesRepresentative[] sort(SalesRepresentative[] reps);
}

package ro.siit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 * Class SalesRepresentatives
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-12
 */
public class SalesRepresentative {
    private String name;
    private Integer salesNr;
    private Integer quota;
    private Integer sales;
    /**
     * Sets private field name
     * @param name input name
     */
    public void setName(String name) {
        this.name=name;
    }
    /**
     * @return private field String name
     */
    public String getName() {
        return this.name;
    }
    /**
     * Sets private field SalesNr
     * @param salesNr input nuber of sales
     */
    public void setSalesNr(Integer salesNr) {
        this.salesNr=salesNr;
    }
    /**
     * @return private field Integer salesNr
     */
    public Integer getSalesNr() {
        return this.salesNr;
    }
    /**
     * Sets private field Quota
     * @param quota input quota
     */
    public void setQuota(Integer quota) {
        this.quota=quota;
    }
    /**
     * @return private field Integer quota
     */
    public Integer getQuota() {
        return this.quota;
    }
    /**
     * @return private field Integer sales=salesNr*quota
     */
    public Integer getSales() {
        return this.sales=this.salesNr*this.quota;
    }
    /**
     * Method for filling an array with SalesRepresentative objects
     *
     * @param reps the array of SalesRepresentative objects
     */
    public static void randomRepresentative(SalesRepresentative[] reps) {
        //create random object
        Random rand = new Random();
        for (int i=0;i<reps.length;i++) {
            //generation of new SalesRepresentatives object
            SalesRepresentative rep = new SalesRepresentative();
            //set Name, SalesNr and Quota properties
            rep.setName("Name"+i);
            rep.setSalesNr(rand.nextInt(10));
            //prevent having 0 number of sales
            if (rep.getSalesNr()==0) {
                rep.setSalesNr(1);
            }
            rep.setQuota(rand.nextInt(1000));
            reps[i]=rep;
        }
    }
    /**
     * Method for filling an ArrayList with SalesRepresentative objects
     *
     * @param reps the array of SalesRepresentative objects
     * @param size the number of objects to be added
     */
    public static void randomRepresentative(ArrayList<SalesRepresentative> reps, Integer size) {
        //create random object
        Random rand = new Random();
        for (int i=0;i<size;i++) {
            //generation of new SalesRepresentatives object
            SalesRepresentative rep = new SalesRepresentative();
            //set Name, SalesNr and Quota properties
            rep.setName("Name"+i);
            rep.setSalesNr(rand.nextInt(10));
            //prevent having 0 number of sales
            if (rep.getSalesNr()==0) {
                rep.setSalesNr(1);
            }
            rep.setQuota(rand.nextInt(1000));
            reps.add(i,rep);
        }
    }
    /**
     * Method for printing an array with SalesRepresentative objects
     *
     * @param reps the array of SalesRepresentative objects
     */
    public static void printRepresentative(SalesRepresentative[] reps) {
        for(SalesRepresentative temp: reps) {
            System.out.println(temp.getName()+" has made a number of: "+temp.getSalesNr()+" sales, of value: "+
                    temp.getQuota()+", so in total: "+temp.getSales()+".");
        }
    }
    /**
     * Method for printing an ArrayList with SalesRepresentative objects
     *
     * @param reps the array of SalesRepresentative objects
     */
    public static void printRepresentative(ArrayList<SalesRepresentative> reps) {
        for(SalesRepresentative temp: reps) {
            System.out.println(temp.getName()+" has made a number of: "+temp.getSalesNr()+" sales, of value: "+
                    temp.getQuota()+", so in total: "+temp.getSales()+".");
        }
    }

    //adapted from https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
    /*Comparator for sorting the list by sales no*/
    public static Comparator<SalesRepresentative> repSalesComparator = new Comparator<>() {
        /**
         * compare method for comparing sales of 2 SalesRepresentatives objects
         *
         * @param s1 first SalesRepresentative object
         * @param s2 second SalesRepresentative object
         * @return difference in sales
         */
        public int compare(SalesRepresentative s1, SalesRepresentative s2) {
            int salesno1 = s1.getSales();
            int salesno2 = s2.getSales();
            /*For descending order*/
            return salesno2-salesno1;
            /*For ascending order*/
            //return salesno1-salesno2;
        }
    };
}

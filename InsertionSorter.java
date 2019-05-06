/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {

    }


    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {

    }


    private void insert1( ArrayList<String> list, int alreadyInserted){
        String valueToInsert , valueToCompare;
        int indexToCompare;
            for(indexToCompare = alreadyInserted - 1,
                  valueToInsert = list.get(alreadyInserted),
                  valueToCompare = list.get(indexToCompare);
                indexToCompare > 0 && valueToInsert.compareTo(valueToCompare) > 0;
                list.set(indexToCompare + 1 , valueToCompare),
                  list.set(indexToCompare , valueToInsert) ,
                  valueToCompare = list.get(--indexToCompare));
           if(valueToInsert.compareTo(valueToCompare) < 0){
              list.set(1 , valueToCompare);
              list.set(0 , valueToInsert);
           }
    }

    public void insertionSort( ArrayList<String> list) {
        for( int index = 1; index < list.size(); index++){
            insert1( list, index);
            System.out.println( "after inserting element " + index
				+ " elements: " + list
				);
        }
    }
}

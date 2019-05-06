import java.util.ArrayList;

public class SelectionSorter extends Sorter{


    public SelectionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }


    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        selectionSort(elements);
    }

    private void selectionSort(ArrayList<String> list){
        for(int i = 0; i < list.size() - 1; i++)
            champIndex(list , i);
    }

    private void champIndex(ArrayList<String> list, int startingIndex) {
        int index;
        String min , currentValue , storage;
        for(index = startingIndex, min = list.get(startingIndex); index < list.size(); index++){
            currentValue = list.get(index);
            if(currentValue.compareTo(min) < 0){
            storage = min;
            min = currentValue;
            list.set(startingIndex, min);
            list.set(index , storage);
            }
        }
    }

}

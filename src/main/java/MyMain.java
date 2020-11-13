import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int c = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 1 ){
                c +=1;
            }
            else if (list.get(i) % 2 == -1){
                c++;
            }
        }
        return c;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int i = 0; i < list1.size(); i++){
            int listone = list1.get(i);
            for (int k = 0; k < list2.size(); k++){
                int listwo = list2.get(k);
                if (listone == listwo){
                    return true;
                }
            }
        }

        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> arr_list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            arr_list.add(i, arr[i]);
        }
        return arr_list;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
        
        

    }
}

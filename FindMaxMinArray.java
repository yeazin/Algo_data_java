

// Find Maximum and minimum number in an Array

public class FindMaxMinArray {

    static String max_mini(int arr[], int maximum_element, int minium_element){

        for (int i=0; i <arr.length; i++){
            if (maximum_element < arr[i]){
                maximum_element = arr[i];
            }
            if (minium_element > arr[i]){
                minium_element = arr[i];
            }
        }
        String result = "Maximum element " + maximum_element + " Minimum element " + minium_element;
        return result;
    }

    public static void main(String args[]){

        int arr[] = {4,5,9,1,48,98,102,115};
        int maximum_element = arr[0];
        int minium_element = arr[0];
        
        System.out.println(max_mini(arr,maximum_element,minium_element));
        
        

    }
}

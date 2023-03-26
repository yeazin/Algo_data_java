

// Find Maximum and minimum number in an Array

public class FindMaxMinArray {

    public static void main(String[] args) {

        int lists[] = { 10, 12, 14, 67, 15, 18, 20, 24, 9 };

        int max_value = lists[0];
        int min_value = lists[0];

        for (int i = 0; i < lists.length; i++) {

            if (max_value < lists[i]) {
                max_value = lists[i];
            }

            if (min_value > lists[i]) {
                min_value = lists[i];
            }

        }


        System.out.println(max_value);
        System.out.println(min_value);

    }
}

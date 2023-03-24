// find customer in an interval
// time complexity O(n)
// space complexity O(1)


// Find total customer in a Time interval 

public class FindCustomerInterval {

    public static void main(String[] args) {

        int arrival_time[] = { 10, 12, 14, 15, 18, 20, 22 };
        int interval[] = { 12, 18 };
        int count_customer = 0;

        for (int i = 0; i < arrival_time.length; i++) {

            if (arrival_time[i] >= interval[0] &&
                    arrival_time[i] <= interval[1]) {

                count_customer++;
            }
        }

        System.out.println("Total Customer" + " " + count_customer);

    }
}

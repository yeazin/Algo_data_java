// find customer in an interval
// time complexity O(n)
// space complexity O(1)


// Find total customer in a Time interval 

public class FindCustomerInterval {

    static void customer_interval(int arrival_time[],int time_interval[]){
        
        int customer_count = 0;

        for (int i=0; i < arrival_time.length; i ++){
            if (arrival_time[i] >= time_interval[0] && 
                arrival_time[i] <= time_interval[1]){
                    customer_count ++;
                }
        }

        System.out.println("Total Customer" + customer_count);
    }

    public static void main(String args[]){

        int arrival_time[] = { 10, 12, 14, 15, 18, 20, 22 };
        int interval[] = { 12, 18 };

        customer_interval(arrival_time, interval);
        
    }
}

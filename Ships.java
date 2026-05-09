import java.util.Scanner;

public class Ships {
    public static boolean isShipped(int []arr, int days, int weight){
        int totalDays = 1,currentWeight = 0;
        for(int element:arr){
            if(currentWeight+element > weight){
                totalDays+=1;
                currentWeight=element;
            }
            else{
                currentWeight+=element;
            }
        }
        return totalDays <= days;
    }
    static int leastWeightCapacity(int[] arr, int n, int d) {
        int low = 0, high = 0;
        for(int element : arr){
            high += element;
            low = Math.max(low,element);
        }
        while(low <= high){
            int mid = low+(high-low)/2;
            if(isShipped(arr,d,mid)) high = mid - 1;
            else low = mid+1;
        }
        return low;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        Ships obj = new Ships();
        System.out.print("Result:"+obj.leastWeightCapacity(arr,k,m));
    }
}

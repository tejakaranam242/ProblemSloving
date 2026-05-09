import java.util.Scanner;

public class NoofDays {
    public int maxOfArr(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int element : arr) max = Math.max(element,max);
        return max;
    }
    public int bouquets(int[] arr, int days, int k) {
        int bouquets = 0, flowers = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= days) flowers++;
            else flowers = 0;
            if(flowers == k){
                bouquets++;
                flowers=0;
            }
        }
        return bouquets;
    }
    public int minDaysBloom(int[] arr, int k, int m) {
        int low = 1,high = maxOfArr(arr);
        while(low<=high){
            int mid =low+(high-low)/2;
            if(bouquets(arr,mid,k) >= m) high = mid-1;
            else low = mid+1;
        }
        if(low > maxOfArr(arr)) return -1;
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
        NoofDays obj = new NoofDays();
        System.out.print("Result:"+obj.minDaysBloom(arr,k,m));
    }
}

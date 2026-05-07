import java.util.Scanner;
class Main {
    public int noofSplits(int[] arr, int value){
        int length = arr.length;
        int noofArrays = 1;
        long sumOfArray = 0;
        for(int i=0;i<length;i++){
            if(sumOfArray+arr[i]<=value) sumOfArray+=arr[i];
            else{
                noofArrays++;
                sumOfArray = arr[i];
            }
        }
        return noofArrays;
    }
    public int max(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++) if(arr[i]>max) max = arr[i];
        return max;
    }
    public int sum(int[] arr){
        int sum = 0;
        for(int i:arr) sum+=i;
        return sum;
    }
    public int splitArray(int[] arr, int k) {
        int length = arr.length;
        int low = max(arr);
        int high = sum(arr);
        while(low<=high){
            int mid = (low+high)/2;
            int noofSplits = noofSplits(arr,mid);
            if(noofSplits>k) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for(int i=0;i<input.length;i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Main obj = new Main();
        int k = sc.nextInt();
        System.out.print("Result : "+obj.splitArray(arr,k));
    }
};
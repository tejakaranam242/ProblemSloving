import java.util.Scanner;

public class NoofRotations {
    public int findKRotation(int arr[]) {
        int Min = Integer.MAX_VALUE,count = 0;
        int low = 0,high = arr.length-1;
        if(arr[low] <= arr[high]) return 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<=arr[mid]){
                if(arr[low]<Min){
                    Min = arr[low];
                    count=low;
                }
                low = mid+1;
            }
            else{
                if(arr[mid]<Min){
                    Min = arr[mid];
                    count=mid;
                }
                high = mid-1;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        NoofRotations obj = new NoofRotations();
        System.out.print("Result:"+obj.findKRotation(arr));
    }
}

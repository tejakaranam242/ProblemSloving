import java.util.Scanner;

public class PeakElement {
    public int peakElement(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int mid = left + (right-left) / 2;
            if(arr[mid] < arr[mid+1]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return right;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        PeakElement obj = new PeakElement();
        System.out.print("Result:"+obj.peakElement(arr));
    }
}

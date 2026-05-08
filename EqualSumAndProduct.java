import java.util.Scanner;

public class EqualSumAndProduct {
    public int countSubarrays(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            int product = 1;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                product*=arr[j];
                if(sum == product) count++;
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
        EqualSumAndProduct obj = new EqualSumAndProduct();
        System.out.print("Result:"+obj.countSubarrays(arr));
    }
}

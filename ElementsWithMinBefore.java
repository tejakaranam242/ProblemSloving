import java.util.Scanner;

public class ElementsWithMinBefore {
    public int countElements(int[] arr) {
        int count = 1;
        int maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxSoFar) {
                count++;
                maxSoFar = arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for(int i=0;i<input.length;i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        ElementsWithMinBefore obj = new ElementsWithMinBefore();
        System.out.print("Result:"+obj.countElements(arr));
    }
}

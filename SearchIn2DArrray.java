import java.util.Scanner;

public class SearchIn2DArrray {
    public boolean searchMatrix(int[][] mat, int x) {
        int rows = mat.length;
        int cols = mat[0].length;
        int low = 0;
        int high = rows*cols-1;
        while(low<=high){
            int mid = (low+high)/2;
            int rowIndex = mid/cols;
            int colIndex = mid%cols;
            if(mat[rowIndex][colIndex]==x) return true;
            else if(mat[rowIndex][colIndex]<x) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] arr = new int[row][cols];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int x = scanner.nextInt();
        SearchIn2DArrray obj = new SearchIn2DArrray();
        System.out.print("Result:"+obj.searchMatrix(arr,x));
    }
}

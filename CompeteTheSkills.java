import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class CompeteTheSkills {
    public List<Integer> scores(List<Integer> a, List<Integer> b) {
        int AScore=0,BScore=0;
        for(int i=0;i<3;i++){
            if(a.get(i)>b.get(i)) AScore++;
            else if(a.get(i)<b.get(i)) BScore++;
        }
        return new ArrayList<>(Arrays.asList(AScore, BScore));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr1 = new int[input.length];
        for(int i=0;i<input.length;i++){
            arr1[i] = Integer.parseInt(input[i]);
        }
        List<Integer> arrList1 = new ArrayList<>();
        for (String s : input) {
            arrList1.add(Integer.parseInt(s));
        }
        input = scanner.nextLine().split(" ");
        int[] arr2 = new int[input.length];
        for(int i=0;i<input.length;i++){
            arr2[i] = Integer.parseInt(input[i]);
        }
        List<Integer> arrList2 = new ArrayList<>();
        for (String s : input) {
            arrList2.add(Integer.parseInt(s));
        }
        CompeteTheSkills obj = new CompeteTheSkills();
        System.out.print("Result : "+obj.scores(arrList1, arrList2));
    }
}
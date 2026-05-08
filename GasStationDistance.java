import java.util.Scanner;

public class GasStationDistance {
    public int numberOfStations(int[] stations, double mid){
        int count = 0;
        for(int i=1;i<stations.length;i++){
            double gap = stations[i] - stations[i - 1];
            double numberInBetween = (stations[i] - stations[i - 1])/mid;
            if((gap/mid) == (numberInBetween * mid)) numberInBetween--;
            count+=numberInBetween;
        }
        return count;
    }
    public double minMaxDist(int[] stations, int K) {
        int length = stations.length;
        double low = 0;
        double high = 0;
        for(int i=0;i<length-1;i++)
            if((double)(stations[i+1]-stations[i])>high) high = (double)stations[i+1]-stations[i];
        double diff = 1e-6;
        while(high-low>diff){
            double mid = (low+high)/(2.0);
            int count = numberOfStations(stations,mid);
            if(count > K) low = mid;
            else high = mid;
        }
        return high;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for(int i=0;i<input.length;i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        GasStationDistance obj = new GasStationDistance();
        int k = sc.nextInt();
        System.out.print("Result : "+obj.minMaxDist(arr,k));
    }
}

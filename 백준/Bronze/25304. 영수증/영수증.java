import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int totalPrice = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        
        int sum = 0;
        for(int i=0; i<count; i++){
            String[] arr = br.readLine().split(" ");
            sum += Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        }
        
        if(totalPrice == sum) System.out.println("Yes");
        else System.out.println("No");
        
    }
}
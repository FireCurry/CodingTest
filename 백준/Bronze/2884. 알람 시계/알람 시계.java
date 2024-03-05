import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);
        
        if(minute-45 < 0){
            hour -= 1;
            minute += 15;
            if(hour < 0){
                hour = 23;
            }
        } else {
            minute -= 45;
        }
        
        System.out.println(hour + " " + minute);
    }
}
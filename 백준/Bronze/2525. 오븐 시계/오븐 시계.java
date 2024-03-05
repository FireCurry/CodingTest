import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        
        int hr = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        
        int plusMin = Integer.parseInt(br.readLine());
        
        hr += (min + plusMin)/60;
        min = (min + plusMin)%60;
        
        if(hr > 23){
            hr -= 24;
        }
        
        System.out.println(hr + " " + min);
    }
}
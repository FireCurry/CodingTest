import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        int sum = 0;
        for(int i=1; i<=number; i++){
            sum += i;
        }
        
        System.out.println(sum);
    }
}
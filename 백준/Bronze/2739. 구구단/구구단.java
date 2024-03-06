import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=9; i++){
            System.out.printf("%d * %d = %d\n", number, i, number*i);
        }
    }
}
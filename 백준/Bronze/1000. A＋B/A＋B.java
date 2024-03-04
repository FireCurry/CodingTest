import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int sum = 0;
        for(String number : temp){
            sum += Integer.parseInt(number);
        }
        
        System.out.println(sum);
    }
}
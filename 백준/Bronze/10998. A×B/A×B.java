import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int sum = 1;
        for(String temp : arr){
            sum *= Integer.parseInt(temp);
        }
        System.out.println(sum);
        
    }
}
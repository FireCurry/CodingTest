import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        System.out.println(Double.parseDouble(arr[0])/Double.parseDouble(arr[1]));
    }
}
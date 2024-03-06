import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(br.ready()){
            
            String[] arr = br.readLine().split(" ");
            bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
            
        }
        bw.flush();
        bw.close();
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            String str = br.readLine();
            if(str.equals("0 0")) break;
            String[] arr = str.split(" ");
            bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
            
        }
        bw.flush();
        bw.close();
    }
}
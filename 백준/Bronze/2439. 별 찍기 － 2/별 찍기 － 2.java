import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int number = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=number; i++){
            for(int u=number; u>0; u--){
                if(u<=i){
                    bw.write("*");
                }else{
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
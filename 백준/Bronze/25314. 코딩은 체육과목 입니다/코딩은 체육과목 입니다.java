import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        String str = "";
        
        for(int i=0; i<number/4; i++){
            str += "long ";
        }
        str += "int";
        
        System.out.println(str);
        
    }
}
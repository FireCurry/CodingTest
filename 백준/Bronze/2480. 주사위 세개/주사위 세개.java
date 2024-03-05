import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        Set<Integer> set = new HashSet<>();
        
        int dupl = 0;
        int max = 0;
        
        for(String str : arr){
            max = Math.max(max, Integer.parseInt(str));
            int size = set.size();
            set.add(Integer.parseInt(str));
            if(size == set.size()){
                dupl = Integer.parseInt(str);
            }
        }
        
        if(set.size() == 1){
            System.out.println(10000 + dupl*1000);
        } else if(set.size() == 2) {
            System.out.println(1000 + dupl*100);
        } else {
            System.out.println(max*100);
        }
    }
}

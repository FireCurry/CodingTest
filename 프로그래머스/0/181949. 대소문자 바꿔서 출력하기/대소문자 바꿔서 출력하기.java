import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) >= 'a'){
                str.append((char)(a.charAt(i) - 32));
            } else {
                str.append((char)(a.charAt(i) + 32));
            }
        }
            
        
        System.out.println(str.toString());
    }
}
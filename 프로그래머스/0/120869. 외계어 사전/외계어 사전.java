import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        Set<String> set = new HashSet<>();
        
        for(String str : spell){
            set.add(str);
        }
        
        for(int i=0; i<dic.length; i++){
            String[] arr = dic[i].split("");
            Set<String> set2 = new HashSet<>();
            for(int u=0; u<arr.length; u++){
                set2.add(arr[u]);
            }
            if(set.equals(set2)) return 1;
        }
        
        
        
        return 2;
    }
}
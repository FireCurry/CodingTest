class Solution {
    public String solution(String my_string) {
        
        String[] temp = {"a", "e", "i", "o", "u"};
        for(String string : temp){
            my_string = my_string.replace(string,"");
        }
        
        return my_string;
    }
}
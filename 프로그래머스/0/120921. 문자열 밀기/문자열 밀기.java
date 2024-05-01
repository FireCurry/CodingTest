class Solution {
    public int solution(String A, String B) {
        StringBuilder str = new StringBuilder(A);
        if(A.equals(B)) return 0;
        for(int i=0; i<A.length(); i++){
            str.insert(0, str.charAt(A.length()-1));
            str.deleteCharAt(A.length());
            if(str.toString().equals(B)) return i+1;
        }
        
        return -1;
    }
}
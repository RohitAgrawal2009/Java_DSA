class Solution {
    public long countValidSubstrings(String s) {
        long res = 0;
        int l = 0 , r = 0;

        while(r < s.length()){

            if(r >= 2 && s.charAt(r-2) == 'a' && s.charAt(r-1) == 'b' && s.charAt(r) == 'c'){
                l = r-1; 
            }
            
            res += (r - l + 1);
            r++;
        }
        
        return res;
    }
}
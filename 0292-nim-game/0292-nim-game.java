
class Solution {
    public boolean canWinNim(int n) {
        //       return n%4 != 0;  

        // orrr 

        if (n < 4)
            return true;
        else if (n % 4 != 0)
            return true;
        return false;
    }
}
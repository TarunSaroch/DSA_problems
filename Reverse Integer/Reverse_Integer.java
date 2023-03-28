/* JAVA code
Runtime 1 ms - Beats 100%
Memory 39.6 MB - Beats 66.45%
*/

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) return 0;
            rev = (rev * 10) + (x % 10);
            x = x/10;
        }
        return rev;
    }
}

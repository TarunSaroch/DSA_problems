/* Java code
Runtime 0 ms - Beats 100%
Memory 39.2mb - Beats 74.6%
*/

class Solution {
    public int bitwiseComplement(int n) {
        int m = n;
        int temp = 0;
        if(n == 0) return 1;
        while (m != 0){
            temp = (temp << 1) | 1;
            m = m >> 1;
        }
        int answer = (~n) & temp;
        return answer;
    }
}

// code by Love Babbar

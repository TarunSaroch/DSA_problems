// c++ code

class Solution {
public:
    int reverse(int x) {
        int rev = 0;
        while(x){
            if( (rev > INT_MAX / 10) or (rev < INT_MIN / 10) ) return 0;
            rev = (rev * 10) + (x % 10);
            x = x / 10;
        }
        return rev;
    }
};

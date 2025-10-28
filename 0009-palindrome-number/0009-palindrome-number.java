class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0 || ( x % 10 == 0 && x != 0 ) ){
            return false;
        }
        int reverse_number = 0;
        while(x > reverse_number){
            reverse_number = reverse_number * 10 + x % 10;
            x = x / 10;
        }
        return x == reverse_number || x == reverse_number / 10;
    }
}
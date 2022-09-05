class Solution {
    public boolean isStrictlyPalindromic(int n) {
        // https://mathfour.com/arithmetic/can-every-number-be-written-as-a-palindrome-in-some-base
        // Revide how to do conversions from one base to another and then after that try to do conversion of number n in base n -1 which will be "11"
        // which is always palindromic.
        // For number n and base n-2, the answer in any base will always be "12" which is not palindrmic hence any number cannot be "Strictly Palindromic"
        // as base n-2 is always non palindromic.
        return false;
    }
}
class Solution {
    public String breakPalindrome(String palindrome) {
        int length = palindrome.length();
        if(length == 1){
            return"";
        }
        char[] containArray = palindrome.toCharArray();
        for(int i = 0; i < length/2; i++){
            if(containArray[i] != 'a'){
                containArray[i] = 'a';
                return String.valueOf(containArray);
            }
        }
         containArray[length - 1] = 'b';
        return String.valueOf(containArray);
        
    }
}

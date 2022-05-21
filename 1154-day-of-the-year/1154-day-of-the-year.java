class Solution {
    public int dayOfYear(String date) {
        int[] monthsum = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int ans = 0;
        int year = 1000*((int)date.charAt(0)-'0')+100*((int)date.charAt(1)-'0')+10*((int)date.charAt(2)-'0')+((int)date.charAt(3)-'0');
        int month = 10*((int)date.charAt(5)-'0')+((int)date.charAt(6)-'0');
        int day = 10*((int)date.charAt(8)-'0')+((int)date.charAt(9)-'0');
        if(year%4==0 && year != 1900 && month>2){
            monthsum[month-1]++;
        }
        ans=day+monthsum[month-1];
        return ans;
    }
}
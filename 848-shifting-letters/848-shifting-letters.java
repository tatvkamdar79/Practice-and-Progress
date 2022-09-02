class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        double sum = 0;
        for(int shift : shifts)
            sum += (double)shift;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            // System.out.print(sum + " -> ");
            char c = s.charAt(i);
            if(i == 0){
                c = (char)(97 + ((c - 'a' + (sum))%26));
                sum -= shifts[0];
            }
            else{
                c = (char)(97 + ((c - 'a' + (sum))%26));
                sum -= shifts[i];
            }
            sb.append(c);
            // System.out.println(sum);
        }
        return sb.toString();
    }
}
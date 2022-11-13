class Solution {
    public String reverseWords(String s) {
        List<String> A = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(A);
        return String.join(" ", A);
    }
}
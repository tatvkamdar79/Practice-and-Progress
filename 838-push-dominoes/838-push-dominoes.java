class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        char[] ch =  new char[n+2];
        ch[0] = 'L';
        ch[n+1] = 'R';
        int idx = 1;
        for(char c : dominoes.toCharArray())
            ch[idx++] = c;
        // System.out.println(Arrays.toString(ch));
        for(int i = 0, j = 1; i < ch.length && j < ch.length;){
            while(ch[j] == '.') j++;
            // System.out.println(i + " -> " + j);
            if(ch[i] == 'L'){
                if(ch[j] == 'L')
                    for(int x = i; x <= j; x++)
                        ch[x] = 'L';
            }
            if(ch[i] == 'R'){
                if(ch[j] == 'R')
                    for(int x = i; x <= j; x++)
                        ch[x] = 'R';
                else
                    for(int lo = i, hi = j; lo < hi;){
                        ch[lo++] = 'R';
                        ch[hi--] = 'L';
                    }
            }
            i = j++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ch);
        return sb.substring(1, sb.length() - 1).toString();
    }
}
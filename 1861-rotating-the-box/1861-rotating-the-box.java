class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length, n = box[0].length;
        for(int i = 0; i < m; i++){
            for(int j = n - 1; j >= 0; j--){
                if(box[i][j] == '#'){
                    int pos = j + 1;
                    while(pos < n){
                        if(box[i][pos] == '.'){
                            box[i][pos] = '#';
                            box[i][pos-1] = '.';
                        }
                        else if(box[i][pos] == '*')
                            break;
                        pos++;
                    }
                }
            }
        }
        char[][] rot = new char[n][m];
        for(int j = 0; j < n; j++){
            for(int i = 0; i < m; i++){
                rot[j][i] = box[i][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m/2; j++){
                char temp = rot[i][j];
                rot[i][j] = rot[i][m-1-j];
                rot[i][m-1-j] = temp;
            }
        }
        // for(char[] i : rot){
        //     System.out.println(Arrays.toString(i));
        // }
        return rot;
    }
}
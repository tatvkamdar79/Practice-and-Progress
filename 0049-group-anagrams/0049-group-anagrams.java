class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> mp = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String str: strs){
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            
            if(mp.containsKey(sorted)){
                mp.get(sorted).add(str);
            }
            else{
                List<String> tem = new ArrayList<>();
                tem.add(str);
                mp.put(sorted, tem);
            }   
        }
        
        for(Map.Entry<String, List<String>> entry: mp.entrySet()){
            result.add(entry.getValue());
        }
        
        return result;
    }
}
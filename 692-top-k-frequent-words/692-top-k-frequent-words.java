class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> mp = new HashMap<>();
        for(String s : words)
            mp.put(s, mp.getOrDefault(s, 0) + 1);
        List<String> res = new ArrayList<>(mp.keySet());
        Collections.sort(res, (w1, w2) -> mp.get(w1).equals(mp.get(w2)) ? w1.compareTo(w2) : mp.get(w2) - mp.get(w1));
        return res.subList(0, k);
    }
}
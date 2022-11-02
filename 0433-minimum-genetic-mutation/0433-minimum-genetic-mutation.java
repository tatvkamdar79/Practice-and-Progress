class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Set<String> ban = new HashSet<>(Arrays.asList(bank));
        Queue<String> q = new LinkedList<>();
        q.offer(start);
        Set<String> vis = new HashSet<>();
        int steps = 0;
        while(!q.isEmpty()){
            int size = q.size();
            steps++;
            while(size-- > 0){
                String curr = q.poll();
                Set<String> temp = new HashSet<>();
                for(String s : ban)
                    if(diff(curr, s) == 1 && vis.add(s))
                        temp.add(s);
                if(temp.contains(end))
                    return steps;
                for(String s : temp)
                    q.add(s);
            }
        }
        return -1;
    }
    public int diff(String a, String b){
        int d = 0;
        for(int i = 0; i < a.length(); i++)
            if(a.charAt(i) != b.charAt(i))
                d++;
        return d;
    }
}
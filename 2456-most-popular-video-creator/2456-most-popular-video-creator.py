class Solution:
    def mostPopularCreator(self, creators: List[str], ids: List[str], views: List[int]) -> List[List[str]]:
        pop = defaultdict(int)
        for i in range(len(creators)):
            pop[creators[i]] += views[i]
        mx = max(pop.values())
        # print(pop)
        peeps = defaultdict(list)
        for i in pop.keys():
            if pop[i] == mx:
                peeps[i] = []
        # print(peeps)
        for i in range(len(creators)):
            if creators[i] in peeps:
                peeps[creators[i]].append([ids[i], -views[i]])
        for i in peeps:
            peeps[i].sort(key = lambda x : [x[1], x[0]])
        # print(peeps)
        ans = []
        for i in peeps:
            ans.append([i, peeps[i][0][0]])
        return ans
class Solution:
    def minimumTotal(self, l: List[List[int]]) -> int:
        if len(l) == 1: return l[0][0]
        for i in range(1, len(l)):
            for j in range(len(l[i])):
                # print(i,j)
                if(j == 0):
                    l[i][j] += l[i-1][j]
                elif(j == len(l[i]) - 1):
                    l[i][j] += l[i-1][j-1]
                else:
                    # print(l)
                    l[i][j] = l[i][j] + min(l[i-1][j], l[i-1][j-1])
                # print(l)
        return min(l[len(l) - 1])
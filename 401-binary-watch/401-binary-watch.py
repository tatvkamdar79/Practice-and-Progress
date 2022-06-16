class Solution:
    def readBinaryWatch(self, turnedOn: int) -> List[str]:
        ans = []
        for i in range(12):
            for j in range(60):
                if bin(i).count('1') + bin(j).count('1') == turnedOn:
                    ans.append( str(i) + ':' + ('0' if j < 10 else '') + str(j) )
        return ans
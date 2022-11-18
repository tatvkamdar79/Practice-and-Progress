class Solution:
    def splitMessage(self, message: str, limit: int) -> List[str]:
        def getans(msg, lastPart, limit):
            l = []
            beg = 0
            for i in range(1, lastPart + 1):
                suffix = f"<{i}/{lastPart}>"
                prefix = msg[beg:beg+limit-len(suffix)]
                beg = beg+limit-len(suffix)
                l.append(prefix + suffix)
            return l
            
        for digitsOfMaxParts in range(1, 6):
            maxParts = 10**digitsOfMaxParts - 1
            totalLen = 0
            for parts in range(1, maxParts+1):
                suffixLen = digitsOfMaxParts + len(str(parts)) + 3
                totalLen += limit - suffixLen
                if(totalLen >= len(message)):
                    return getans(message, parts, limit)
        return []
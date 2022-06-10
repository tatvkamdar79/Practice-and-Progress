class TimeMap:
    
    def __init__(self):
        self.d = collections.defaultdict(list)
        
        
    def set(self, key: str, value: str, timestamp: int) -> None:
        self.d[key].append([value, timestamp])

        
    def get(self, key: str, timestamp: int) -> str:
        arr = self.d[key]
        n = len(arr)
        l, r = 0, n
        while l < r:
            mid = (l + r)//2
            
            if arr[mid][1] <= timestamp:
                l = mid + 1
            elif arr[mid][1] > timestamp:
                r = mid
        
        return "" if r == 0 else arr[r-1][0]


# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)
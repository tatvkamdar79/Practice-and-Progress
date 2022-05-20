class Solution:
    def numOfBurgers(self, tomatoSlices: int, cheeseSlices: int) -> List[int]:
        if (tomatoSlices & 1):
            return []
        
        jumbo = ( tomatoSlices - 2 * (cheeseSlices) ) // 2
        small = cheeseSlices - jumbo
        
        return [jumbo, small] if jumbo >= 0 and small >= 0 else []
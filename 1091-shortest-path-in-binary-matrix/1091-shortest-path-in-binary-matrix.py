class Solution:
    def shortestPathBinaryMatrix(self, grid: List[List[int]]) -> int:
        n = len(grid)
        if grid[0][0] or grid[n-1][n-1]: return -1
        
        Q = [(0,0,0)]
        grid[0][0]=1
        while Q:
            r,c,l=Q.pop(0)
            
            if r==c==n-1: return l+1
            
            if r>0 and grid[r-1][c]==0:
                Q.append((r-1,c,l+1))
                grid[r-1][c]=1
            if r>0 and c+1<n and grid[r-1][c+1]==0:
                Q.append((r-1,c+1,l+1))
                grid[r-1][c+1]=1
            if c+1<n and grid[r][c+1]==0:
                Q.append((r,c+1,l+1))
                grid[r][c+1]=1
            if r+1<n and c+1<n and grid[r+1][c+1]==0:
                Q.append((r+1,c+1,l+1))
                grid[r+1][c+1]=1
            if r+1<n and grid[r+1][c]==0:
                Q.append((r+1,c,l+1))
                grid[r+1][c]=1
            if r+1<n and c>0 and grid[r+1][c-1]==0:
                Q.append((r+1,c-1,l+1))
                grid[r+1][c-1]=1
            if c>0 and grid[r][c-1]==0:
                Q.append((r,c-1,l+1))
                grid[r][c-1]=1
            if r>0 and c>0 and grid[r-1][c-1]==0:
                Q.append((r-1,c-1,l+1))
                grid[r-1][c-1]=1
        
        return -1
        
        # pathLength = 0
        
        if grid[0][0] != 0:
            return -1
    
        # currentLevel = [(0, 0)]
        queue = [(0, 0, 1)]
        
        def getValidNeighbors(i, j, level):
            neighbors = []
            for neighborI in range(i - 1, i + 2):
                    if neighborI >= 0 and neighborI < len(grid):
                        for neighborJ in range(j - 1, j + 2):
                            if neighborJ >= 0 and neighborJ < len(grid[0]):
                                if grid[neighborI][neighborJ] == 0:
                                    neighbors.append((neighborI, neighborJ, level + 1))
            return neighbors
        
        while len(queue) > 0:
            i, j, level = queue.pop()
            # pathLength += 1
            # nextLevel = []
            # for i, j in currentLevel:
            if i == len(grid) - 1 and j == len(grid) - 1:
                return level
            grid[i][j] = level
            # neighbors = getValidNeighbors(i, j)
            # nextLevel += getValidNeighbors(i, j, level)
            queue += getValidNeighbors(i, j, level)
            # currentLevel = nextLevel
        
        return -1
class Solution:
    def maximumDetonation(self, bombs: List[List[int]]) -> int:
        import math
        from collections import deque
        self.graph = {i: [] for i in range(len(bombs))}
        
        # builing graph takes ~ O(2N) where N is # of bombs
        for i in range(len(bombs)):
            bomb1 = bombs[i]
            for j in range(i+1, len(bombs)):
                bomb2 = bombs[j]
                dist_x = bomb1[0]-bomb2[0]
                dist_y = bomb1[1]-bomb2[1]
                distance = math.sqrt((dist_x*dist_x) + (dist_y*dist_y))
                if distance <= bomb1[2]:
                    self.graph[i].append(j)
                if distance <= bomb2[2]:
                    self.graph[j].append(i)
        
        # Looping through all nodes takes O(N) and dfs takes O(N) in w.c.s
        # Hence, total T.C is O(N^2)
        max_explosions = 1            
        for i in range(len(bombs)):
            seen_nodes = set([i])
            explosion_count = self.get_explosion_count(i, seen_nodes)
            max_explosions = max(max_explosions, explosion_count)
            if max_explosions == len(bombs):
                break
        return max_explosions
    
    def get_explosion_count(self, curr_node, seen_nodes):
        explosion_count = 0
        for child_node in self.graph[curr_node]:
            if child_node not in seen_nodes:
                seen_nodes.add(child_node)
                explosion_count += self.get_explosion_count(child_node, seen_nodes)
        return explosion_count+1
        
class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        arrival_time = {p: (target - p) / s for p,s in zip(position, speed)}
        position.sort(reverse=True)
        
        i = 0
        fleets = 0
        while i < len(position):
            # ith closest car has arrived 
            # start new fleet
            fleets += 1
            fleet_arrival = arrival_time[position[i]]
            while i < len(position) and arrival_time[position[i]] <= fleet_arrival:
                i += 1
        
        return fleets
        # For Understanding
        # arrivals = [(target-position[i])/speed[i] for i in range(len(position))]
        # t = sorted(zip(position, speed, arrivals), key = lambda x: x[0])
        # # print(t)
        # curr = t[-1]
        # st = []
        # st.append(curr)
        # # res = 0
        # for i in range(len(t) - 2, -1, -1):
        #     if st != [] and st[-1][2] >= t[i][2]:
        #         continue
        #     else:
        #         st.append(t[i])
        #         curr = t[i]
        #     # print(st)
        # return len(st)
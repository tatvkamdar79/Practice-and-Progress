class Solution:
    def minMutation(self, start: str, end: str, bank: List[str]) -> int:
        def diff(a, b):
            x = 0
            for i, j in zip(a, b):
                if i != j:
                    x += 1
            return x
        vis = set()
        steps = 0
        bank = set(bank)
        q = []
        q.append(start)
        while q:
            steps += 1
            size = len(q)
            temp = set()
            while size > 0:
                curr = q.pop(0)
                size -= 1
                for i in bank:
                    if diff(curr, i) == 1:
                        if i not in vis:
                            vis.add(i)
                            temp.add(i)
            if end in temp:
                return steps
            for i in temp:
                q.append(i)
        return -1
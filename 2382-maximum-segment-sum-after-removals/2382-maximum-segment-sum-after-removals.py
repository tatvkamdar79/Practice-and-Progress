from sortedcontainers import SortedList


class Solution:
    def maximumSegmentSum(self, nums, removeQueries):
        n, ps, ans = len(nums), [0], []
        segments, sums = SortedList(), SortedList([0])

        # compute prefix sums
        for k in nums:
            ps.append(ps[-1] + k)

        # adding a segment with (left, right) borders and its sum
        def add(l, r):
            if l > r: return
            segments.add((l, r))
            sums.add(ps[r + 1] - ps[l])

        # removing a segment
        def remove(l, r):
            segments.remove((l, r))
            sums.remove(ps[r + 1] - ps[l])

        # initial segment with borders (0, n - 1)
        add(0, n - 1)

        for i in removeQueries:
            # get index of an interval containing `i`
            ind = segments.bisect_left((i + 1, -1)) - 1
            left, right = segments[ind]

            # remove, then add two new segments
            remove(left, right)
            add(left, i - 1)
            add(i + 1, right)

            ans.append(sums[-1])
        return ans
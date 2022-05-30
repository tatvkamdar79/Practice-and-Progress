class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        st = []
        d = {nums1[i] : i for i in range(len(nums1))}
        # print(d)
        res = [-1]*len(nums2)
        ans = [-1]*len(nums1)
        for i in range(len(nums2)):
            if len(st) == 0:
                st.append(i)
            elif nums2[i] <= nums2[st[-1]]:
                st.append(i)
            else:
                while len(st) != 0 and nums2[i] > nums2[st[-1]]:
                    res[st[-1]] = nums2[i]
                    if(nums2[st[-1]] in d):
                        ans[d[nums2[st[-1]]]] = nums2[i]
                    st.pop()
                st.append(i)
        # print(nums2)
        # print(res)
        # print(nums1)
        return ans
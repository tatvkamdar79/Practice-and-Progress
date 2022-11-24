class Solution:
    def isValid(self, s: str) -> bool:
        st = []
        d = {'(' : ')', '[' : ']', '{' : '}'}
        for i in s:
            if i in '([{':
                st.append(i)
            else:
                if st == []:
                    return False
                if d[st[-1]] == i:
                    st.pop()
                else:
                    return False
        return st == []
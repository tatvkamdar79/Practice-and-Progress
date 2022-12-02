class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        #In this question You can do in simple way by using counter, you donot need to transform or exchange the letter of string,actually answer depends on same number of letter(also same set of letter) in both.Think u will understand why two times counter is used(frequncy of value matters)
        if len(word1) != len(word2):
            return 0
        w1 = Counter(word1)
        w2 = Counter(word2)
        res1 = (set(w1.keys()) == set(w2.keys())) #checking both have the same letter or not
        res2 = (Counter(w1.values()) == Counter(w2.values())) #this hashmap is used for checking frequncy of ecah value in w1 and w2 
        return res1 and res2
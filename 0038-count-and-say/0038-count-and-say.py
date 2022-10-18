class Solution:
    def countAndSay(self, n):
        result = "1"
        for _ in range(n - 1):
            # original
            # s = ''.join(str(len(list(group))) + digit for digit, group in itertools.groupby(s))

            # decomposed
            v = '' # accumulator string
            # iterate the characters (digits) grouped by digit
            for digit, group in itertools.groupby(result):
                count = len(list(group)) # eg. the 2 in two 1s 
                v += "%i%s" % (count, digit) # create the 21 string and accumulate it
            result = v # save to result for the next for loop pass

        # return the accumulated string
        return result
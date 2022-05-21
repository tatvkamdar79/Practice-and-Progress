class Solution:
    def dayOfYear(self, date: str) -> int:
        year, month, day = map(int, date.split('-'))
        days_month_wise = [0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334]
        
        if year%4 == 0 and year/100 != 19:
            for i in range(2, len(days_month_wise)):
                days_month_wise[i] += 1
        
        ans = days_month_wise[month-1] + day
        
        return ans
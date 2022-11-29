from collections import Counter

class Solution:
    def findWinners(self, matches: list[list[int]]):
        loss_cnt = Counter()  # keeping track of number of losses incurred by each player

        for winner, loser in matches:
            loss_cnt[winner] += 0
            loss_cnt[loser] += 1

        always_winner, only_one_loss = [], []

        for player, losses in loss_cnt.items():
            if losses == 0:
                always_winner.append(player)
            elif losses == 1:
                only_one_loss.append(player)

        return sorted(always_winner), sorted(only_one_loss)
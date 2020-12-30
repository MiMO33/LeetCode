from typing import List


def coinChange(coins: List[int], amount: int) -> int:
    if amount == 0: 
        return 0
    table = [0]
    for i in range(1, amount + 1):
        p = 10000000
        for c in range(len(coins)):
            temp = 0
            # 没结果
            if i - coins[c] < 0:
                temp = 10000000
            else:
                temp = 1 + table[i - coins[c]] 
            p = min(p, temp)
        table.append(p)
    if table[amount] == 10000000:
        table[amount] = -1
    return table[amount]

if __name__ == '__main__':
    print(coinChange([2], 3))

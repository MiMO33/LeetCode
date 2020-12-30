def longestCommonSubsequence(text1: str, text2: str) -> int:
    m, n = len(text1), len(text2)
    c = list(map(lambda x:(list(map(lambda y:0,range(n + 1)))),range(m + 1)))
    for i in range(0, m + 1):
        for j in range(0, n + 1):
            if(i == 0 or j == 0): pass
            elif(text1[i - 1] == text2[j - 1]): c[i][j] = c[i - 1][j - 1] + 1
            else: c[i][j] = max(c[i - 1][j], c[i][j - 1])
    return c[m][n]


if __name__ == '__main__':
    print(longestCommonSubsequence('abcde', 'ace'))

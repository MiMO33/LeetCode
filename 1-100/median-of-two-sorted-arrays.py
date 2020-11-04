class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        list = []
        m, n, p1, p2 = len(nums1), len(nums2), 0, 0
        for i in range(m + n):
            if p2 >= n and p1 < m:
                list.append(nums1[p1])
                p1 += 1
            elif p2 < n and p1 >= m:
                list.append(nums2[p2])
                p2 += 1
            elif nums1[p1] < nums2[p2]:
                list.append(nums1[p1])
                p1 += 1
            else:
                list.append(nums2[p2])
                p2 += 1

        if (len(nums1) + len(nums2)) % 2 == 1:
            return list[(m + n) // 2]
        else:
            return (list[(m + n) // 2 - 1] + list[(m + n) // 2]) / 2
import math


class KokoBanana:
    def canEat(self, arr, mid, k):
        totalTime = 0
        for i in arr:
            totalTime+= int(math.ceil(i/mid))
        return True if totalTime<=k else False
    def kokoEat(self, arr, k):
        low = 1
        high = 0
        for i in arr:
            high = max(high,i)
        while low<=high:
            mid = (low+high)//2
            if self.canEat(arr, mid, k):
                high = mid-1
            else:
                low = mid+1
        return low
arr = list(map(int,input().split()))
k = int(input())
obj = KokoBanana()
result = obj.kokoEat(arr, k)
print(result)
class NoofDays:
    def noofBoquets(self, arr, k, mid):
        boquets = 0
        flowers = 0
        for i in arr:
            if i <= mid:
                flowers+=1
            else:
                flowers=0
            if flowers == k:
                boquets+=1
                flowers = 0
        return boquets
    def minDaysBloom(self, arr, k, m):
        low = 1
        high = 0
        for i in arr:
            high = max(high,i)
        maxArr = high
        while(low<=high):
            mid = (low+high)//2
            if(self.noofBoquets(arr, k, mid)>=m):
                high = mid-1
            else:
                low = mid+1
        return -1 if low>maxArr else low
arr = list(map(int,input().split()))
k = int(input())
m = int(input())
obj = NoofDays()
results = obj.minDaysBloom(arr, k, m)
print(results)
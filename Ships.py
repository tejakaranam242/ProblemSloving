class Ships:
    def isShipped(self,arr,mid,D):
        totalDays = 1
        currentWeight = 0
        for i in arr:
            if currentWeight+i > mid:
                totalDays+=1
                currentWeight = i
            else:
                currentWeight+=i
        return True if totalDays<=D else False
    def leastWeightCapacity(self, arr, D):
        low = 0
        high = 0
        for i in arr:
            low = max(low,i)
            high += i
        while low<=high:
            mid = (low+high)//2
            if self.isShipped(arr,mid,D):
                high = mid-1
            else:
                low = mid+1
        return low
arr = list(map(int,input().split()))
D = int(input())
obj = Ships()
result = obj.leastWeightCapacity(arr, D)
print(result)
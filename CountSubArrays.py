class CountSubArrays:
    def countSubarrays(self, arr):
        count = 0
        for i in range(len(arr)):
            sum = 0
            product = 1
            for j in range(i,len(arr)):
                sum+=arr[j]
                product*=arr[j]
                if sum == product:
                    count+=1
        return count
arr = list(map(int,input().split()))
obj = CountSubArrays()
result = obj.countSubarrays(arr)
print(result)
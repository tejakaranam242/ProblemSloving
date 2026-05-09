class CountElements:
    def count_elements(self, arr):
        count = 1
        currentMax = arr[0]
        for i in range(1,len(arr)):
            if arr[i]>currentMax:
                count+=1
                currentMax = arr[i]
        return count
arr = list(map(int,input().split()))
obj = CountElements()
result = obj.count_elements(arr)
print(result)
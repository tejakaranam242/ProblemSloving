import sys
class NoofRotations:
    def findKRotation(self, arr):
        low = 0
        count = 0
        high = len(arr)-1
        Min = sys.maxsize
        while low<=high:
            mid = (low+high)//2
            if arr[low]<=arr[mid]:
                if arr[low]<Min:
                    Min = arr[low]
                    count = low
                low = mid+1
            else:
                if arr[mid]<Min:
                    Min = arr[mid]
                    count = mid
                high = mid-1
        return count
arr = list(map(int,input().split()))
obj = NoofRotations()
result = obj.findKRotation(arr)
print(result)

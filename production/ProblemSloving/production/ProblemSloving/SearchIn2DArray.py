class SearchIn2DArray:
    def searchMatrix(self, mat, x):
        low = 0
        high = len(mat)*len(mat[0])-1
        while low<=high:
            mid = (low+high)//2
            if mat[mid//len(mat[0])][mid%len(mat[0])] == x:
                return True
            elif mat[mid//len(mat[0])][mid%len(mat[0])] < x:
                low = mid+1
            else:
                high = mid-1
        return False

rows = int(input())
cols = int(input())
mat = []
for i in range(rows):
    row = list(map(int,input().split()))
    mat.append(row)
obj = SearchIn2DArray()
k = int(input())
result = obj.searchMatrix(mat,k)
print(result)
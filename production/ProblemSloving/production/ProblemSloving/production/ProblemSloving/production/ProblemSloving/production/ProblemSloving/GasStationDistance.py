class GasStationDistance:
    def noofStations(self,stations,mid):
        count = 0
        for i in range(1,len(stations)):
            gap = stations[i]-stations[i-1]
            numberInBetween = int(gap/mid)
            if gap/mid == numberInBetween:
                numberInBetween-=1
            count+=numberInBetween
        return count
    def minMaxDist(self, stations, k):
        low = 0
        high = 0
        for i in range(0,len(stations)-1):
            high = max(high,stations[i+1]-stations[i])
        diff = 1e-6
        while high-low>diff:
            mid = (low+high)/2.0
            count = self.noofStations(stations,mid)
            if count>k:
                low = mid
            else:
                high = mid
        return high
obj = GasStationDistance()
stations = list(map(int,input().split()))
k = int(input())
result = obj.minMaxDist(stations,k)
print(result)
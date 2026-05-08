class CompeteTheSkills:
    def scores(self, a, b):
        AScore = 0
        BScore = 0
        for i in range(0,3):
            if a[i]>b[i]:
                AScore+=1
            elif a[i]<b[i]:
                BScore+=1
        return [AScore,BScore]
a = list(map(int,input().split()))
b = list(map(int,input().split()))
obj = CompeteTheSkills()
result = obj.scores(a,b)
print(result)
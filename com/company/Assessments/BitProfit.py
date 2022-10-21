indicator=[1,2,3,4]
k=1
profit=[4,3,2,1]


k+=1
res, stack=0,list(zip(indicator,profit))
for i in range(32,-1,-1):
    if (k>>i)&1:
       res=max(res,sum(p for j,p in stack if not (j>>i)&1))          
    else:
       stack=[(j,p) for j,p in stack if not (j>>i)&1]
print(res)
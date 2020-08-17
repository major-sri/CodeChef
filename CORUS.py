t=int(input())
for _ in range(t):
    n,q=map(int,input().split())
    a=str(input())
    arr=list(a)
    di={}
    for x in arr:
        if x in di.keys():
            di[x]+=1
        else:
            di[x]=1

    for i in range(q):
        case=int(input())
        cnt=0
        for x in di.values():
            if x > case:
                cnt+=x-case
        print(cnt)# cook your dish here
        

        
        

t=int(input())
for _ in range(t):
    n=int(input())
    arr=list(map(int,input().split()))
    arr.sort()
    a=[]
    c=1
    for x in range(0,n-1):
        if arr[x+1]-arr[x]<=2:
            c+=1
        else:
            a.append(c)
            c=1
    a.append(c)
    
    print(min(a),max(a))
    
    

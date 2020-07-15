t=int(input())
for _ in range(t):
    a,k=map(int,input().split())
    arr=list(map(int,input().split()))
    c=0
    for x in range(a):
        if arr[x]>k:
            c+=(arr[x]-k)
    print(c)

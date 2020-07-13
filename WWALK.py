t=int(input())
for _ in  range(t):
    n=int(input())
    arr1 = list(map(int, input().split()))
    arr2 = list(map(int, input().split()))
    c=0
    d=0
    ans=0
    for i in range(n):
        if c==d:
            a=c
            c+=arr1[i]
            d+=arr2[i]
            if c==d:
                ans+=(c-a)
                
        else:
            c += arr1[i]
            d += arr2[i]
    print(ans)

t=int(input())
for x in range(t):
    n,q=map(int,input().split())
    c=0
    count=0
    for _ in range(q):
        a,b=map(int,input().split())
        count+=abs(c-a)
        count+=abs(b-a)
        c=b

    print(count)

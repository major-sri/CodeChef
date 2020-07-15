t= int(input())
for _ in range(t):
    l=list(map(int,input().split()))
    p=l[-1]
    c=0
    d=(24*5)
    l.pop(len(l)-1)
    for i in l:
        c+=(i*p)
    if c<=d:
        print('No')
    else:
        print('Yes')

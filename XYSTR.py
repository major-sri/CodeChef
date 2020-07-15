t=int(input())
for _ in range(t):
    arr = str(input())
    arr=list(arr)
    a=len(arr)
    x=0
    count=0
    while x<a-1:
        if arr[x]==arr[x+1]:
            x+=1
        else:
            count+=1
            x+=2
    print(count)

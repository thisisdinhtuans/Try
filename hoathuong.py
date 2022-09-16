import math
def sont(s):
    if(s==2 or s==3):
        return True
    if(s%2==0 or s%3==0 or s==1):
        return False
    i=5
    while(i*i<=s):
        if(s%i==0 or s%(i+2)==0):
            return False
        i+=6
    return True

t=int(input())
while(t>0):
    n,m=[int(x) for x in input().split()]
    x=str(math.gcd(n,m))
    sum=0
    for i in range(len(x)):
        sum+=int(x[i])
    if(sont(sum)):
        print("YES")
    else:
        print("NO")
    t-=1

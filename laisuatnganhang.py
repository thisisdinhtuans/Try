def sont(n):
    s=0
    for i in n:
        s+=int(i)
    if(s==2 or s==3):
        return True
    if(s%2==0 or s%3==0 or s==1):
        return False
    i=5
    while i*i<=s:
        if(s%i==0 or s%(i+2)==0):
            return False
        i+=6
    return True

def vt(n):
    for i in range(len(n)):
        if ((i%2==0 and int(n[i])%2==1) or (i%2==1 and int(n[i])%2==0)):
            return False
        return True

t=int(input())
while t>0:
    n=input()
    if(sont(n) and vt(n)):
        print("YES")
    else:print("NO")
    t-=1
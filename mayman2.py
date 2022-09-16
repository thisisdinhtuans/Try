str=input()
str_new=str.upper()
str_ola=str.lower()
t=0
for i in str:
    if i>=65:
        t+=1
    else: t-=1
if (t>0):
print(str_new);
else: print(str_ola);

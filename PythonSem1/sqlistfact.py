import random 
import math
num=[]
for i in range(0,11):
    num.append(random.randint(1,20))
print(num)

""" sqlist=[]
faclist=[]

for i in range (len(num)):
    sqlist.append(num[i]*num[i])
    faclist.append(math.factorial(num[i]))
 """

sqlist=[x**2 for x in num]
faclist=[math.factorial(x) for x in num]

print(sqlist)
print(faclist)

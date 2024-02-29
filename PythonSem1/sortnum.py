num = int(input("Enter a number "))
list=[]
list=int(''.join(num))
sortnum=0
if num<=0:
    print("Please enter a positive integer")
else:
    number=list(str(num))
    number.sort()
    if number[0]=='0':
        number[0]=number[1]
        number[1]='0'
    sortnum=int(''.join(number))
    print(sortnum)

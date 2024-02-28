def fact():
    x=1
    fact=1
    print("num  factorial")
    for x in range (1,16):
        fact=fact*x
        print(x,"\t ",fact," ")

fact()
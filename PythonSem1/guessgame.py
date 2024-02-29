import random

target=random.randint(1,100)
flag=True
count=0

while(flag):

    count=count+1
    guess=int(input("Make your guess: "))
    
    if(guess==target):
       print(f"Correct! Took {count} tries")
       flag=False
    
    elif(guess<target):
        print("Guess higher")
    
    else:
        print("Guess lower")

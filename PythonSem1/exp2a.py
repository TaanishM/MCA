password=str(input("Enter a password "))

upperc=False
digit=False
special=False
length=len(password)

if length<8:
    print("Password needs to be longer than 8 characters")
else:
    for c in password:
        if c.isupper():
            upperc=True
        if c.isdigit():
            digit=True
        if c in '@,_,$,%,&':
            special=True

if upperc and digit and special:
    print("Valid")
else:
    print("Invalid")
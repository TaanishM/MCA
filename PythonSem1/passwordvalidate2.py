#program to check strength of a password
password=input("Enter password ")
passlen = len(password)
uppercase=False
digit=False
special=False

for chara in password:
    if chara.isupper():
        uppercase=True
    if chara.isdigit():
        digit=True
    if chara in '@,_,$,%,&':
        special=True

if(passlen<8):
    print("Weak password, minimum 8 characters required")
elif uppercase and digit and special:
    print("Strong password, validated!")
elif uppercase==digit==special==False:
    print("Invalid password, requires alphanumeric and uppercase characters")
elif digit==False:
    print("Weak password, requires numeric characters")
elif uppercase==False:
    print("Weak password, requires uppercase characters")
elif special==False:
    print("Weak password, requires special characters")

    

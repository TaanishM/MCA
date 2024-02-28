def chkpalind(num):
    return str(num) == str(num)[::-1]

def nxtpal(inputint):
    while True:
        inputint += 1
        if chkpalind(inputint):
            return inputint

num=int(input("Enter palindromic number "))
result = nxtpal(num)
print(f"The next smallest palindrome of {num} is {result}")

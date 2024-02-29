student = {}

for i in range (5):
    print(f"Entry number ",i+1)
    roll = int(input("Enter Roll Number: "))
    student[roll] = [input("Enter Name: ")]
    student[roll] += [int(input("Enter Age: "))]
    student[roll] += [input("Enter Stream: ")]
    student[roll] += [int(input("Enter Phone Number: "))]
    print("\n")

search = int(input("Enter roll number to search: "))
print(student[search])

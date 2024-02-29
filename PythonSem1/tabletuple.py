import tabulate
student = {}

for i in range (3):
    print(f"Entry number ",i+1)
    rollno = int(input("Enter Roll Number: "))
    student[rollno]={}
    student[rollno]['Name'] = input("Enter Name: ")
    student[rollno]['Age'] = int(input("Enter Age: "))
    student[rollno]['Contact'] = int(input("Enter contact number: "))
    print("\n")

print("Name \t \t Roll \t Age \t Contact")
for key in student:
   print(f"{student[key]['Name']:<10} \t {key} \t {student[key]['Age']} \t{student[key]['Contact']}")

print("\n")
res = sorted(student.items(), key = lambda x: x[1]['Name'])
for i in res:
    print(i)
    print("\n")
tabulate

directory = {}
for i in range (20):
    print(f"Entry number ",i+1)
    name = input("Enter Name: ")
    directory[name] = [int(input("Enter Phone Number: "))]
    directory[name] += [input("Enter Address: ")]
    print("\n")

scraper = input("Enter name to look up: ")
if(scraper in directory) : print(directory[scraper])
else : print("Not Found")

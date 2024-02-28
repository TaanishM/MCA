dict = {181:"ABC", 182:"PQR", 183:"AUS", 184:"PIJ", 185:"OIQ", 186:"MSN", 187:"IQU", 188:"QWO", 189:"NEW", 190:"BQV"}
count = len(dict)

print("Roll Number \t Name")
for key in dict: print(f"{key:<15}\t{dict[key]}")

print("\nTotal records: ",count)
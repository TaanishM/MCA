matrix = [[1,2,3],[4,5,6],[7,8,9]]
row=[1,1,1]
column=[1,1,1]

for i in range(3):
    for j in range(0,3):
        row[i]=row[i]*matrix[i][j]

for i in range(0,3):
    for j in range(0,3):
        column[i]=column[i]*matrix[j][i]

print(row)
print(column)

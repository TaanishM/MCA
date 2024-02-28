matrix = [[1,2,3],[4,5,6],[7,8,9]]
row=[1,1,1]
column=[1,1,1]

for i in range(0,len(matrix)):
    for j in (0,len(matrix)):
        row[i-1]=row[i-1]*matrix[i-1][j-1]

print(row)

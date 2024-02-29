oglist = ["abc","asda","hgrwg","plalksd","hgrwg","abc","adasd","asda","asfd","palsd"]
indexlist=[]
listcheck=0

for i in range(len(oglist)):
    listcheck=i

    for j in range(i+1,len(oglist)):

        if(oglist[listcheck]==oglist[j]):
            indexlist.append([i,j,oglist[listcheck]])

indexlist.sort()
print(indexlist)

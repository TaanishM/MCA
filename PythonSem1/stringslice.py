names=["ABC","DEF","ABWERR","AWEQ","GEWGW","PKQWF","RTASAD","TARSD","BVBER","LKASLD","NASNCA","TWKJEWQ","YQWE","RAGDG","KASDLAS"]
start=int(input("Start value: "))
end=int(input("End value: "))

slicer=slice(start,end)
sliced=names[slicer]

print(sliced)
#for i in range(len(sliced)):
#    print(len(sliced[i]))
for n in sliced:
    print(len(n))

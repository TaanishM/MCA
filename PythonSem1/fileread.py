import json
with open("datafile.json","r") as file:
    load_data=json.load(file)
info = load_data["user"]
name=info["name"]
age=info["age"]
place=info["place"]
blgr=info["Blood Group"]
print(name,age,place,blgr)
import json
data = {
    "user": 
    {
        "name": "Ramu Kumar",
        "age": 21,
        "place": "Chandigarh",
        "Blood Group": "O+"
    }
}
with open("datafile.json","w") as write:
    json.dump(data,write)
import requests
response = requests.get("https://www.google.com")
with open("gooogle.html","w") as file:
    file.write(response.text)

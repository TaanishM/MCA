import requests
url="https://jsonplaceholder.typicode.com/posts"
response = requests.get(url)
re=response.json()
print(re)
send="ABCDEFG"
message=requests.post(url,data=send)
print(message)

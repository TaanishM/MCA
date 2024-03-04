import requests
import json
url ='https://jsonplaceholder.typicode.com/posts'
data_to_send ={'userld': 11,'id': 101,'title': 'Sample Title','body': 'Sample Body'}

data_json = json.dumps(data_to_send).encode('utf-8')

response = requests.post(url, data=data_json,)
if response.status_code == 201:
    print("Data sent successfully.")
else:
    print(f" Failed to send data. Status Code: {response.status_code}")
response = requests.get(url)
if response.status_code == 200:
    received_data = json.loads(response.text)
    print("Received Data:")
    print(received_data)
else:
    print(f"Failed to receive data. Status Code :{response.status_code}")

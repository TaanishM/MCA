import openpyxl
import mysql.connector
# Load the Excel file
excel_file = openpyxl.load_workbook("student_data.xlsx")
sheet = excel_file.active

# Define a connection to the MySQL database
db_connection = mysql.connector.connect(
    host='localhost',
    user='root',
    password='popcorntime',
    database='taan7119'
)

# Create a cursor to interact with the database
db_cursor = db_connection.cursor()

# Loop through rows and store records in the database
for row in sheet.iter_rows(min_row=2, values_only=True):
    first_name,last_name, roll_number, state, aadhaar_number, year_birth, age, percentage, reappears = row

    # Check if the student is clear and has a percentage above 60%
    if reappears == 0 and percentage > 60.0:
        # Define the SQL query to insert the record
        insert_query = "INSERT INTO students (first_name, last_name, roll_number, state, aadhaar_num, year_birth, age, percentage, reappears) VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s)"
        
        # Execute the query with the data
        db_cursor.execute(insert_query, (first_name, last_name, roll_number, state, aadhaar_number, year_birth, age, percentage, reappears))

# Commit the changes to the database
db_connection.commit()

# Close the cursor and the database connection
db_cursor.close()
db_connection.close()
print("Data from Excel file is successfully stored in the MySQL database.")

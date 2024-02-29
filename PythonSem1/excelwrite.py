import openpyxl
import mysql.connector

excel_file = openpyxl.load_workbook("exp8.xlsx")
sheet = excel_file.active

db_config = {
    'host': 'localhost',
    'user': 'root',
    'password': 'popcorntime',
    'database': 'taan7119'
}

# Create a connection to the MySQL database
db_connection = mysql.connector.connect(**db_config)
# Create a cursor to interact with the database
db_cursor = db_connection.cursor()

# Define the SQL query outside the loop
insert_query = "INSERT INTO newdata (stu_name, ID, course, enrol_year) VALUES (%s, %s, %s, %s)"

# Iterate through rows and store records in the database
for row in sheet.iter_rows(min_row=2, values_only=True):
    stu_name, ID, course, enrol_year = row

    # Execute the query with the data for each row
    db_cursor.execute(insert_query, (stu_name, ID, course, enrol_year))

# Commit the changes to the database
db_connection.commit()
# Retrieve data from the MySQL database
db_cursor.execute("SELECT stu_name, ID, course, enrol_year FROM newdata")
student_data = db_cursor.fetchall()

# Display the retrieved data
for student in student_data:
    stu_name, ID, course, enrol_year = student
    print(f"Student Name: {stu_name}, Student ID: {ID}, Course: {course}, Enrollment Year: {enrol_year}")

# Close the cursor and the database connection
db_cursor.close()
db_connection.close()

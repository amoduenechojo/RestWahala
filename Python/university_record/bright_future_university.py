department_course = [
    "Math", "Physics", "Computer Science", "Biology", "Chemistry",
    "Statistics", "English", "Economics", "History", "Philosophy",
    "Sociology", "Political Science", "Geography", "Psychology", "Art",
    "Music", "Engineering", "Law", "Medicine", "Business"
]

student_record = []
#
def validate_students_name(student_name):
    for char in student_name:
        if char.isdigit():
            return f"name: {student_name}".title()
    return "Name not accepted!"

def create_student():
    student_name = input("Enter student name: ")
    student_age = input("Enter student age: ")
    student_email_address = input("Enter student email address: ")
    student_course = input("Enter student course: ")
    student_zipcode = input("Enter student zipcode: ")
    student_city = input("Enter student city: ")

    student_details = {
        "student_name": student_name,
        "student_age": student_age,
        "student_email_address": student_email_address,
        "student_course": student_course,
        "Address": {
                "city": student_city,
                "zipcode": student_zipcode
        }
    }

    student_record.append(student_details)
    return "Student added successfully!"

# student_record_mistake_correction(student_record, student)


def display_student_courses(student_course):
    for course in student_course:
        if course not in department_course:
            return "Student course not found!"
    return student_course


def display_student_zipcode(student_zipcode):
    for zipcode in student_zipcode:
        if len(zipcode) != 6:
            return "Zipcode not found!"
    return student_zipcode

def display_student_city(student, student_city):
    for char in student_city:
        if char.isdigit():
            return f"City: {student['address']['city']}"
    return "City not found!"

def allows_student_add_new_course(student_course):
    if student_course not in student_record:
        return "Course not found!"

    new_course = input("Enter new course name: ")

    if new_course not in department_course:
        return "Course not found!"

    if new_course in student_record:
        return "Course already exists!"

    return "Course added successfully!"

# def student_record_mistake_correction(student_record):
#     if student_record in create_student():
#         return f"Student record mistake: {student_record}"
#     return student_record


def remove_course(course_to_remove):

    if course_to_remove not in department_course:
        return "Course not found!"

    course_to_remove = input("Enter the course you want to remove: ")

    if course_to_remove in student_record:
        return "Course removed already!"

    return "Course added successfully!"

def update_student_details(student_record, student):
    if student in student_record:
        return "Cannot update student details!"

    print("1. Update Name")
    print("2. Update Age")
    print("3. Update City")
    print("4. Update Zip Code")

    option = input("Enter an option ")
    return "Student update successful!"


from unittest import TestCase

import bright_future_university

class BrightFutureUniversity(TestCase):

    def test_that_student_name_with_numbers_should_be_rejected(self):
        student_name = "Haliyah17"

        actual = bright_future_university.validate_students_name(student_name)
        self.assertTrue(actual, "Haliyah")

    def test_that_student_can_give_information(self):

        student_record = {"name": "Hassan" , "age": 17 , "city": "Lagos", "Zipcode": 10001}

        expected = student_record
        actual = bright_future_university.create_student()

        self.assertTrue(expected, actual)

    def test_that_the_student_offer_departmental_courses(self):

        student_course =  ["Statistics", "English", "Economics", "History", "Philosophy"]

        expected = ["Statistics", "English", "Economics", "History", "Philosophy"]
        actual = bright_future_university.display_student_courses(student_course)

        self.assertEqual(expected, actual)

    def test_that_the_student_zipcode_is_six_digit_long(self):
        student_zipcode = "100001"

        actual = bright_future_university.display_student_zipcode(student_zipcode)
        self.assertTrue(actual, "100001")

    def test_that_city_entered_by_student_are_in_letters(self):
        student_city= "Lagos123"

        # expected = "Lagos"
        actual = bright_future_university.display_student_city(student_city)
        self.assertEqual(actual, "Lagos")

    def test_that_students_can_add_new_courses_to_their_already_existing_course(self):
        course_students_wants_to_add = ["Statistics", "Economics", "History", "Philosophy"]

        actual = bright_future_university.allows_student_add_new_course(course_students_wants_to_add)

        self.assertTrue(actual, course_students_wants_to_add)


    def test_that_students_can_remove_course_from_their_already_exisitng_course(self):
        student_course = {"Statistics", "Economics", "History", "Philosophy"}

        expected = {"Statistics", "Economics", "History", "Philosophy", "Medicine"}
        actual = bright_future_university.remove_course(student_course)

        self.assertEqual(actual, expected)


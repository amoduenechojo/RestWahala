from unittest import TestCase
import movie_rating

class MovieRatingTest(TestCase):

        def test_that_movie_can_be_added(self):
            movie_name = []

            expected = ["The Rise Of Alakija"]
            actual = movie_rating.add_movies

            self.assertEqual(expected, actual)

        def test_that_added_movie_cannot_be_added_again(self):
            movie_name = ["The Rise Of Alakija"]

            expected = ["The Rise Of Alakija"]
            actual = movie_rating.add_movies(movie_name)

            self.assertEqual(expected,actual)

        def test_that_movie_added_can_be_rated(self):
            movie_name = "Behind the Scene by Funke Akindele."

            expected = 5
            actual = movie_rating.rate_movie(movie_name)

            self.assertEqual(expected,actual)

        def test_that_rated_movie_can_be_rated_more_than_once(self):
            movie_name = "Behind the Scene by Funke Akindele."

            expected = 3
            actual = movie_rating.rate_movie(movie_name)

            self.assertEqual(expected,actual)

        def test_that_average_ratings_is_calculated_correctly(self):
            pass

if __name__ == '__main__':
    unittest.main()


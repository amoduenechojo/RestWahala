from datetime import datetime

movies = []
def add_movies(movie_name):
    if movie_name not in movies:
        movies.append(movie_name)
        now = datetime.now()
        return movies
    else:
        return "Movies already added."


def rate_movie(movie_rating):
    movie_name = input("Enter movie name: ")

    if movie_name in movies:
        index = movies.index(movie_name)

        movie_rating = int(input("Enter rating (1-5): "))

        if movie_rating > 0 or movie_rating <= 5:
            movie_rating[index].append(movie_rating)
            return "Rating added."
        else:
           return "Invalid rating."
    else:
       return "Movie not found. Add it first."


def get_average(movie_rating):
    movie_name = input("Enter movie name: ")

    if movie_name in movies:
        index = movies.index(movie_name)
        movie_ratings = movie_rating[index]

        if movie_ratings:
            return sum(movie_ratings) / len(movie_ratings)

        else:
            return "No ratings yet."

    return "Movie not found."


def get_average_rating_of_all_movies_in_the_app(movie_name):
    total = []
    count = []

    for ratings in movies.values():
        total += sum(ratings)
        count += [len(ratings)]

    if count == 0:
        return "No ratings yet."

    return total/count

# def Exit():
#     return "Goodbye!"



print("1. Add movies")
print("2. Rate movie")
print("3. Average of a movie")
print("4. Average Rating of all movie")
print("5. Exit")

options = int(input("Enter an option between 1 - 4: "))
print(options)

match options:
    case 1:
        movie_name = input("Enter movie name: ")
        print(add_movies(movie_name))
    case 2:
       rate_movie()
    case 3:
        get_average()
    case 4:
        get_average_rating_of_all_movies_in_the_app()
    case 5:
      print("Goodbye!")
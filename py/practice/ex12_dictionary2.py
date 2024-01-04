# Dictionary Functions
# You can use the .get() method to find keys in a dictionary, and use a second parameter to return a default value, in case the key is not found.

# Rewrite the given code to use the .get() method instead of the if/else statements.
# Also, change the output to "Book not found", when the book is not found.

books = {
    "Life of Pi": "Adventure Fiction",
    "The Three Musketeers": "Historical Adventure",
    "Watchmen": "Comics",
    "Bird Box": "Horror",
    "Harry Potter": "Fantasy Fiction",
    "Good Omens": "Comedy",
}

book = input()

# change this part to use the .get() method
# if(book in books):
#     print(books[book])
# else:
#     print("Not Found")

print(books.get(book, "Book not found"))

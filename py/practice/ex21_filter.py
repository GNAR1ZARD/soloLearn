# filter
# The function filter filters an iterable by removing items that don't match a predicate (a function that returns a Boolean).


# Given a list of names, output a list that contains only the names that consist of more than 5 characters.

names = ["David", "John", "Annabelle", "Johnathan", "Veronica"]

# your code goes here

# pass the names list as the first argument to the filter function to specify the iterable
print(list(filter(lambda name: len(name) > 5, names)))

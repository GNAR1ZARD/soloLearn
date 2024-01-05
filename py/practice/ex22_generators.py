# Generators
# We pass the names list as the first argument to the filter function to specify the iterable.
# - The yield statement is used to define a generator, replacing the return of a function to provide a result to its caller without destroying local variables.
# -Using generators results in improved performance, which is the result of the lazy (on demand) generation of values, which translates to lower memory usage. Furthermore, we do not need to wait until all the elements have been generated before we start to use them.

# Given a string as input, create a generator function that splits the string into separate words and outputs the resulting list.

# Sample Input
# This is some text

# Sample Output
# ['This', 'is', 'some', 'text']

txt = input()


def words():
    # your code goes here
    # split the input string into words and yield each word
    for word in txt.split():
        yield word


print(list(words()))

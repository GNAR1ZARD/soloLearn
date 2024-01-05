# Decorators
# Decorators provide a way to modify functions using other functions.
# This is ideal when you need to extend the functionality of functions that you don't want to modify.
# - A single function can have multiple decorators.

# You are given code that takes input and prints it as a simple row of text.

# Add the uppercase_decorator to make the text uppercase.

text = input()


def uppercase_decorator(func):
    def wrapper(text):
        # your code goes here
        result = func(text)  # call the original function
        return result.upper()  # convert the result to uppercase

    return wrapper  # return the wrapper function


@uppercase_decorator
def display_text(text):
    return text


print(display_text(text))

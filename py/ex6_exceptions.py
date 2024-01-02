# Exception Handling
# We need to create a program that allows users to create their own PIN codes for their bank cards. Each PIN code consists of digits. Complete the program so that when the user enters a character, the program stops and outputs "Please enter a number" and when the user enters only digits, the program outputs "PIN code is created".

# Sample Input
# 44a5

# Sample Output
# Please enter a number

pin = input()
try:
    # your code goes here
    int(pin)  # check if pin == int
    print("PIN code is created")

except ValueError:
    # and here
    print("Please enter a number")


# Here are some common exception types in Python:

# ValueError: Raised when an operation or function receives an argument of the correct type but with an inappropriate value.

# TypeError: Raised when an operation or function is applied to an object of an inappropriate type.

# ZeroDivisionError: Raised when you try to divide by zero.

# IndexError: Raised when you try to access an index that is out of range in a sequence (e.g., a list, tuple, or string).

# KeyError: Raised when you try to access a dictionary key that does not exist.

# FileNotFoundError: Raised when you try to open or access a file that does not exist.

# IOError: Raised for I/O-related errors, like reading from or writing to a file.

# NameError: Raised when a local or global name is not found.

# AttributeError: Raised when an object does not have the attribute or method you are trying to access.

# SyntaxError: Raised when there is a syntax error in your code.

# Exception: The base class for all exceptions in Python.
# You can catch all exceptions by using this keyword, but it's generally recommended to catch more specific exceptions whenever possible.

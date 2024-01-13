# Function Arguments
# Python allows to have function with varying number of arguments.
# Using *args as a function parameter enables you to pass an arbitrary number of arguments to that function. The arguments are then accessible as the tuple args in the body of the function.

print("Ex:1")
# Given a function that takes 2 arguments and returns their sum.
# But we get an error when we want to sum more than 2 numbers. Change the function and complete the code so that the function sums as many numbers as are input.

#change the function
def adder(*args):
    result = sum(args)
    print(result)

adder(2, 3)
adder(2, 3, 4)
adder(1, 2, 3, 4, 5)

print("Ex:2")
# **kwargs (standing for keyword arguments) allows you to handle named arguments that you have not defined in advance.
# The keyword arguments return a dictionary in which the keys are the argument names, and the values are the argument values.
def my_func(x, y=7, *args, **kwargs):
   print(kwargs)

my_func(2, 3, 4, 5, 6, a=7, b=8)
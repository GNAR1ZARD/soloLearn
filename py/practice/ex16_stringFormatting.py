# String Formatting
# The .format() method provides an easy way to format strings.
# Take as input a name and an age, and generate the output "name is age years old".

# Sample Input
# James
# 42

# Sample Output
# James is 42 years old

# Recall, you can use braces to embed variable values into strings.

name = input()
age = int(input())

# your code goes here
output = "{n} is {a} years old".format(n=name, a=age)

print(output)

# other examples:
# a = "{x}, {y}".format(x=5, y=12)
# print(a)

# # string formatting
# nums = [4, 5, 6]
# msg = "Numbers: {0} {1} {2}". format(nums[0], nums[1], nums[2])
# print(msg)

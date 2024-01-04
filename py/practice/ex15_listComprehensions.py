# List Comprehensions
# Write a program to take a number as input, and output a list of all the numbers below that number,
# that are a multiple of both, 3 and 5.

# Sample Input
# 42

# Sample Output
# [0, 15, 30]

x = int(input())
# your code goes here
result = [num for num in range(x) if num % 3 == 0 and num % 5 == 0]

print(result)

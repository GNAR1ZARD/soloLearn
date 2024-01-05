# Lambdas
# The given code takes a number as input and uses a lambda function to calculate its double
# and output the result.

# Change the code to calculate the cube of the input and output it.

# Sample Input
# 3

# Sample Output
# 27

x = int(input())

# lambda function 'z' takes argument x
y = (lambda z: z**3)(x)

print(y)

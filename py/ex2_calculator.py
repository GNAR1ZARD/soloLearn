# Simple Calculator
# Write a program to take two integers as input and output their sum.

# Sample Input:
# 2
# 8

# Sample Output:
# 10

print("Please input two numbers (comma separated):")
input_values = input()  # Accept comma-separated input as a string
x, y = map(int, input_values.split(','))  # Split the string and convert each part to an integer

def calculator(x, y):
    total = x + y
    return total  # Return the sum

# Call the function and display the result
result = calculator(x, y)

# An f-string allows you to embed expressions (like variables or calculations) directly inside a string by placing them inside curly braces {}. 
# It makes it easy to construct strings dynamically.
print(f"The sum of {x} and {y} is: {result}")

# Celsius to Fahrenheit
# You are making a Celsius to Fahrenheit converter.
# Write a function to take the Celsius value as an argument and return the corresponding Fahrenheit value.

# Sample Input
# 36

# Sample Output
# 96.8

# Hint:
# Multiply the Celsius temperature by 1.8 then add 32

# Take input as a float (to allow decimal values)
temp = float(input())

# Define the function
def convert(temp):
    return (temp * 1.8) + 32  # Return the calculated Fahrenheit value

# Call the function and print the result
print(convert(temp))
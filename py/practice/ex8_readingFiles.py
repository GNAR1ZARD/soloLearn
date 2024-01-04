# Reading files
# Tom has done pull ups every day and recorded his results. He recorded each day's results in a new line, so that each line represents each day he has done pull ups.
# Create a program that takes n number as input and outputs the n-th days result (starting from 0).

# Sample Input
# 4

# Sample Output
# Day 4, 9 pull ups

# Open the file for reading
file = open("/usercode/files/pull_ups.txt")

# Read the user input as n, representing the day we want to retrieve (starting from 0)
n = int(input())

# Your code goes here
# Initialize the result variable
result = None

# Loop through the lines in the file to find the n-th days result
for day in range(n + 1):  # Range from 0 to n (inclusive)
    line = file.readline()
    if day == n:
        result = line.strip() # remove any leading or trailing whitespace
        break

# close the file
file.close()

# check if a result was found and print the output
if result is not None:
    print(f"{result}") # convenient way to format strings with variable values
else:
    print(f"Day {n} not found in the records")

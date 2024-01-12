# Phone Number Validator
# You are given a number input, and need to check if it is a valid phone number.
# A valid phone number has exactly 8 digits and starts with 1, 8 or 9.
# Output "Valid" if the number is valid and "Invalid", if it is not.

# Sample Input
# 81239870

# Sample Output
# Valid

import re

# input
phone_number = input()

# re pattern for a valid phone number
pattern = r"^[189]\d{7}$"

# check if the input phone number matches the pattern
if re.match(pattern, phone_number):
    print("Valid")
else:
    print("Invalid")


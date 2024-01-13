# else with for
# The else statement is most commonly used along with the if statement, but it can also follow a for or while loop, which gives it a different meaning.
# With the for or while loop, the code within it is called if the loop finishes normally (when a break statement does not cause an exit from the loop).

# The carousel is designed for 3 people who are each at least 16 years old.
# You are given a program that takes all 3 passengers' ages as inputs and inserts them in a list. Complete the program so that if it finds a value less than 16, it breaks the loop and outputs "Too young!".
# If the age requirement is satisfied, the program outputs "Get ready!".

# Sample Input
# 18
# 26
# 19

# Sample Output
# Get ready!

# With the while loop, the code within the else block is called if the loop finishes normally, so that's where you need to output the "Get ready!" message.

ages = []
i = 0

while i < 3:
    age = int(input())
    ages.append(age)
    i += 1

    if age < 16:
        print("Too young!")
        break
else:
    print("Get ready!")

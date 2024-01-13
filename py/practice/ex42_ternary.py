# Ternary Operator
# Conditional expressions provide the functionality of if statements while using less code. They shouldn't be overused, as they can easily reduce readability, but they are often useful when assigning variables.
# Conditional expressions are also known as applications of the ternary operator.

# You are given a program for a bank card withdrawal system: it takes the account and the amount that the user wants to withdraw, then outputs the remaining money. If the requested cash is greater than the balance, the program outputs "Error".
# The bank wants to set a minimal value of $500 for withdrawal. Modernize the program so that it will output the same "Error" if the requested money is less than $500.

# Sample Input
# 4500
# 300

# Sample Output
# Error

# As with other operators, you can chain multiple conditions with the ternary operator.

balance = int(input())
to_cash = int(input())

# change the code
# check if to_cash is less than or equal to balance and greater than or equal to 500
money_left = "Error" if (to_cash > balance) or (to_cash < 500) else balance - to_cash

print(money_left)

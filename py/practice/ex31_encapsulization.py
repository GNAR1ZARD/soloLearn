# Data Hiding
# A key part of object-oriented programming is encapsulation, which involves packaging of related variables and functions into a single easy-to-use object - an instance of a class.
# A related concept is data hiding, which states that implementation details of a class should be hidden, and a clean standard interface be presented for those who want to use the class.
# In other programming languages, this is usually done with private methods and attributes, which block external access to certain methods and attributes in a class.

# The Python philosophy is slightly different. It is often stated as "we are all consenting adults here", meaning that you shouldn't put arbitrary restrictions on accessing parts of a class. Hence there are no ways of enforcing a method or attribute be strictly private.

# Weakly private methods and attributes have a single underscore at the beginning.
# This signals that they are private, and shouldn't be used by external code. However, it is mostly only a convention, and does not stop external code from accessing them.
# Its only actual effect is that from module_name import * won't import variables that start with a single underscore.

# Strongly private methods and attributes have a double underscore at the beginning of their names. This causes their names to be mangled, which means that they can't be accessed from outside the class.
# The purpose of this isn't to ensure that they are kept private, but to avoid bugs if there are subclasses that have methods or attributes with the same names.
# Name mangled methods can still be accessed externally, but by a different name. The method __privatemethod of class Spam could be accessed externally with _Spam__privatemethod.


# You are given a BankAccount class and need to add a deposit() method to it, which adds the given amount to the private balance property.

# The code should declare a BankAccount object with an initial balance of 0, take a number from user input, add it to the balance using the deposit() method, and output the object.

# Complete the required deposit() method so the code works as expected and produces the required output.

class BankAccount:
    def __init__(self, balance):
        self._balance = balance

    def __repr__(self):
         return "Account Balance: {}".format(self._balance)
    
    def deposit(self, amount):
        #your code goes here
        self._balance += amount

acc = BankAccount(0)
acc.deposit(int(input()))
print("Account Balance:", acc._balance)

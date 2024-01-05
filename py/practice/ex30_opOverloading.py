# Magic Methods
# Magic methods are special methods which have double underscores at the beginning and end of their names.
# They are also known as dunders.
# So far, the only one we have encountered is __init__, but there are several others.
# They are used to create functionality that can't be represented as a normal method.

# One common use of them is operator overloading.
# This means defining operators for custom classes that allow operators such as + and * to be used on them.
# An example magic method is __add__ for +.
# More magic methods for common operators:
# __sub__ for -
# __mul__ for *
# __truediv__ for /
# __floordiv__ for //
# __mod__ for %
# __pow__ for **
# __and__ for &
# __xor__ for ^
# __or__ for |

# The expression x + y is translated into x.__add__(y).
# However, if x hasn't implemented __add__, and x and y are of different types, then y.__radd__(x) is called.
# There are equivalent r methods for all magic methods just mentioned.

# Python also provides magic methods for comparisons.
# __lt__ for <
# __le__ for <=
# __eq__ for ==
# __ne__ for !=
# __gt__ for >
# __ge__ for >=

# If __ne__ is not implemented, it returns the opposite of __eq__.
# There are no other relationships between the other operators.

# There are several magic methods for making classes act like containers.
# __len__ for len()
# __getitem__ for indexing
# __setitem__ for assigning to indexed values
# __delitem__ for deleting indexed values
# __iter__ for iteration over objects (e.g., in for loops)
# __contains__ for in

# There are many other magic methods that we won't cover here, such as __call__ for calling objects as functions, and __int__, __str__, and the like, for converting objects to built-in types.


# Operator Overloading
# The __add__ method allows for the definition of a custom behavior for the + operator in our class.

# The provided code is trying to add together two BankAccount objects, which should result in a new object with the sum of the balances of the given accounts.
# Fix the code to make it work as expected and output the resulting account balance.

class BankAccount:
    def __init__(self, balance):
        self.balance = balance
     
    # self represents the left-hand operand (a in a + b)
    # other represents the right-hand operand (b in a + b) 
    def __add__(self, other):
        # create a new BankAccount object with the sum of balances
        return BankAccount(self.balance + other.balance)
        
a = BankAccount(1024)
b = BankAccount(42)

result = a + b
print(result.balance)
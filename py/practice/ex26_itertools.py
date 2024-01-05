# itertools
# The module itertools is a standard library that contains several functions that are useful in functional programming.
# One type of function it produces is infinite iterators.
# The function count counts up infinitely from a value.
# The function cycle infinitely iterates through an iterable (for instance a list or string).
# The function repeat repeats an object, either infinitely or a specific number of times.
# There are many functions in itertools that operate on iterables, in a similar way to map and filter.
# Some examples:
# takewhile - takes items from an iterable while a predicate function remains true;
# chain - combines several iterables into one long one;
# accumulate - returns a running total of values in an iterable.
# There are also several combinatoric functions in itertool, such as product and permutation.
# These are used when you want to accomplish a task with all possible combinations of some items.

# You are given a list of items, and need to find all the possible orders of the items.
# The output should be a list, containing all possible orders.

# Sample Input
# ['a', 'b']

# Sample Output
# [('a', 'b'), ('b', 'a')]

from itertools import permutations

items = ['x', 'y']

#your code goes here
print(list(permutations(items)))
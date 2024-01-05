# Sets
# Sets are data structures, similar to lists or dictionaries. They are created using curly braces, or the set function. They share some functionality with lists, such as the use of in to check whether they contain a particular item.
# Sets differ from lists in several ways, but share several list operations such as len.
# They are unordered, which means that they can't be indexed.
# They cannot contain duplicate elements.
# Due to the way they're stored, it's faster to check whether an item is part of a set, rather than part of a list.
# Instead of using append to add to a set, use add.
# The method remove removes a specific element from a set; pop removes an arbitrary element.
# Sets can be combined using mathematical operations.
# The union operator | combines two sets to form a new one containing items in either.
# The intersection operator & gets items only in both.
# The difference operator - gets items in the first set but not in the second.
# The symmetric difference operator ^ gets items in either set, but not both.

# Sets are created using curly braces and they hold unique values.

# Given two sets, find and output all the elements that are common to both sets.
# For example, for the following sets:
# {'a', 'b', 'c'}
# {'c', 'd', 'e'}

# The output should be {'c'}, as it is present in both sets.

set1 = {2, 4, 5, 6}
set2 = {4, 6, 7, 8, 11, 42, 2}

# your code goes here
print(set1 & set2)

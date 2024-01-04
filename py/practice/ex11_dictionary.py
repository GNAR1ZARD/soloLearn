# Dictionaries
# Dictionaries can be used to store key:value pairs.

# You have been asked to create an inventory management program for a store. 
# You use a dictionary to track all of the store's inventory along with how many of each item the store has.

store = {"Orange": 2, "Watermelon": 0, "Apple": 8, "Banana": 42}

#your code goes here
print(store["Apple"]) # like hashtables - key, val pair

nums = {
    1: "one",
    2: "two",
    3: "three",
}
print(1 in nums)
print("three" in nums)
print(4 not in nums)

pairs = {1: "apple",
  "orange": [2, 3, 4], 
  True: False, 
  None: "True",
}

print(pairs.get("orange"))
print(pairs.get(7))
print(pairs.get(12345, "not in dictionary"))
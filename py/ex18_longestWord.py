# Longest Word
# Given a text as input, find and output the longest word.

# Sample Input
# this is an awesome text

# Sample Output
# awesome

# Recall the split(' ') method, which returns a list of words of the string.

txt = input()

#your code goes here
words = txt.split()

# init vars to keep track of the longest word and its length
longest_word = ""
max_length = 0

# iterate through the words to find the longest 
for word in words:
    if len(word) > max_length:
        longest_word = word
        max_length = len(word)

print(longest_word)
# Writing Files
# You are given the following list:

# names = ["John", "Oscar", "Jacob"]
# PY
# Complete the program to create a file where you write the names from the list, each on a new line, and separately output them.

# Output
# John
# Oscar
# Jacob

names = ["John", "Oscar", "Jacob"]

file = open("names.txt", "w+")  # write and read mode
# write down the names into the file
for name in names:
    file.write(name + "\n")

file.close()

file = open("names.txt", "r")
# output the content of file in console
for line in file:
    print(line.strip())  # strip newline characters to print each name on a new line

file.close()

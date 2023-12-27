n = int(input())  # user input


def fizz_buzz(n):  # define a function named fizz_buzz that takes an argument 'n'
    for i in range(1, n):
        if i % 2 != 0:  # Check if the number is odd
            output = ""
            if i % 3 == 0:
                output += "Solo"
            if i % 5 == 0:
                output += "Learn"
            if not output:
                output = i  # If not a multiple of 3 or 5, print the number itself
            print(output)


fizz_buzz(n)  # call the func

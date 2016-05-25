'''
This is the very basic factorial function seen everywhere. For integers
greater than zero, this function looks for factorial (n-1) until
factorial(1) = 1, which returns 1. Using this base case, the nested
functions then recalculate down the stack, using the base case as the
starting point. Factorial(2) is the first example of the function that
recursively called something now being able to return a value. When it
was first called, factorial(2) was slated to return n*factorial(n-1).
Only after factorial(1) evaluated to 1 could we then start peeling layers
off the stack and returning the values of these recursive definitions:
factorial(2) evaluates to 2 * 1 (returns 2), factorial(3) returns 3 * 2 (6),
and so on. This code also assumes the user will only enter integers!
'''


def factorial(n):

    if n == 0:
        return 1
    if n == 1:
        return n
    elif n > 1:
        return n * factorial(n - 1)    

#Print some basic test values for this function
print "factorial(0) is: ", factorial(0)
print "factorial(1) is: ", factorial(1)
print "factorial(2) is: ", factorial(2)
print "factorial(6) is: ", factorial(6)
print "factorial(20) is: ", factorial(20)


        

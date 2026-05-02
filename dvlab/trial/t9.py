#Create a tuple with 5 elements. Try to change one element, catch the error, and print why it happened.

tup = (1,2,3,4,5)

try:
    tup[2] = 9
except:
    print("Error not possible as tuples are immutable")

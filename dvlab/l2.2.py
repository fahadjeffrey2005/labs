#. Write a Python code block to create a tuple with five elements. Try to change one of the elements and handle the error that occurs. Print a message that explains why the error occurred.
arr = (1, 2, 3, 4, 5)

try:
    arr[2] = 10
except TypeError:
    print("Error: Tuples are immutable, so their elements cannot be changed.")

print(arr)


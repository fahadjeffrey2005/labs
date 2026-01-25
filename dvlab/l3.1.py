#Generate a 3x4 NumPy array with random integers between 1 and 50.
#  a. Calculate and print the Mean, Median, and Standard Deviation of the array b. Print the Sum of all elements and the sum of each row.        c. Reshape the 3x4 array into a 2x6 array and print it.

import numpy as np

a = int(input("Enter the number of rows: "))
b = int(input("Enter the number of columns: "))

arr = np.random.randint(1, 51, size=(a, b))
print(arr)
avg = arr.mean()

arr1 = arr.flatten()
arr1.sort()

n = a * b
if n % 2 != 0:
    median = arr1[n // 2]
else:
    median = (arr1[n // 2 - 1] + arr1[n // 2]) / 2

sd = arr.std()

print("Mean:", avg)
print("Median:", median)
print("Standard Deviation:", sd)

print("Total Sum:", arr.sum())
print("Row-wise Sum:", arr.sum(axis=1))

if a * b == 12:
    print("Reshaped Array:\n", arr.reshape(2, 6))

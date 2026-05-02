"""
Practice Set 1 – Arrays & Statistics
1. Create a 4×5 NumPy array with random integers between 10 and 100. Then:
a. Find mean, median, and standard deviation of the entire array
b. Find minimum and maximum value in the array
c. Find sum of each column
d. Replace all values greater than 70 with 0
e. Flatten the array into 1D
"""

import numpy as np

arr1 = np.random.randint(10,101, size=(4,5))
print(arr1)
print(f"Mean: {np.mean(arr1)}")
print(f"Median: {np.median(arr1)}")
print(f"Standard Deviation: {np.std(arr1)}")

print(f"Maximum value: {np.max(arr1)}")
print(f"Minimum value: {np.min(arr1)}")

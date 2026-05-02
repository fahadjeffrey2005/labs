#Generate a 3×4 array of random integers (1–50). Find mean, median, std, total sum, row-wise sum, and reshape to 2×6.

import numpy as np
matrix = np.random.randint(1,50, size=(3,4))
print(matrix)

print(f"Maximum value: {np.max(matrix)}")
print(f"Minimum value: {np.min(matrix)}")
print(f"Std Deviation: {np.std(matrix)}")
print(f"Sum: {np.sum(matrix)}")
print(f"Row - Sum: {np.sum(matrix, axis=1)}")
print(f"Reshaped Matrix: \n {np.reshape(matrix, (2,6))}")



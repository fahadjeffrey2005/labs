#Create two 3×3 matrices. Perform addition, subtraction, element-wise multiply, dot product, transpose, determinant, and inverse.

#m1 = int(input("Enter no of rows of matrix 1: "))
#n1 = int(input("Enter no of cols of matrix 1: "))
#A = [[0 for j in range(n1)] for i in range(m1)]
#for i in range(m1):
#    for j in range(n1):
#        A[i][j] = int(input())
#
#print(A)


import numpy as np
m1 = np.random.randint(1,9, size =(3,3))
m2 = np.random.randint(1,9, size =(3,3))
print(m1)
print(m2)
print(f"The sum of the two matrices: \n{m1+m2}")
print(f"The difference of the two matrices: \n{m1-m2}")
print(f"The dot product of the two matrices: \n{m1*m2}")
print(f"The product of the two matrices: \n{m1@m2}")
print(f"The transpose of the matrix A: \n{m1.T}")
print(f"The determinant of the matrix A: \n{np.linalg.det(m1)}")
print(f"The inverse of the matrix A: \n{np.linalg.inv(m1)}")

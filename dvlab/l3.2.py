#2. Create two (3 * 3) matrices using NumPy and print it. Perform and print the results of the following linear algebra operations a. Matrix addition b. Matrix subtraction c. Matrix multiplication (element-wise and dot product) d. Transpose of a matrix e. Determinant and inverse (if applicable)
import numpy as np

a1 = int(input("Enter the number of rows of array 1: "))
b1 = int(input("Enter the number of columns of array 1: "))

arr1 = np.zeros((a1, b1), dtype=int)
for i in range(0,a1):
    for j in range(0,b1):
        arr1[i][j] = int(input(f"Enter element {i},{j}: "))
print(arr1)

a2 = int(input("Enter the number of rows of array 2: "))
b2 = int(input("Enter the number of columns of array 2: "))

arr2 = np.zeros((a2, b2), dtype=int)
for i in range(0,a2):
    for j in range(0,b2):
        arr2[i][j] = int(input(f"Enter element {i},{j}: "))
print(arr2)

menu = {
    1: "Addition",
    2: "Subtraction",
    3: "Element-wise Multiplication",
    4: "Matrix Multiplication (Dot Product)",
    5: "Transpose",
    6: "Determinant",
    7: "Inverse"
}
print("Choose operation: ")
for i in menu:
    print(f"{i}. {menu[i]}")
x = int(input("Enter option number: "))

match x:
    case 1:
        print(arr1+arr2)
    case 2:
        print(arr1-arr2)
    case 3:
        print(arr1*arr2)
    case 4:
        print(np.dot(arr1,arr2))
    case 5:
        print("Transpose of arr1:\n", arr1.T)
        print("Transpose of arr2:\n", arr2.T)
    case 6:
        print("Determinant of arr1:\n", np.linalg.det(arr1))
        print("Determinant of arr2:\n", np.linalg.det(arr2))
    case 7:
        print("Inverse of arr1:\n", np.linalg.inv(arr1))
        print("Inverse of arr2:\n", np.linalg.inv(arr2))
    case _:
        print("Invalid input.")

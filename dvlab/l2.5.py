#Write a Python code block to input numbers into two sets. Perform union, intersection, and difference operations on the sets and print the results.

n1 = int(input("Enter the size of the first set: "))
a = [0] * n1
for i in range(0,n1):
    a[i] = int(input(f"Enter element {i}: "))
n2 = int(input("Enter the size of the second set: "))
b = [0] * n2
for i in range(0,n2):
    b[i] = int(input(f"Enter element {i}: "))

print(f"Union: {set(a)|set(b)}")
print(f"Intersection: {set(a)&set(b)}")
print(f"A - B: {set(a)-set(b)}")
print(f"B - A: {set(b)-set(a)}")

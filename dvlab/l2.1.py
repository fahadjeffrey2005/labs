#write a python code block that inputs numbers into a list, print the largest and the smallest, the sum and average of the numbers input and count specific occurances of the element in the list
n = int(input("Enter the size of the list: "))
arr = [0] * n
count = [0] * n

for i in range(n):
    arr[i] = int(input(f"Enter element {i+1}: "))

largest = arr[0]
smallest = arr[0]

for i in range(n):
    if arr[i] > largest:
        largest = arr[i]
    if arr[i] < smallest:
        smallest = arr[i]

for i in range(n):
    count[i] = arr.count(arr[i])

print(smallest)
print(largest)

for i in range(n):
    print(f"{arr[i]} has {count[i]} instances")

#Input numbers into a list. Print the largest, smallest, sum, average, and count occurrences of a specific number.
n= int(input("Enter size of list: "))
numbers=[]
print(f"Enter {n} elements:")
for i in range(n):
    x = int(input())
    numbers.append(x)
    
print(f"List: {numbers}")
print(f"Maximum: {max(numbers)}")
print(f"Minimum: {min(numbers)}")
print(f"Sum: {sum(numbers)}")
print(f"Avg: {sum(numbers)/len(numbers)}")

x = int(input("Enter the number to be checked for frequency: "))
print(f"Frequency of {x} is: {numbers.count(x)}")


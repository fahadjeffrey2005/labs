#add two elements. int float or string
a = input("Enter value 1:")
b = input("Enter value 2:")

if a.isdigit():
    print("First value is an integer")
    a = int(a)
elif a.replace('.','',1).isdigit():
    print("First value is a floating point variable")
    a = float(a)
else:
    print("Second value is a string")
    
if b.isdigit():
    print("Second value is an integer")
    b = int(b)
elif b.replace('.','',1).isdigit():
    print("Second value is a floating point variable")
    b = float(b)
else:
    print("Second value is a string")
    
print(f"Result of addition {a+b}")

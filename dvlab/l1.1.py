#calculator to perform +,-./,*

calc = {
    "1" : "Addition",
    "2" : "Substraction",
    "3" : "Multiplication",
    "4" : "Division"
}
print("Calculator: \n1. Addition\n2. Substraction\n3. Multiplication \n4. Division")
op = int(input("Enter your option: "))
a = int(input("Enter value 1: "))
b = int(input("Enter value 2: "))
op_name = calc[str(op)]
match op:
    case 1:
        print(f"You have selected {op_name} and the output is {a + b}")
    case 2:
        print(f"You have selected {op_name} and the output is {a - b}")
    case 3:
        print(f"You have selected {op_name} and the output is {a * b}")
    case 4:
        print(f"You have selected {op_name} and the output is {a / b}")

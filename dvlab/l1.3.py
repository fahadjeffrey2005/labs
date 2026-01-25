#sequence between 1 to 100, prints all odd numbers and adds all even numbers

sum =0
for i in range(1,101):
    if(i%2 ==0):
        print(i)
    else:
     sum += i
     
print(f"Sum of odd numbers: {sum}")

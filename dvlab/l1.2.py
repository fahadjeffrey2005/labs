##prime number checker
#
#a = int(input("Enter value: "))
#if a<=1:
#    print("Prime.")
#else:
#    p = True
#    for i in range (2,a):
#        if (a%i == 0):
#            p = False
#            break
#        
#    if p:
#        print("Prime number.")
#    else:
#        print("Not prime number.")
def isPrime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True
num = int(input("Enter an integer: "))

if isPrime(num):
    print("Prime Number")
else:
    print("Not a prime number")

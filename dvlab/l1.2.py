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
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

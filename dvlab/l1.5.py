#Write a Python function that takes a string input from the user and counts the number of vowels and consonants in the string
str = input("Enter the string: ")

vowels = "aeiouAEIOU"
vc = cc =0
for ch in str:
    if ch in vowels:
        vc+=1
    else:
        cc+=1
print(f"The number of vowels is: {vc}")
print(f"The number of consonants is: {cc}")

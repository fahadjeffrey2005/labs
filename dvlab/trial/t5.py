#Write a function that takes a string and returns the count of vowels and consonants separately.
str = input("Enter string to be checked: ")
vowels = "aeiouAEIOU"
vcount =0
ccount =0
for ch in str:
    if ch in vowels:
        vcount = vcount +1
    elif ch.isalpha():
        ccount = ccount +1
print(f"Number of vowels: {vcount}, Number of consonants: {ccount}")

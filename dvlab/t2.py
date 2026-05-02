#write a python progtam to search for a given word in a text file. the word to be searched should be provided by the user. theprogtam should read the file content and count how many times the given word appeards in the file . display the total number of occurences of the word

fn = input("Enter the name of the file: ")
w = input("Enter the word to be searched for: ")
count =0
with open(fn,'r') as file:
    for line in file:
        words = line.split()
        count += words.count(w)
print("Total number of occurrences of the word:", count)

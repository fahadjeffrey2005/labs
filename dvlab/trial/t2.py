##Write a Python code block that inputs a sentence from the user. Count the frequency of each word in the sentence and store the result in a dictionary. Prints the dictionary with words as keys and their frequencies as values.

sent = input("Enter a sentence: ")
words = sent.split()
freq ={}
i =0

while i <len(words):
    word = words[i]
    
    if word in freq:
        freq[word] +=1
    else:
        freq[word] = 1
    i =+ 1
print(freq)

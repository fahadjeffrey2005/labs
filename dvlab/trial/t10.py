#Count the frequency of each word in a sentence using a dictionary. Print words as keys and frequencies as values.

sent = input("Enter a sentence: ")
freq = {}

for i in sent.split():
    word = i
    if word not in freq:
        freq[word] =1
    else:
        freq[word] +=1
        
print(freq)

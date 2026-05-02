#write a python progam that accepts a text file as input and then should open the file in read mode and calculate

#the total number of lines present in the file
#the total number of words present in the file
#the total number of characters present in the file

#finally the program should display all the three counts clearly



#write a python program to read a text and display on the those lines that start with a vowel (AEIOU, aeiou) the program should igrnoe the lines that start with consonants digits or special characters


#write a python program that reads the contents of text file and identifies all the words heaving an even number of characters and writes only those eveb lenght words in the another output file. the original file content should remain unchanged


#write a python program to read a text file and count the freqency of each word present in the file . the program should display each word along with the number of times it appears in the file


fn = input("Enter name of the file: ")

with open(fn,'r') as file:
    lines = file.readlines()

nl = len(lines)

nw=0
nc=0

for line in lines:
    nw += len(line.split())
    nc += len(line)

print("Total number of lines:", nl)
print("Total number of words:", nw)
print("Total number of characters:", nc)

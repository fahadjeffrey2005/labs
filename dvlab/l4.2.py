'''
Create a data frame with details of 10 students and columns as
Roll Number, Name, Gender, Marks1, Marks2, Marks3.
a. Create a new column with total marks
b. Find the lowest marks in Marks1
c. Find the Highest marks in Marks2
d. Find the average marks in Marks3
e. Find student name with highest average
f. Find how many students failed in Marks2 (<40)

'''
import pandas as pd
roll = []
name = []
gender = []
marks1 = []
marks2 = []
marks3 = []

n = int(input("Enter the number of students: "))
for i in range(n):
    print(f"\nEnter details for student {i+1}")
    roll.append(int(input("Roll number: ")))
    name.append((input("Name: ")))
    gender.append((input("Gender: (M/F)?")))
    marks1.append(int(input("Marks in subject 1: ")))
    marks2.append(int(input("Marks in subject 2: ")))
    marks3.append(int(input("Marks in subject 3: ")))
    
df = pd.DataFrame(
{
    "Roll Number": roll,
    "Name": name,
    "Gender": gender,
    "Marks1": marks1,
    "Marks2": marks2,
    "Marks3": marks3
})

df["Total"] = df["Marks1"]+df["Marks2"]+df["Marks3"]
print("\nLowest Marks in Marks1:", df["Marks1"].min())
print("\Heighest Marks in Marks2:", df["Marks2"].max())
print("\Average Marks in Marks3:", df["Marks3"].mean())
df["Average"] = df["Total"] / 3

highest_avg_student = df.loc[
    ((df["Marks1"] + df["Marks2"] + df["Marks3"]) / 3).idxmax(),
    "Name"]

print("Student with highest average:", highest_avg_student)
failed_count = (df["Marks2"] < 40).sum()




#Create a DataFrame of 10 students with Roll No, Name, Gender, Marks1–3. Add total, find min/max/avg per column, name with highest average, and count failures.

import pandas as pd
data = {
"roll": [1,2,3,4,5,6,7,8,9,10],
"name": ["Alice","Bob","Charlie","Diana","Eve",
"Frank","Grace","Hank","Ivy","Jack"],
"gender": ["F","M","M","F","F","M","F","M","F","M"],
"m1": [85,60,72,90,55,40,95,33,78,66],
"m2": [78,45,88,92,60,38,85,70,55,48],
"m3": [91,70,65,88,75,60,80,55,72,68]
}

df = pd.DataFrame(data)
df["Total"] = df["m1"]+df["m2"]+df["m3"]
df["avg"] = df["Total"] / 3
print(f"Max in m1: {df["m1"].max()}")
print(f"Min in m3: {df["m1"].min()}")
print(f"Avg in m2: {df["m1"].mean()}")

topper = df.loc[df["avg"].idxmax(),"name"]
print(f"Student with highest average: {topper}")

failures = df[(df["m1"]<40) | (df["m2"]<40) | (df["m3"]<40)].shape[0]
print(failures)

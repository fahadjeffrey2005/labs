#Group a DataFrame by a categorical column and compute mean, max, and min for
#multiple numeric columns.
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

result = df.groupby("gender").agg(
{"m1":"mean", "m2":"max", "m3":"min"})

print(result)

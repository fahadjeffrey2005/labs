# Read a CSV. Find the row with the highest value in a column. Filter rows by a condition and write to a new CSV.

import pandas as pd
df = pd.read_csv("Movies.csv")
best = df.loc[df["Rating"].idxmax()]
print(f"Highest rated movie: {best}")

print("Hindi movies")
hindi =df[df["Language"]=="Hindi"]
hindi.to_csv("HindiMovies.csv", index =False)

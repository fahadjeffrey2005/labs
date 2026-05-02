#Given a dataset with missing values coded as -1: replace with NaN, fill with column mean, then identify and replace outliers with column median. Show 5-number summary before and after each step.

import pandas as pd
import numpy as np

df = pd.read_csv("Cerals.csv")
cols = df.select_dTypes(include = "numbers").columns

print(f"Before cleaning: /n {df[cols].describe}")
df.replace(-1, np.nan, inplace = True)
df.fillna(df.mean[numeric_only=True], inplace = True)

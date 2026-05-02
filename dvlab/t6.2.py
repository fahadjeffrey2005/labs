import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

df = pd.read_csv("cereals.csv")

# ── Q1: Overall nutritional profile ─────────────────────────────
cols = ["calories", "sugars", "protein", "fiber", "carbohydrates"]
print("Q1: Nutritional Summary")
print(df[cols].agg(["mean", "median", "std"]).round(2))

fig, axes = plt.subplots(1, 2, figsize=(12, 4))

axes[0].hist(df["calories"], bins=6, color="steelblue", edgecolor="white")
axes[0].set_title("Distribution of Calories")
axes[0].set_xlabel("Calories")
axes[0].set_ylabel("Frequency")

df[cols].boxplot(ax=axes[1])
axes[1].set_title("Spread of Key Nutrients")
axes[1].set_xlabel("Nutrient")
axes[1].set_ylabel("Value")
axes[1].tick_params(axis="x", rotation=20)

plt.tight_layout()
plt.show()

# ── Q2: Highest and lowest calorie cereals ───────────────────────
print("\nQ2: Top 5 and Bottom 5 by Calories")
s = df.sort_values("calories", ascending=False)
print("Top 5:\n", s[["name", "calories"]].head())
print("Bottom 5:\n", s[["name", "calories"]].tail())

fig, axes = plt.subplots(1, 2, figsize=(14, 4))

axes[0].bar(s["name"], s["calories"], color="steelblue", edgecolor="white")
axes[0].set_title("Calories per Cereal (sorted)")
axes[0].set_xlabel("Cereal")
axes[0].set_ylabel("Calories")
axes[0].tick_params(axis="x", rotation=45)

axes[1].barh(s["name"], s["calories"], color="coral")
axes[1].set_title("Calories per Cereal (horizontal)")
axes[1].set_xlabel("Calories")

plt.tight_layout()
plt.show()

# ── Q3: Sugar distribution ───────────────────────────────────────
print("\nQ3: Sugar Distribution")
print(df["sugars"].describe().round(2))

hi = (df["sugars"] > df["sugars"].mean()).sum()
lo = (df["sugars"] <= df["sugars"].mean()).sum()
print(f"Above average sugar: {hi} cereals")
print(f"Below/equal average sugar: {lo} cereals")

fig, axes = plt.subplots(1, 2, figsize=(12, 4))

axes[0].hist(df["sugars"], bins=5, color="salmon", edgecolor="white")
axes[0].set_title("Distribution of Sugar Content")
axes[0].set_xlabel("Sugars (g)")
axes[0].set_ylabel("Frequency")

axes[1].boxplot(df["sugars"])
axes[1].set_title("Sugar Content Spread and Outliers")
axes[1].set_ylabel("Sugars (g)")

plt.tight_layout()
plt.show()

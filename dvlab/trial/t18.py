#
import matplotlib.pyplot as plt
import seaborn as sns
import pandas as pd

plt.figure(figsize=(12, 4))   # width, height in inches

plt.subplot(1, 3, 1)           # 1 row, 3 cols, plot 1
plt.bar(teams, wins)
plt.title("Bar")

plt.subplot(1, 3, 2)           # plot 2
plt.scatter(x, y)
plt.title("Scatter")

plt.subplot(1, 3, 3)           # plot 3
plt.hist(data, bins=5)
plt.title("Hist")

plt.tight_layout()             # prevents overlapping
plt.show()

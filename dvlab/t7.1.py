import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

ipl = pd.read_csv("ipl.csv", encoding="utf-8-sig")
ipl.columns = ipl.columns.str.strip()

# ── Q1: Top 5 run scorers ────────────────────────────────────────
top5 = ipl.nlargest(5, "Runs")[["Player", "Runs", "Matches", "Average"]]
print("Top 5 Run Scorers:\n", top5)

plt.bar(top5["Player"], top5["Runs"], color="steelblue", edgecolor="white")
plt.title("Top 5 IPL Run Scorers")
plt.xlabel("Player")
plt.ylabel("Total Runs")
plt.xticks(rotation=20)
plt.tight_layout()
plt.show()

# ── Q2: Strike Rate vs Average ───────────────────────────────────
print("\nStrike Rate vs Average:\n", ipl[["Player", "StrikeRate", "Average"]])

plt.plot(ipl["Player"], ipl["StrikeRate"], marker="o", label="Strike Rate", color="steelblue")
plt.plot(ipl["Player"], ipl["Average"],    marker="s", label="Average",     color="coral")
plt.title("Strike Rate vs Average per Player")
plt.xlabel("Player")
plt.ylabel("Value")
plt.xticks(rotation=45)
plt.legend()
plt.tight_layout()
plt.show()

# ── Q3: Centuries and Fifties comparison ─────────────────────────
print("\nCenturies vs Fifties:\n", ipl[["Player", "Centuries", "Fifties"]])

x = range(len(ipl))
plt.bar(x, ipl["Centuries"], width=0.4, label="Centuries", color="gold",      align="center")
plt.bar([i+0.4 for i in x], ipl["Fifties"], width=0.4, label="Fifties", color="coral", align="center")
plt.title("Centuries vs Fifties per Player")
plt.xlabel("Player")
plt.ylabel("Count")
plt.xticks([i+0.2 for i in x], ipl["Player"], rotation=45)
plt.legend()
plt.tight_layout()
plt.show()

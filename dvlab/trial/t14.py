#Create a weekly temperature Series. Find mean, max/min with their day labels, values above average, and convert to Fahrenheit.

import pandas as pd
temps = pd.Series([22, 25, 19, 30, 28, 24, 21], index=["Mon","Tue","Wed","Thu","Fri","Sat","Sun"])
print(f"Max temp {temps.max()} on {temps.idxmax()}")
print(f"Min temp {temps.min()} on {temps.idxmin()}")
print(f"Temps over average: {temps.mean()} are\n {temps[temps>temps.mean()]}")
f = (temps * 9/5) + 32
print(f"Temperatures in farenheit: \n {f}")

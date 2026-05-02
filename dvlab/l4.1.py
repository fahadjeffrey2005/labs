'''
Create a Series from a list of integers representing daily
temperatures (in Celsius) over a week. Assign index labels as day
of the week.

a. Find and print the average (mean) temperature for the week.
b. Identify and print the maximum and minimum temperatures
    and their respective days.
c. Display the temperatures greater than a specific value.
d. Convert all temperatures to Fahrenheit.
e. Print the days had temperatures above the average.

'''
import pandas as pd

temps = pd.Series(
    [24.5, 21.2, 23.9, 26.1, 24.2, 25.6, 23.1],
    index=["Monday", "Tuesday", "Wednesday", "Thursday",
           "Friday", "Saturday", "Sunday"]
)

mean = temps.mean()
maxt = temps.max()
mint = temps.min()
tempsf = temps * 9/5 + 32

print(f"Average temperature: {mean}")

print(f"Max temp: {maxt} on {temps.idxmax()}")
print(f"Min temp: {mint} on {temps.idxmin()}")

value = 24
print(f"Temperatures greater than {value}:")
print(temps[temps > value])

print("Temperatures in Fahrenheit:")
print(tempsf)

print(f"Days having temp higher than mean:")
print(temps[temps > mean])

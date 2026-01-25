##Write a Python code block to create a dictionary of cricket World Cup winners. Let the key be the year; the value is the country that won the World Cup that year. Print the name of the best- performing country. Display the unique list of countries that have won the World Cup.
#data = {
#    2023: "Australia",
#    2019: "England",
#    2015: "Australia",
#    2011: "India",
#    2007: "Australia",
#    2003: "Australia",
#    1999: "Australia",
#    1996: "Sri Lanka",
#    1992: "Pakistan",
#    1987: "Australia",
#    1983: "India",
#    1979: "West Indies",
#    1975: "West Indies"
#    }
#    
#best = {}
#for year in data:
#    country = data[year]
#    if country not in best:
#        best[country] = 1
#    else:
#        best[country] += 1
#w = ""
#count =0
#
#for country in best:
#    if best[country] > count:
#        count = best[country]
#        w = country
#        
#print(f"Best performing country is {w}")
#print(f"Number of wins is {count}")


data = {
    2023: "Australia",
    2019: "England",
    2015: "Australia",
    2011: "India",
    2007: "Australia",
    2003: "Australia",
    1999: "Australia",
    1996: "Sri Lanka",
    1992: "Pakistan",
    1987: "Australia",
    1983: "India",
    1979: "West Indies",
    1975: "West Indies"
    }
best = {}
for i in data:
    country = data[i]
    if country not in best:
        best[country] = 1
    else:
        best[country] += 1

w = ""
count =0

for i in best:
    if best[i] > count:
        count = best[i]
        w = i
print(f"Best performing country is {w}")
print(f"Number of wins is {count}")

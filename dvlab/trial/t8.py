#Create a dictionary of cricket World Cup winners (year → country). Print the best-performing country and unique list of winners.


data = {
1975: "West Indies", 1979: "West Indies", 1983: "India",
1987: "Australia", 1992: "Pakistan", 1996: "Sri Lanka",
1999: "Australia", 2003: "Australia", 2007: "Australia",
2011: "India", 2015: "Australia", 2019: "England",
2023: "Australia"
}

    
best ={}
for i in data:
    country = data[i]
    if country not in best:
        best[country] = 1
    else:
        best[country] += 1
        
maxwins=0;
bestcountry="";
for i in best:
    if best[i] > maxwins:
        maxwins = best[i]
        bestcountry = i
print(f"The best performing country is: {bestcountry} with {maxwins} wins.")
print(f"First Time Winners: ")
#first = []
#for i in best:
#    if best[i] == 1:
#        first.append(i)
#
#print(first)

for i in best:
    if best[i] == 1:
        print (i)

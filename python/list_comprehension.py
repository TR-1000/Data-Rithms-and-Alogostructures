###################################### List, Dict Comprehention ######################################

#Get duplicates
some_list = ["a", "b", "c", "b", "d", "m", "n", "n"]

counts = {k:some_list.count(k) for k in some_list}
duplicates = [x for x in counts if counts[x] > 1]

#Dictionary
numbers = [x for x in range(1,101)]
squares = {num : num**2 for num in numbers}
squares = {num : num**2 for num in range(101)}

import pprint
pp = pprint.PrettyPrinter(indent=4)
pp.pprint(squares)


degrees = [ 12, 21, 15, 32 ]

fahreheit = [(9/5)*x+32 for x in degrees]

n = int(input("Enter a number between 1 and 100: " ))
divs = [x for x in range(n,101) if x%n==0]
print(divs)




#1 Capitalize all of the pet names and print the list
my_pets = ['sisi', 'bibi', 'titi', 'carla', 'ryan', 'PAUL','kevin connors']

print([x.capitalize() for x in my_pets])

#2 Zip the 2 lists into a list of tuples, but sort the numbers from lowest to highest.
my_strings = ['a', 'b', 'c', 'd', 'e']
my_numbers = [5,4,3,2,1]

print(list(zip(my_strings, sorted(my_numbers))))

#3 Filter the scores that pass over 50%
scores = [73, 20, 65, 19, 76, 100, 88]

print([x for x in scores if x > 50])

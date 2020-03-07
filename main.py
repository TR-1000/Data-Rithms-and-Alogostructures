  
#FizzBuzz

fizz_buzz_numbers = [45, 22, 14, 65, 97, 72]

def fizzbuzz_classic(list):
  for n in list:
    if n%3 == 0 and n%5 == 0:
        print("fizzbuzz")

    elif n%5 == 0:
        print("buzz")

    elif n%3 == 0:
        print("fizz")

  print(list)    

  

def fizzbuzz_range(list):
  for i in range(len(list)):
    if list[i]%3==0 and list[i]%5==0:
      list[i] = "fizzbuzz"

    elif list[i]%3==0:
      list[i] = "fizz"

    elif list[i]%5==0:
      list[i] = "buzz"

  print(list)
  

def fizzbuzz_enumerate(list):
  for i,n in enumerate(numbers):
    if n%3==0 and n%5==0:
      list[i] = "fizzbuzz"

    elif n%3==0:
      list[i] = "fizz"

    elif n%5==0:
      list[i] = "buzz"
  
  print(numbers)








######################################## RECURSION ########################################

def power(num,pwr):
  if pwr == 0:
    return 1
  return num * power(num,pwr-1)



# FIBONACCI

def fib(num):
  fib_list = []
  for index in range(num + 1):
    if index == 0:
      fib_list.append(index)
    elif index == 1:
      fib_list.append(index)
    else:
      fib_list.append(fib_list[index - 1] + fib_list[index - 2])
  return fib_list[-1]




 
def fibonacci(n):
  if n == 0:
    return 0
  elif n == 1:
    return 1  
  return fibonacci(n-1) + fibonacci(n-2) 



def factorial(n):
  if n == 1:
    return 1
  return n * factorial(n-1)

# num = int(input("choose a number greater than zero "))  

# print(factorial(num))




###################################### List, Dict Comprehention ######################################

#Get duplicates
# some_list = ["a", "b", "c", "b", "d", "m", "n", "n"]

# counts = {k:some_list.count(k) for k in some_list}
# duplicates = [x for x in counts if counts[x] > 1]

#Dictionary
#numbers = [x for x in range(1,101)]
#squares = {num : num**2 for num in numbers}
#squares = {num : num**2 for num in range(101)}

# import pprint
# pp = pprint.PrettyPrinter(indent=4)
# pp.pprint(squares)


#degrees = [ 12, 21, 15, 32 ]

#fahreheit = [(9/5)*x+32 for x in degrees]

# n = int(input("Enter a number between 1 and 100: " ))
# divs = [x for x in range(n,101) if x%n==0]
# print(divs)




# #1 Capitalize all of the pet names and print the list
# my_pets = ['sisi', 'bibi', 'titi', 'carla', 'ryan', 'PAUL','kevin connors']

# print([x.capitalize() for x in my_pets])

# #2 Zip the 2 lists into a list of tuples, but sort the numbers from lowest to highest.
# my_strings = ['a', 'b', 'c', 'd', 'e']
# my_numbers = [5,4,3,2,1]

# print(list(zip(my_strings, sorted(my_numbers))))

# #3 Filter the scores that pass over 50%
# scores = [73, 20, 65, 19, 76, 100, 88]

# print([x for x in scores if x > 50])






############################################ lambdas ############################################

#print((lambda x: x*2) (7))

#square = (lambda x: x*x)

#print(list(map(square, my_numbers)))


#Sort by second element in tuple
#a = [(0,2), (4,3), (9,9), (10, -1)]
#print(sorted(a, key=lambda tup: tup[1]))
#a.sort(key=lambda x: x[1])
#print(a)






############################################ OOP ###########################################

# class PlayerCharacter:
#   membership = True
#   def __init__(self, name, age):
#     self.name = name #attributes
#     self.age = age

#   def shout(self):
#     print(f'my name is {self.name} !')

# player1=PlayerCharacter("TR-1000", 38)

# #Given the below class:
# class Cat:
#     species = 'mammal'
#     def __init__(self, name, age):
#         self.name = name
#         self.age = age


# # 1 Instantiate the Cat object with 3 cats
# cat1 = Cat("Rags", 7)
# cat2 = Cat("Sox", 2)
# cat3 = Cat("Boots", 1)

# # 2 Create a function that finds the oldest cat
# oldest_cat = {}
# oldest_age = 0
# cats = (cat1, cat2, cat3)
# for cat in cats:
#   if cat.age > oldest_age:
#     oldest_age = cat.age
#     oldest_cat = cat


# # 3 Print out: "The oldest cat is x years old.". x will be the oldest cat age by using the function in #2

# # print(f"The oldest cat is {oldest_cat.name}.")

# # def say_name(cat):
# #   print(cat.name)

# # for cat in cats:
# #   say_name(cat)


# class Animal():

#   def make_sound(self):
#     print("ROAR")

# class Dog(Animal):
#   species = 'canine'

# shaster = Dog()



############################################ Generators ###########################################

# Fibonacci Generator

def fib_generator(num):
  a = 0
  b = 1
  for i in range(num):
    yield a
    # the value of "a" now changes to "a" + "b" and the value of "b" changes to the value "a" was
    a, b = a + b, a

# for i in fib_generator(1000):
#   print(i)

def make_int(s):
  s = s.replace("$","")
  if "." in s and "M" in s:
    s = s.replace(".","").replace("M","00000")
  else: 
    s = s.replace("M","000000").replace("K","000")
  return(s)
  

make_int("$11.5M")



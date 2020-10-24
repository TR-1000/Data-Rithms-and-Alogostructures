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

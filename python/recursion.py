# RECURSION

def power(num,pwr):
  if pwr == 0:
    return 1
  return num * power(num,pwr-1)


def fibonacci(n):
  if n == 0:
    return 0
  elif n == 1:
    return 1
  return fibonacci(n-1) + fibonacci(n-2)



def factorial(n):
    if n <= 0:
        return "enter a number greater than zero"
    if n == 1:
        return 1

    return n * factorial(n-1)

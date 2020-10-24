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

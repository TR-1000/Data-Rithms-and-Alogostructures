'''Fibonacci Generator'''

def fib_generator(num):
  a = 0
  b = 1
  for i in range(num+1):
    yield a
    # the value of "a" now changes to "a" + "b" and the value of "b" changes to the value "a" was
    a, b = a + b, a

# loop over generator
def get_fib_array(n):
    return [i for i in fib_generator(n)]
# print out array
print(get_fib_array(6))

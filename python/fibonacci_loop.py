
# FIBONACCI WHILE LOOP

def fibonacci(n):
    if(n==0):
        return 0;
    if(n==1):
        return 1;

    current = 1
    previous = 0

    while(n-1>0):
        # print("previous " , previous)
        # print("current ", current)

        current, previous = current + previous, current
        n-=1
    print(current)
    return current



# FIBONACCI FOR LOOP

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

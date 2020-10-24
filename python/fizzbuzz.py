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
  for i,n in enumerate(list):
    if n%3==0 and n%5==0:
      list[i] = "fizzbuzz"

    elif n%3==0:
      list[i] = "fizz"

    elif n%5==0:
      list[i] = "buzz"

  print(list)

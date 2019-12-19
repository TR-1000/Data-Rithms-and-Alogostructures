#FizzBuzz

number = [45, 22, 14, 65, 97, 72]

def fizzbuzz(list):
  for n in number:
    if n%3 == 0 and n%5 == 0:
        print("fizzbuzz")
    elif n%5 == 0:
        print("buzz")
    elif n%3 == 0:
        print("fizz")        
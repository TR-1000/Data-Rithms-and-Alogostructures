print((lambda x: x*2) (7))

square = (lambda x: x*x)
my_numbers = []
print(list(map(square, my_numbers)))


#Sort by second element in tuple
a = [(0,2), (4,3), (9,9), (10, -1)]
print(sorted(a, key=lambda tup: tup[1]))
a.sort(key=lambda x: x[1])
print(a)


def make_int(s):
  s = s.replace("$","")
  if "." in s and "M" in s:
    s = s.replace(".","").replace("M","00000")
  else:
    s = s.replace("M","000000").replace("K","000")
  return(s)


make_int("$11.5M")


object1 = {'value': 10}
object2 = object1
object3 = {'value': 10}
print(object1 == object3)


def fibonacci(n):
    if(n==0):
        return 0;
    if(n==1):
        return 1;

    previous = 0
    current = 1

    while(n-1>0):
        print("previous " , previous)
        print("current ", current)

        sum = current + previous
        previous = current
        current = sum

        print("sum ", sum)
        n-=1
    print(current)
    return current

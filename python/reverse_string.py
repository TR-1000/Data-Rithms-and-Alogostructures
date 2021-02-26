
def reverse_string():
    str = input("please enter a word to reverse: ")
    print(reverse_list(list(str), 0, len(str)-1))

def reverse_list(str_list, start, stop):

    while( start < int(len(str_list)/2) ):
        # print(start)
        # print(stop)
        str_list[start], str_list[stop] = str_list[stop], str_list[start]
        start += 1
        stop -= 1


    return "".join(str_list)



reverse_string()

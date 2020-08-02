#------------------------------------------
# Check if one string rotation of another
#------------------------------------------

def is_rotation(s1,s2):

    if s1.find(s2)!= -1:
        return True

def is_substring(s1,s2):
    if len(s1) == len(s2) != 0 :
        return is_rotation(s1+s1,s2)
    else:
        return False


def main():

    s1 = "waterbottle"

    s2 = "ss"

    s = is_substring(s1,s2)
    print("is substr",s)
    print("hello")
if __name__ == '__main__':
    main()
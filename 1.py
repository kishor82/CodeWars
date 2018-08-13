# best solution
#def validate_pin(pin):
#    return len(pin) in (4, 6) and pin.isdigit()

#my solution
def validate_pin(pin):
    if pin.isdigit():
        count = 0
        count = len(str(pin))
      
        if (count == 4 or count == 6):
            return True
        else:
            return False
    else :
        return False
            

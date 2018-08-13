def find_missing_letter(chars):
  
    for i in range(len(chars)-1):
        if ord(chars[i+1])-ord(chars[i]) == 2:
            character = ord(chars[i])+1
            
    return chr(character)
    


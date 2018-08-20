def Descending_Order(num):
    rev = sorted(map(int,str(num)),reverse=True)
    final = ''.join(str(i) for i in rev)
    return int(final)
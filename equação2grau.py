import math
a=float(input("A= "))
b=float(input("B= "))
c=float(input("C= "))
if a !=0:
    delta= b**2- 4*a*c
    if delta>=0:
        x1= (-b+delta**0.5)/(2*a)
        x2= (-b-delta**0.5)/(2*a)
        print("as raizes são",x1,"e", x2)

    else:
        print("delta não tem raiz real")
else:
    print("não é equação de segundo grau")    
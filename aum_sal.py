c= int(input("código"))
s= float(input("salário"))

if c==310:
    a= ((s/100)*5)+s
    d=s-a
    print ("R$",a,"e a diferença é igual a R$:",d) 
elif c==456:
    a= ((s/100)*7.5)+s
    d=s-a
    print ("R$",a,"e a diferença é igual a R$:",d)
elif c==885:
    a= ((s/100)*10)+s
    d=s-a
    print ("R$",a,"e a diferença é igual a R$:",d)
else: 
    a= ((s/100)*15)+s
    d=s-a
    print ("R$",a,"e a diferença é igual a R$:",d)
    

x=int(input("digita ai"))
for n in range(2,x):
    if x%n==0:
        print('Não é primo')
        break
else:
    print('É primo')

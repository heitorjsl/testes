import random
lista=[]
c = int(input("Digite o tamanho da lista: "))
for _ in range (c):
    x=random.randint (0,50)
    lista.append(x)
n=int(input("Digite um número de 0 a 50: "))
for i in lista:
    if i == n:
        print(f"o número está na lista e seu indice é igual a {lista.index(i)}")
        break
else:
    print("não está na lista")
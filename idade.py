i = int(input("idade: "))
if i <= 5:
    print("não pode competir")
elif 5 <= i <= 7:
    print("infantil A")
elif 8 <= i <= 10:
    print("infantil B")
elif 11 <= i <= 13:
    print("juvenil A")
elif 14 <= i <= 17:
    print("juvenil B")
else:
    print("adulto")


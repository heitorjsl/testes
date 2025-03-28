coisas = []
while True:
    print("1-add", "2-remove", "3-exibe", "4-tira tudo")
    cmd = int(input(""))
    if cmd == 1:
        item = input("add ae")
        coisas.append(item)
    elif cmd == 2:
        item = input("oq vc qr tirar?")
        ngcQsaiu = coisas.pop()
        ngcQsaiu
    elif cmd == 3:
        print(coisas)
    else:
        coisas.clear()


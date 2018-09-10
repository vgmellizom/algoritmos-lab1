import time
import matplotlib.pyplot as plt
import sys

start=time.time()
fibonacci=[]
timer=[]
x=0
y=1
fibonacci.append(x)
timer.append(time.time()-start)
fibonacci.append(y)
timer.append(time.time()-start)
num = int(input("Numero de elementos:"))
if(num == 0):
    print(x)
    end=time.time()
    print('time elapsed: '+(end-start))
    sys.exit()
if(num == 1):
    print(fibonacci)
    end=time.time()
    print('time elapsed: '+(end-start))
    sys.exit()
for n in range(2,num+1):
    aux = x + y
    fibonacci.append(aux)
    timer.append(time.time()-start)
    x = y
    y = aux
print(fibonacci)
plt.plot(timer)
plt.show()
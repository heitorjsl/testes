import math 
g=9.81
yc=0.2
v0=0.2
t=(v0-math.sqrt(v0**2 - 2*g*yc))/g
print(f"tempo= {t:.1f}segundos")


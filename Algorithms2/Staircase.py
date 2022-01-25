import math
import os
import random
import re
import sys

def staircase(n):
    for i in range(1, n+1):
         print(("#" * i).rjust(n))
 
n = int(input("Enter Height of the staircase:"))
staircase(n)
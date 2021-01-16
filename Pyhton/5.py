#!/bin/python3

import math
import os
import random
import re
import sys


# Complete the plusMinus function below.
def plusMinus(arr):
    counta = countb = countc = 0
    for i in arr:
        if i > 0:
            counta += 1
        elif i < 0:
            countb += 1
        else:
            countc += 1
    print(counta / len(arr))
    print(countb / len(arr))
    print(countc / len(arr))


if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)

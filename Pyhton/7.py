#!/bin/python3

import math
import os
import random
import re
import sys


# Complete the miniMaxSum function below.
def miniMaxSum(arr):
    print(sum(arr) - max(arr), sum(arr) - min(arr))

    #Second solution
    # max = min = sum = arr[0]
    # aRR = len(arr)
    # for i in range(1,aRR):
    #     sum += arr[i]
    #     if arr[i] < min:
    #         min = arr[i]
    #     elif arr[i] > max:
    #         max = arr[i]
    # print(sum-max, " ", sum-min)


if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)

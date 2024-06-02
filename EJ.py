numbers = [1, 2, 3, 4, 5, 6]
result = 0

for num in numbers:
    if num % 2 == 0:
        result += num
    else:
        result -= num

print(result)
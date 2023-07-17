# Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
#     (examples)
#     input: [1,2,8,9,12,46,76,82,15,20,30]
#     Output:
#         {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
# This Problem 4 was easy for me to complete it in python
def count_multiples(numbers):
    multiples = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    result = {}

    for multiple in multiples:
        count = sum(1 for num in numbers if num % multiple == 0)
        result[multiple] = count

    return result


numbers = [1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30]
counts = count_multiples(numbers)
print(counts)

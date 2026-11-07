
# ১. ARRAY তৈরি করা

numbers = [10, 20, 30, 40, 50]

print("\n১. ARRAY তৈরি")
print("সম্পূর্ণ Array:", numbers)
print("Array-এর ধরন:", type(numbers))
print("মোট Element:", len(numbers))


# ২. ARRAY ACCESS করা

print("\n২. ARRAY ACCESS")

print("প্রথম সংখ্যা:", numbers[0])
print("দ্বিতীয় সংখ্যা:", numbers[1])
print("শেষ সংখ্যা:", numbers[-1])
print("তৃতীয় সংখ্যা:", numbers[2])


# ৩. ARRAY UPDATE করা

print("\n৩. ARRAY UPDATE")

numbers[2] = 100

print("আপডেট করা Array:", numbers)


# ৪. ARRAY-তে নতুন DATA যোগ করা

print("\n৪. ARRAY INSERT")

numbers.append(60)             # শেষে একটি সংখ্যা যোগ করা
numbers.insert(2, 99)          # Index 2-তে সংখ্যা যোগ করা
numbers.extend([70, 80, 90])   # একাধিক সংখ্যা যোগ করা

print("নতুন Array:", numbers)


# ৫. ARRAY থেকে DATA DELETE করা

print("\n৫. ARRAY DELETE")

numbers.remove(99)             # নির্দিষ্ট Value মুছে ফেলা
del numbers[0]                 # Index 0-এর Element মুছে ফেলা

deleted = numbers.pop()        # শেষ Element মুছে Value ফেরত পাওয়া

print("মুছে ফেলা সংখ্যা:", deleted)
print("বর্তমান Array:", numbers)


# ৬. ARRAY SEARCH করা

print("\n৬. ARRAY SEARCH")

target = 40

if target in numbers:
    index = numbers.index(target)
    print("সংখ্যাটি পাওয়া গেছে")
    print("Index:", index)
else:
    print("সংখ্যাটি পাওয়া যায়নি")


# ৭. ARRAY TRAVERSAL করা

print("\n৭. ARRAY TRAVERSAL")

for value in numbers:
    print("বর্তমান সংখ্যা:", value)


# ৮. ARRAY-এর SUM এবং AVERAGE বের করা

print("\n৮. SUM AND AVERAGE")

total = sum(numbers)           # সব সংখ্যার যোগফল
count = len(numbers)           # মোট Element সংখ্যা
average = total / count        # গড় বের করা

print("যোগফল:", total)
print("গড়:", average)


# ৯. MAXIMUM এবং MINIMUM বের করা

print("\n৯. MAXIMUM AND MINIMUM")

maximum = max(numbers)         # সবচেয়ে বড় সংখ্যা
minimum = min(numbers)         # সবচেয়ে ছোট সংখ্যা

print("সবচেয়ে বড়:", maximum)
print("সবচেয়ে ছোট:", minimum)


# ১০. ARRAY SORTING করা

print("\n১০. ARRAY SORTING")

numbers.sort()                 # ছোট থেকে বড় সাজানো

print("Ascending:", numbers)

numbers.sort(reverse=True)     # বড় থেকে ছোট সাজানো

print("Descending:", numbers)


# ১১. ARRAY REVERSE করা

print("\n১১. ARRAY REVERSE")

numbers.reverse()

print("উল্টো Array:", numbers)


# ১২. ARRAY COPY করা

print("\n১২. ARRAY COPY")

original = [10, 20, 30, 40]

new_array = original.copy()

new_array.append(50)

print("মূল Array:", original)
print("নতুন Array:", new_array)


# ১৩. DUPLICATE সংখ্যা বের করা

print("\n১৩. DUPLICATE DETECTION")

numbers = [10, 20, 30, 20, 40, 10, 50]

duplicates = []

for number in numbers:

    if numbers.count(number) > 1:

        if number not in duplicates:
            duplicates.append(number)

print("Duplicate সংখ্যা:", duplicates)


# ১৪. DUPLICATE বাদ দেওয়া

print("\n১৪. REMOVE DUPLICATE")

numbers = [10, 20, 20, 30, 40, 40, 50]

unique_numbers = []

for number in numbers:

    if number not in unique_numbers:
        unique_numbers.append(number)

print("Unique Array:", unique_numbers)


# ১৫. EVEN এবং ODD সংখ্যা বের করা

print("\n১৫. EVEN AND ODD")

numbers = [10, 15, 20, 25, 30, 35, 40]

even_numbers = []
odd_numbers = []

for number in numbers:

    if number % 2 == 0:
        even_numbers.append(number)

    else:
        odd_numbers.append(number)

print("জোড় সংখ্যা:", even_numbers)
print("বিজোড় সংখ্যা:", odd_numbers)


# ১৬. ARRAY-তে ELEMENT COUNT করা

print("\n১৬. ELEMENT COUNT")

numbers = [10, 20, 10, 30, 10, 40]

print("১০ কতবার আছে:", numbers.count(10))


# ১৭. ARRAY SLICING করা

print("\n১৭. ARRAY SLICING")

numbers = [10, 20, 30, 40, 50, 60]

print("প্রথম তিনটি:", numbers[0:3])
print("শেষ তিনটি:", numbers[-3:])
print("দুই ধাপ পরপর:", numbers[::2])
print("উল্টো:", numbers[::-1])


# ১৮. ARRAY CLEAR করা

print("\n১৮. ARRAY CLEAR")

numbers = [10, 20, 30, 40]

numbers.clear()

print("খালি Array:", numbers)


# ১৯. 2D ARRAY / MATRIX তৈরি করা

print("\n১৯. TWO DIMENSIONAL ARRAY")

matrix = [
    [10, 20, 30],
    [40, 50, 60],
    [70, 80, 90]
]

for row in matrix:
    print(row)

print("নির্দিষ্ট Element:", matrix[0][1])


# ২০. MATRIX-এর SUM বের করা

print("\n২০. MATRIX SUM")

total = 0

for row in matrix:

    for number in row:

        total += number

print("Matrix-এর যোগফল:", total)


# ২১. প্রতিটি ROW-এর SUM বের করা

print("\n২১. ROW WISE SUM")

for i in range(len(matrix)):

    row_sum = sum(matrix[i])

    print("Row", i + 1, "এর যোগফল:", row_sum)


# ২২. ARRAY থেকে দ্বিতীয় বৃহত্তম সংখ্যা বের করা

print("\n২২. SECOND LARGEST")

numbers = [10, 50, 30, 50, 40, 20]

unique_numbers = sorted(set(numbers))

if len(unique_numbers) >= 2:
    print("দ্বিতীয় বৃহত্তম:", unique_numbers[-2])
else:
    print("দ্বিতীয় বৃহত্তম সংখ্যা নেই")


# ২৩. ARRAY-এর প্রতিটি ELEMENT-এর SQUARE

print("\n২৩. SQUARE")

numbers = [1, 2, 3, 4, 5]

squares = []

for number in numbers:
    squares.append(number ** 2)

print("Square:", squares)


# ২৪. ARRAY MERGE করা

print("\n২৪. ARRAY MERGE")

array1 = [10, 20, 30]
array2 = [40, 50, 60]

merged = array1 + array2

print("Merged Array:", merged)


# ২৫. LINEAR SEARCH

print("\n২৫. LINEAR SEARCH")

numbers = [10, 20, 30, 40, 50]

target = 30
found = False

for i in range(len(numbers)):

    if numbers[i] == target:

        print("সংখ্যাটি পাওয়া গেছে। Index:", i)
        found = True
        break

if not found:
    print("সংখ্যাটি পাওয়া যায়নি")


# ২৬. BINARY SEARCH

print("\n২৬. BINARY SEARCH")

numbers = [10, 20, 30, 40, 50, 60, 70]

target = 50

left = 0
right = len(numbers) - 1

found = False

while left <= right:

    mid = (left + right) // 2

    if numbers[mid] == target:

        print("সংখ্যাটি পাওয়া গেছে। Index:", mid)
        found = True
        break

    elif numbers[mid] < target:

        left = mid + 1

    else:

        right = mid - 1

if not found:
    print("সংখ্যাটি পাওয়া যায়নি")


# ২৭. PYTHON-এর প্রকৃত ARRAY MODULE

print("\n২৭. PYTHON ARRAY MODULE")

import array

arr = array.array('i', [10, 20, 30, 40])

arr.append(50)
arr.insert(1, 99)
arr.remove(30)

print("প্রকৃত Integer Array:", arr)



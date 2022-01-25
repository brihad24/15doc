#Question: https://www.hackerrank.com/challenges/apple-and-orange/problem

def countApplesAndOranges(s, t, a, b, apples, oranges):
    apples_in_house = 0
    oranges_in_house = 0
    for apple in apples:
        if s <= a + apple <= t:
            apples_in_house += 1
    for orange in oranges:
        if s <= b + orange <= t:
            oranges_in_house += 1

    print(apples_in_house)
    print(oranges_in_house)
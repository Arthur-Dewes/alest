n = 111
arr = [21, 86, 81, 80, 25, 64, 61, 101, 50, 94, 54, 91, 16, 7, 88, 109, 44, 32, 55, 9, 38, 41, 77, 2, 47, 53, 36, 104, 85, 11, 99, 42, 60, 14, 51, 24, 75, 17, 92, 48, 105, 67, 110, 15, 69, 71, 95, 33, 72, 6, 100, 82, 79, 102, 106, 66, 43, 22, 103, 27, 56, 59, 31, 12, 4, 96, 34, 89, 35, 87, 39, 76, 49, 57, 3, 84, 10, 108, 37, 18, 90, 58, 45, 62, 19, 26, 68, 28, 5, 0, 8, 63, 1, 65, 93, 46, 70, 107, 83, 78, 74, 97, 13, 52, 29, 73, 23, 20, 98, 30, 40]

def troca(tup: tuple[int], pos: list[int], n):
    return tuple(tup[pos[i]] for i in range(n))
        
def danca(arr, n):
    chave = arr
    memo = {tuple(arr): 1, tuple(sorted(arr)): 1}
    count = 1

    while True:
        chave = troca(chave, arr, n)
        
        if chave in memo:
            memo[chave] += 1
            if memo[chave] > 1:
                print(memo)
                return count
        count += 1

if __name__ == '__main__':
    print(danca(arr, n))

n = 71
arr = [5,6,0,4,2,3,1]
memo = {}

def troca(array: list[int], n: int) -> tuple[int]:
    new_array = [0] * n
    for i in range(n):
        new_array[i] = array[array[i]]
    return tuple(new_array)

def check(tup: tuple[int]) -> bool:
    if tup in memo.keys() and memo[tup] > 1:
        return True
    return False

def danca(arr: list[int], n: int) -> int:
    chave = tuple(arr)
    while True:
        chave = troca(chave, n)
        
        if chave in memo.keys():
            memo[chave] += 1
        elif chave not in memo.keys():
            memo[chave] = 1

        if check(chave):
            return len(memo)


if __name__ == '__main__':
    print(danca(arr, n))

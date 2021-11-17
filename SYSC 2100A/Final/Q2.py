# Ngo Huu Gia Bao
# 101163137
def is_min_heap(lst: list) -> bool:
    """
    >>> is_min_heap([10, 50, 20, 70, 60, 44])
    True
    >>> is_min_heap([10, 50, 20, 30, 60, 44])
    False
    """
    
    for i in range((len(lst) - 2) // 2 + 1):
        if lst[i] > lst[2 * i + 1]:
            return False
        
        elif 2 * i + 2 != len(lst) and lst[i] > lst[2 * i + 2] :
            return False
        
    return True

print (is_min_heap([10, 50, 20, 70, 60, 44]))
print (is_min_heap([10, 50, 20, 30, 60, 44]))
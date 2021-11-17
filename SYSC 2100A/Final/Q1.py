# Ngo Huu Gia Bao
# 101163137
def up_down(n: int) -> list:
    """
    >>> up_down(1)
    [1]
    >>> up_down(5)
    [5, 16, 8, 4, 2, 1]
    """
    lst = [n]
    
    if n == 1:
        return [1]
    
    elif n % 2 == 0:
        lst.extend(up_down(n//2))
        
    else:
        lst.extend(up_down(n * 3 + 1))
        
    return lst
        
        
print (up_down(1))
print (up_down(5))
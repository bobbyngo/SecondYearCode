def merge_sort(lst: list) -> tuple[int, int]:
    """Sort lst into ascending order using the merge sort, and return the
    number of element comparisons and swaps performed while sorting.
    """
    num_comparisons = 0
    num_swaps = 0      
    
    if len(lst) > 1:
        mid = len(lst) // 2
        left_half = lst[:mid]
        right_half = lst[mid:]

        left_comparisons, left_swaps = merge_sort(left_half)
        right_comparisons, right_swaps = merge_sort(right_half)
        
        num_comparisons += left_comparisons + right_comparisons
        num_swaps += left_swaps + right_swaps

        i, j, k = 0, 0, 0
        while i < len(left_half) and j < len(right_half):
            num_comparisons += 1
            if left_half[i] <= right_half[j]:
                lst[k] = left_half[i]
                i = i + 1
            
            else:
                num_swaps += 1
                lst[k] = right_half[j]
                j = j + 1
            k = k + 1

        while i < len(left_half):
            lst[k] = left_half[i]
            i = i + 1
            k = k + 1

        while j < len(right_half):
            lst[k] = right_half[j]
            j = j + 1
            k = k + 1
    
    return (num_comparisons, num_swaps)
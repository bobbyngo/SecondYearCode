import random
import bubble_sort
import selection_sort
import merge_sort
import heapsort

def ascending_generator (n: int) -> list:
    """ Returning a ascending list
    """
    return [i for i in range(n)]


def descending_generator (n: int) -> list:
    """Returning a descending list
    """
    return [i for i in range(n, 0, -1)]


def random_generator (n: int) -> list:
    """Returning a random list
    """    
    return [random.randint(0, n) for i in range(n)]


def bubble_test(n: int) -> None:
    """Generating the bubble_sort
    """
    ascending_list = ascending_generator (n)
    descending_list = descending_generator (n)
    random_list = random_generator (n)
    
    this_dict = {"Ascending List" : ascending_list, "Descending List" : descending_list, "Random List" : random_list}    
    
    for lst in this_dict:
        print("Generating {}:".format(lst))
        #print(this_dict[lst])
        print(bubble_sort.bubble_sort(this_dict[lst]))


def selection_test(n: int) -> None:
    """Generating the selection_sort
    """    
    ascending_list = ascending_generator (n)
    descending_list = descending_generator (n)
    random_list = random_generator (n)
    
    this_dict = {"Ascending List" : ascending_list, "Descending List" : descending_list, "Random List" : random_list}    
    
    for lst in this_dict:
        print("Generating {}:".format(lst))
        #print(this_dict[lst])    
        print(selection_sort.selection_sort(this_dict[lst]))


def merge_test(n: int) -> None:
    """Generating the merge_sort
    """    
    ascending_list = ascending_generator (n)
    descending_list = descending_generator (n)
    random_list = random_generator (n)
    
    this_dict = {"Ascending List" : ascending_list, "Descending List" : descending_list, "Random List" : random_list}    
    
    for lst in this_dict:
        print("Generating {}:".format(lst))
        #print(this_dict[lst])     
        print(merge_sort.merge_sort(this_dict[lst]))


def heap_test(n: int) -> None:
    """Generating the heapsort
    """    
    ascending_list = ascending_generator (n)
    descending_list = descending_generator (n)
    random_list = random_generator (n)
    
    this_dict = {"Ascending List" : ascending_list, "Descending List" : descending_list, "Random List" : random_list}    
    
    for lst in this_dict:
        print("Generating {}:".format(lst))
        #print(this_dict[lst])     
        print(heapsort.heapsort(this_dict[lst]))    



#Testing value
n = 1024
print("bubble_sort:")
bubble_test(n)
print("\n")

print("selection_sort:")
selection_test(n)
print("\n")

print("merge_sort:")
merge_test(n)
print("\n")

print("heapsort:")
heap_test(n)

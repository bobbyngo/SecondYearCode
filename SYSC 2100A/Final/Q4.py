# Ngo Huu Gia Bao
# 101163137

class Node:
    def __init__(self, item):
        self.item = item   # value stored in the bag
        self.count = 1     # number of occurrences of the value
        self.next = None
        
class LinkedBag:
    def __init__(self) -> None:
        """Initialize the empty bag."""
        self._head = None  # Linked list with no nodes.
        self._size = 0

    def __len__(self) -> int:
        """Return the number of items in this bag."""
        return self._size
     
    
    def __str__(self) -> str:
        """Return a string representation of this list.
        """
        if self._head is None:
            return 'None'

        node = self._head
        # Traverse the list from head to tail, collecting the data
        # in the nodes as a list of strings.
        items = []
        while node is not None:
            items.append(str(node.item))
            node = node.next

        # Concatenate the strings in items, with each pair separated by " -> "
        return " -> ".join(items)    
        
        
    def add(self, item: int) -> None:
        """Put item in this bag."""
        new_node = Node(item)

        if self._head is None:
            self._head = new_node
            self._size += 1
            return

        else:
            curr = self._head
            while curr is not None:
                if curr.item == item:
                    self._size += 1
                    curr.count += 1
                    return
                curr = curr.next

            #If the item has that item


            new_node.next = self._head
            self._head = new_node
            self._size+=1
            
                           
# Testing as per the question outline
if __name__ == '__main__':
    lst = LinkedBag()
    lst.add(17)
    lst.add(17)
    lst.add(77)
    lst.add(17)
    lst.add(17)
    lst.add(77)    
    lst.add(31)
    print(str(lst))
    print(lst._size)
    lst2 = LinkedBag()
    print(str(lst2))   
        

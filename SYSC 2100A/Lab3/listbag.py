# SYSC 2100 Winter 2021 Lab 3

# An implementation of ADT Bag that uses Python's list type as the
# underlying data structure.

import random

#Ngo Huu Gia Bao

class Bag:

    def __init__(self):
        """Initialize an empty bag.

        >>> bag = Bag()
        >>> bag
        []
        """
        self._items = []
    
    def is_empty(self):
        return not bool(self._items)

    def __str__(self) -> str:
        """Return a string representation of this bag.

        >>> bag = Bag()
        >>> for x in [1, 2, 3, 4]:
        ...     bag.add(x)
        ...
        >>> str(bag)
        '[1, 2, 3, 4]'
        """
        return str(self._items)

    def __repr__(self) -> str:
        """Return a string representation of this bag.
        This string is identical to the one returned by __str__.

        >>> bag = Bag()
        >>> for x in [1, 2, 3, 4]:
        ...     bag.add(x)
        ...
        >>> repr(bag)
        '[1, 2, 3, 4]'
        >>> bag
        [1, 2, 3, 4]
        """
        return "{0}".format(self._items)

    def __iter__(self):
        """Return an iterator for this bag.

        >>> bag = Bag()
        >>> for x in [1, 2, 3, 4]:
        ...     bag.add(x)
        ...
        >>> for x in bag:
        ...     print(x)
        ...
        1
        2
        3
        4
        """
        return iter(self._items)

    def add(self, item: int) -> None:
        """Add item to this bag.

        >>> bag = Bag()
        >>> for x in [3, 1, 2, 3, 4]:
        ...     bag.add(x)
        ...
        >>> bag
        [3, 1, 2, 3, 4]
        """
        self._items.append(item)

    def __len__(self) -> int:
        """Return the number of items in this bag.

        >>> bag = Bag()
        >>> len(bag)
        0
        >>> for x in [1, 2, 3, 4]:
        ...     bag.add(x)
        ...
        >>> len(bag)
        4
        """
        return len(self._items)

    def __contains__(self, item: int) -> bool:
        """Return True if item is in the bag.

        >>> bag = Bag()
        >>> 2 in bag
        False
        >>> for x in [1, 2, 3, 4]:
        ...     bag.add(x)
        ...
        >>> 2 in bag
        True
        >>> 7 in bag
        False
        """
        return item in self._items

    def count(self, item: int) -> int:
        """Return the total number of occurrences of item in this bag.

        >>> bag = Bag()
        >>> for x in [3, 1, 2, 3, 4]:
        ...     bag.add(x)
        ...
        >>> bag
        [3, 1, 2, 3, 4]
        bag.count(3)
        2
        """
        return self._items.count(item)

    def remove(self, item: int) -> int:
        """Remove and return one instance of item from this bag.
        
        Raises KeyError if the bag is empty.
        Raises ValueError if item is not in the bag.

        >>> bag = Bag()
        >>> for x in [3, 1, 2, 3, 4]:
        ...     bag.add(x)
        ...
        >>> bag.remove(3)
        3
        >>> bag
        [1, 2, 3, 4]  if the first 3 was removed
        [3, 1, 2, 4]  if the second 3 was removed
        """
        if self.is_empty()  :
            raise KeyError("bag.remove(x): remove from empty bag")
        elif self.count(item) == 0:
            raise ValueError("bag.remove(x): x not in bag")
        
        self._items.remove(item)
        return item

    def grab(self) -> int:
        """Remove and return a randomly selected item from this bag.

        Raises KeyError if the bag is empty.

        >>> bag = Bag()
        >>> for x in [3, 1, 2, 3, 4]:
        ...     bag.add(x)
        ...
        >>> bag.grab()
        3     # (or 1 or 2 or 4)
        >>> bag
        [1, 2, 3, 4]  if the first 3 was removed
        [3, 1, 2, 4]  if the second 3 was removed
        """
        if self.is_empty()  :
            raise KeyError("bag.remove(x): remove from empty bag")
       
        choice = random.choice(self._items)
        self._items.remove(choice)
        return choice 
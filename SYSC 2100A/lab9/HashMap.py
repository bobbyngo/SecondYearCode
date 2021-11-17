# SYSC 2100 Winter 2021 Lab 9 / Assignment 2
# Last edited: Mar. 15, 2021

# An implementation of ADT Map that uses a hash table as the
# underlying data structure.

from typing import Any


def _to_str(val: Any) -> str:
    """If val is a string, return val enclosed in single-quotes;
    otherwise return str(val).

    >>> _to_str(5)
    '5'
    >>> _to_str('Hello')
    "'Hello'"
    >>> _to_str("Hello")
    "'Hello'"

    # Create s string of the form '(value)', where value is enclosed in
    # single quotes if it's a string.
    >>> value = 42
    >>> "(" + _to_str(value) + ")"   # or, "({0})".format(_to_str(value))
    '(42)'
    >>> value = 'word'
    >>> "(" + _to_str(value) + ")"   # or, "({0})".format(_to_str(value))
    "('word')"

    """
    if isinstance(val, str):
        return "'{0}'".format(val)
    return str(val)

class Entry:
    """An entry in a chain in a hash table."""

    def __init__(self, key: Any, value: Any) -> None:
        """Initialize this Entry with key and the associated value.
        The entry's link is initialized with the end-of-list marker (None).
        """
        self._key = key
        self._value = value
        self._next = None

    def get_key(self) -> Any:
        """Return this entry's key."""
        return self._key

    def set_key(self, key: Any) -> None:
        """Replace this entry's key with key."""
        self._key = value

    key = property(get_key, set_key)

    def get_value(self) -> Any:
        """Return the value part of this entry."""
        return self._value

    def set_value(self, value: Any) -> None:
        """Replace the value part of this entry with value."""
        self._value = value

    value = property(get_value, set_value)

    # Using 'Entry' as a type annotation is the PEP 484 hack for handling
    # forward references. Starting with Python 3.10, we should be able to
    # use Entry as a type annotation within the class.

    def get_next(self) -> 'Entry':
        """Return the reference (pointer) to the entry that follows this entry,
        or None if this entry is at the end of a chain.
        """
        return self._next

    def set_next(self, next_entry: 'Entry') -> None:
        """Append next_entry to this entry."""
        self._next = next_entry

    next = property(get_next, set_next)

    def __str__(self) -> str:
        """Return a string representation of the (key, value) pair stored
        in this entry, in the form "(key, value)".
        """
        return "(" + _to_str(self.key) + ", " + _to_str(self.value) + ")"

    def __repr__(self) -> str:
        """Return a string representation of the (key, value) pair stored
        in this entry, in the form "Entry(key, value)".
        """
        return 'Entry' + str(self)

TABLE_SIZE = 11  # of slots in the hash table

class HashMap:

    def __init__(self, iterable=None) -> None:
        """Initialize this HashMap with the contents of iterable
        (a sequence of (key, value) pairs).

        If iterable isn't provided, the new map is empty.

        >>> map = HashMap()
        >>> map
        {}

        >>> supplies = HashMap([('pencils', 1), ('erasers', 2), ('pens', 5)])
        >>> supplies
        {'erasers': 2, 'pens': 5, 'pencils': 1}
        """
        self._slots = [None] * TABLE_SIZE
        self._size = 0
        if iterable is not None:
            for key, value in iterable:
                self.put(key, value)  # put will increment _size

    def __str__(self) -> str:
        """Return a string representation of this map, in the format:
        "{key_1: value_1, key_2: value_2, ...}"

        >>> map = HashMap()
        >>> str(map)
        '{}'

        >>> supplies = HashMap()
        >>> supplies.put('pencils', 1)
        >>> supplies.put('erasers', 2)
        >>> supplies.put('pens', 5)
        >>> str(supplies)
        "{'erasers': 2, 'pens': 5, 'pencils': 1}"
        """
        if self._size == 0:
            return '{}'

        # Traverse the hash table's chains from head to tail, collecting the
        # (key, value) pairs as a list of strings.
        items = []
        for i in range(len(self._slots)):
            if self._slots[i] is not None:
                entry = self._slots[i]
                while entry is not None:
                    # Represent the entry as: 'key: value'.
                    items.append(_to_str(entry.key) + ": " + _to_str(entry.value))
                    entry = entry.next

        return '{' + ', '.join(items) + '}'

    def __repr__(self) -> str:
        """Return a string representation of this map, in the format:
        "{key_1: value_1, key_2: value_2, ...}"

        >>> map = HashMap()
        >>> str(map)
        '{}'

        >>> supplies = HashMap()
        >>> supplies.put('pencils', 1)
        >>> supplies.put('erasers', 2)
        >>> supplies.put('pens', 5)
        >>> supplies
        {'erasers': 2, 'pens': 5, 'pencils': 1}
        """
        return str(self)

    def _hash_function(self, key: Any, size: int) -> int:
        """Hash key into a slot (an index in the hash table) in the
        range 0..size - 1, and return that slot.

        Precondition: key must be hashable.
        Precondition: size > 0.

        >>> map = HashMap()
        >>> map._hash_function(42, 11)
        9
        >>> map._hash_function(-42, 11)
        9
        >>> map._hash_function('pencil', 11)
        10
        """
        return abs(hash(key)) % size

    def put(self, key: Any, value: Any) -> None:
        """Insert key and the associated value in this map.

        If key is already in the map, replace the old value with value.

        Precondition: key is hashable.

        >>> supplies = HashMap()
        >>> supplies.put('pencils', 1)
        >>> supplies.put('erasers', 2)
        >>> supplies.put('pencils', 7)
        >>> str(supplies)
        "{'erasers': 2, 'pencils': 7}"
        """
        new_node = Entry(key, value)
        index = self._hash_function(key, len(self._slots))
        
        #If the index of the slot is None, a node is added 
        if self._slots[index] is None:
            self._slots[index] = new_node
            self._size += 1
           
        #If the index at the specific sloth has that key, update the value
        elif self._slots[index].key == key:
            new_node.next = self._slots[index].next
            self._slots[index] = new_node        
        
        #If the index of the sloth is not None
        else:
     
            #Check if the index at the specific slot has the key or not, if not add the key to that index
            curr = self._slots[index]
            while curr.next is not None and curr.next.key != key: 
                curr = curr.next
            
            #If the slot doesn't have that key
            if curr.next is None:
                curr.next = new_node
                self._size += 1
                
            #If the slot has that key
            else:
                new_node.next = curr.next.next
                curr.next = new_node
        

    def get(self, key: Any, default=None) -> Any:
        """If key is in the map, return the value associated with key;
        otherwise return default. If key is not in the map and default is
        not given, return None.

        Precondition: key is hashable.

        >>> supplies = HashMap()
        >>> supplies.put('pencils', 1)
        >>> supplies.put('erasers', 2)
        >>> supplies.put('pens', 5)
        >>> supplies.get('pencils')
        1
        >>> supplies.get('rulers', 0)
        0
        >>> print(supplies.get('rulers'))
        None
        """
        start_position = self._hash_function(key, len(self._slots))
        index = self._slots[start_position]
        
        if self._size == 0:
            return None
        
        while index is not None:
            #Found the key
            if index.key == key:
                return index.value
            
            #Moving to the next index
            else:
                index = index.next
                
                if index == self._slots[start_position]:
                    return default
        
        return default
        

    def __len__(self) -> int:
        """Return the number of (key, value) pairs in this map.

        >>> map = HashMap()
        >>> len(map)
        0

        >>> supplies = HashMap()
        >>> supplies.put('pencils', 1)
        >>> supplies.put('erasers', 2)
        >>> supplies.put('pens', 5)
        >>> len(supplies)
        3
        """
        return self._size

    def __contains__(self, key: Any) -> bool:
        """Return True if key is in the HashMap; otherwise False

        Precondition: key must be hashable.

        >>> map = HashMap()
        >>> 5 in map
        False

        >>> supplies = HashMap()
        >>> supplies.put('pencils', 1)
        >>> supplies.put('erasers', 2)
        >>> supplies.put('pens', 5)
        >>> 'pencils' in supplies
        True
        >>> 'rulers' in supplies
        False
        """
        #if self._size == 0:
            #return False
        #else:
        start_position = self._hash_function(key, len(self._slots))
        index = self._slots[start_position]
        
        while index is not None:
            if index.key == key:
                return True
            #Moving to the next index
            else:
                index = index.next
                
                if index == self._slots[start_position]:
                    return False
        
        return False                
            

    def pop(self, key: Any, default: Any = None) -> Any:
        """If key is in the map, remove it and return the value associated
        with the key; otherwise return default. If key is not in the map
        and default is not given, raise a KeyError with the message,
        "Key key not found"

        Precondition: key is hashable.

        >>> supplies = HashMap()
        >>> supplies.put('pencils', 1)
        >>> supplies.put('erasers', 2)
        >>> supplies.put('pens', 5)

        >>> supplies.pop('erasers')
        2
        >>> supplies
        {'pens': 5, 'pencils': 1}

        >>> supplies.pop('rulers', 0)
        0
        >>> supplies
        {'pens': 5, 'pencils': 1}

        >>> supplies.pop('rulers')
        builtins.KeyError: 'Key rulers not found'
        >>> supplies
        {'pens': 5, 'pencils': 1}
        """
        start_slot = self._hash_function(key, len(self._slots))
        
        index = self._slots[start_slot]
        if index is None:
            if default is None:    
                raise KeyError("Key {} not found".format(key))            
            return default       
        
        elif index.key == key:
            removed_value = index.value
            #Skipped that node
            self._slots[start_slot] = self._slots[start_slot].next    
            return removed_value      
        
        else:
            while index.next is not None:
                #Checking if the key wants to be removed
                if index.next.key == key:
                    removed_value = index.next.value
                    #Skipped that node
                    #self._slots[start_slot] = self._slots[start_slot].next
                    index.next = index.next.next
                    
                    return removed_value
                
                else:
                    index = index.next
        if default is None:    
            raise KeyError("Key {} not found".format(key))    
        
        return default
        

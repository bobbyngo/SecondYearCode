# Ngo Huu Gia Bao
# 101163137

class TreeNode:
    def __init__(self, item) -> None:
        self.item = item
        self.left = None
        self.right = None
   
def count_leaves(root: TreeNode) -> int:
    
    if root is None:
        return 0
    
    if root.left is None and root.right is None:
        return 1
    
    #Assumption: The root node is not counted
    return count_leaves(root.left) + count_leaves(root.right)


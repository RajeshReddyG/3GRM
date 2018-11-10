from collections import namedtuple
Node = namedtuple('Node', 'data, left, right')
tree = Node(1,
            Node(2,
                 Node(4,
                      Node(7, None, None),
                      None),
                 Node(5, None, None)),
            Node(3,
                 Node(6,
                      Node(8, None, None),
                      Node(9, None, None)),
                 None))
 
def printnode(i):
    print(i,end=" "),
def preorder(node):
    if node is not None:
        printnode(node.data)
        preorder(node.left)
        preorder(node.right)
 
def inorder(node):
    if node is not None:
        inorder(node.left)
        printnode(node.data)
        inorder(node.right)
 
def postorder(node):
    if node is not None:
        postorder(node.left)
        postorder(node.right)
        printnode(node.data)
 
print('\npreorder:')
preorder(tree)
print('\ninorder:')
inorder(tree)
print('\npostorder:')
postorder(tree)



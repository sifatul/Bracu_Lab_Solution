import random


class Node:
    type = " "  # max or min
    child1 = None
    child2 = None
    child3 = None
    parent = None
    value = None
    alpha = float("-inf")
    beta = float("inf")

    def __init__(self, type, value):
        self.type = type
        self.value = value

    def Node(self, type, child, parent, value, alpha, beta):
        self.type = type
        self.child = child
        self.parent = parent
        self.value = value
        self.alpha = alpha
        self.beta = beta


def make_tree(depth, head):
    if depth == 0:
        head.type = "terminal"
        head.value = random.randint(1, 20)
        print("terminal ", head.value)
        return head
    if head.type is "max":

        node1 = Node("min", float("inf"))
        node2 = Node("min", float("inf"))
        node3 = Node("min", float("inf"))

        head.child1 = node1
        head.child2 = node2
        head.child3 = node3

        node1.parent = head
        node2.parent = head
        node3.parent = head

        node1 = make_tree(depth - 1, node1)
        node2 = make_tree(depth - 1, node2)
        node3 = make_tree(depth - 1, node3)

    elif head.type is "min":
        node1 = Node("max", float("-inf"))
        node2 = Node("max", float("-inf"))
        node3 = Node("max", float("-inf"))

        head.child1 = node1
        head.child2 = node2
        head.child3 = node3

        node1.parent = head
        node2.parent = head
        node3.parent = head

        node1 = make_tree(depth - 1, node1)
        node2 = make_tree(depth - 1, node2)
        node3 = make_tree(depth - 1, node3)


def alpha_beta_pruning(head):
    if head is None:
        return
    if head.alpha > head.beta:
        print("pruning head")
        return

    if head.child1 is not None:
        arr = list()
        arr.append(head.child1)
        arr.append(head.child2)
        arr.append(head.child3)
        while len(arr) != 0:
            child = arr[0]
            arr.remove(arr[0])

            child.alpha = head.alpha
            child.beta = head.beta

            alpha_beta_pruning(child)

            if len(arr) == 0 and head.type is "max" and head.alpha > head.value:
                print("update head max ", head.alpha)
                head.value = head.alpha
            elif len(arr) == 0 and head.type is "min" and head.beta < head.value:
                print("update head min ", head.beta)
                head.value = head.beta
            if head.parent != None and len(arr) == 0:
                print(" \ninside parent head value:", head.value)
                if head.parent.type is "min" and head.value < head.parent.beta:
                    head.parent.beta = head.value
                    print("updating parent ", head.parent.alpha, head.parent.beta)
                elif head.parent.type is "max" and head.value > head.parent.alpha:
                    head.parent.alpha = head.value
                    print("updating parent ", head.parent.alpha, head.parent.beta)

            if head.parent != None and head.parent.alpha > head.parent.beta:
                arr[:] = []
                print("pruning and skip")
                return

    print("for terminal", head.alpha, head.beta)
    if head.type is "terminal" and head.parent.type is "max" and head.value > head.parent.alpha:
        head.parent.alpha = head.value
        print("max terminal ", head.value)
    elif head.type is "terminal" and head.parent.type is "min" and head.value < head.parent.beta:
        head.parent.beta = head.value
        print("min terminal ", head.value)


'''####     take input from file and make tree     ####'''

file = open("input.txt", 'r')  # Open the file for reading.
data = file.read()  # Read the contents of the file.
file.close()  # Close the file since we're done using it.
sentences = data.splitlines()  # Making array of each sentences.

no_of_turn = sentences[0]
no_of_child = sentences[1]

range_start = sentences[2].split()[0]
range_end = sentences[2].split()[1]

depth = int(no_of_turn) * 2;

head = Node("max", float("-inf"))
make_tree(depth, head)

alpha_beta_pruning(head)
print(head.value)

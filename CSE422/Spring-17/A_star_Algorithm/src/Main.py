class Node(object):
    g = 0
    h = 0
    f = 0
    city = ''
    path = ''

    # The class "constructor" - It's actually an initializer
    def __init__(self, city_name, g, h, f, succ_path):
        self.city = city_name  # current city name
        self.path = succ_path  # path followed till now
        self.g = g  # cost of path till now
        self.h = h  # heuristic value of current state
        self.f = f  # f for current sate




starting = ''
ending = ''


def populate_graph(url):
    global starting
    global ending
    graph = {}
    file = open(url, 'r')  # Open the file for reading.
    data = file.read()  # Read the contents of the file.
    file.close()  # Close the file since we're done using it.
    my_list = data.splitlines()  # Making array of each sentences.
    graph_dimension = 0
    for sentence in my_list:

        words = sentence.replace(',', '').split(' ')  # split for ' ' or ,
        if my_list.index(sentence) == 0:  # for graph_dimension
            if graph_dimension == 0:
                graph_dimension = words[0]
        elif my_list.index(sentence) == 1:  # for starting location
            if starting is '':
                starting = words[0]

        elif my_list.index(sentence) == 2:  # for ending location
            if ending is '':
                ending = words[0]

        elif my_list.index(sentence) > 2 and len(words) > 2:
            #   populate graph for city1 , city2
            node = [words[1], words[2]]  # city = [neightbout, distance]
            if graph.get(words[0], False) is False:  # city not in graph
                # make city1 a key ; append city2 as neighbor and distance between city1,city2
                graph[words[0]] = [node]

            else:
                # (graph.get(words[0], False)) return the array of neighbout cities and distance under the city1
                if node not in (graph.get(words[0], False)):  # check if neighbout already in the list of the key
                    (graph.get(words[0], False)).append(node)  # append neighbour and its distance  when key is city1

            node = [words[0], words[2]]  # make city2 a key; append city1 as neighbour and its distance
            if graph.get(words[1], False) is False:  # make city2 a key and append city1 as neighbour
                graph[words[1]] = [node]
            else:
                if node not in (graph.get(words[1], False)):
                    (graph.get(words[1], False)).append(node)  # append city1 as neighbour when key is city2

    return graph


def get_heuristic(url):
    heur = {}
    file = open(url, 'r')  # Open the file for reading.
    data = file.read()  # Read the contents of the file.
    file.close()  # Close the file since we're done using it.
    my_list = data.splitlines()  # Making array of each sentences.
    for sentence in my_list:

        words = sentence.replace(',', '').split(' ')  # split for ' ' or ,
        if len(words) == 2:
            heur[words[0]] = words[1]

    return heur


def check_path(open_or_close_list, n):
    for node in open_or_close_list:
        if node.city is n.city:  # if a node exist for the same path, in list
            return True

    return False


def get_node_of_min_f(open_list):
    min = 10000
    n = ' '

    for node in open_list:
        if node.f <= min:
            min = node.f
            n = node
    return n


def a_star_search(graph, heuristic):
    open_list = []
    close_list = []

    n = Node(starting, 0, heuristic[starting], 0, starting)  # self,city_name, g, h, f , succ_path
    result = Node(ending, 0, 0, 10000, '')  # init as node for result
    open_list.append(n)
    while bool(open_list):
        q = get_node_of_min_f(open_list)
        open_list.remove(q)  # removing the node with min f
        successors = graph[q.city]  # neighbours of city and their distance
        for successor in successors:
            neighbour = successor[0]  # name of the neighbour
            if neighbour is ending:
                successor_g = q.g + float(successor[1])  # cost to reach q + distance between successor and city
                successor_h = float(heuristic[neighbour])  # heuristic for the city
                successor_f = successor_g + successor_h
                successor_path = q.path + "->" + neighbour  # path that the neighbour is making

                if successor_f < result.f:
                    result = Node(neighbour, successor_g, successor_h, successor_f, successor_path)
                break

            successor_g = q.g + float(successor[1])  # cost to reach q + distance between successor and city
            successor_h = float(heuristic[neighbour])  # heuristic for the city
            successor_f = successor_g + successor_h
            successor_path = q.path + "->" + neighbour  # path that the neighbour is making
            # #print(successor_f)
            n = Node(neighbour, successor_g, successor_h, successor_f, successor_path)
            if not check_path(open_list, n) and not check_path(close_list, n):
                # if city is not in open list and close list
                open_list.append(n)

        close_list.append(q)

    return result


graph = populate_graph('input.txt')  # populate graph with city,its neighbour and distace between them
# {'city'=['neighbour','distance_between_them']}
heuristic = get_heuristic('input.txt')  # input heuristic value for each city
result = a_star_search(graph, heuristic)  # result is the best node with min value of f

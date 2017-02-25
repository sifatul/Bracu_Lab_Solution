import pprint ## for printing the graph nicely
import queue


starting = ''
ending = ''


def populate_graph(url, permission):
    global starting
    global ending
    graph = {}
    file = open(url, permission)  # Open the file for reading.
    data = file.read()  # Read the contents of the file.
    file.close()  # Close the file since we're done using it.
    my_list = data.splitlines()  # Making array of each sentences.

    for sentence in my_list:

        words = sentence.replace(',', '').split(' ')    # split for ' ' or ,

        if my_list.index(sentence) == 1:    # for starting location
            if starting is '':
                starting = words[0]
        elif my_list.index(sentence) == 2:  # for ending location
            if ending is '':
                ending = words[0]
        elif my_list.index(sentence) > 2 and len(words) >= 2:
            # populate graph for city1 , city2
            if graph.get(words[0], False) is False: # city not in graph
                graph[words[0]] = [words[-1]]   # make city1 a key and append city2 as neighbour
            else:
                (graph.get(words[0], False)).append(words[-1])  # append city2 as neighbour when key is city1
            if graph.get(words[-1], False) is False:    # make city2 a key and append city1 as neighbour
                graph[words[-1]] = [words[0]]
            else:
                (graph.get(words[-1], False)).append(words[0])   # append city1 as neighbour when key is city2

    return graph


def bidirectional_search( graph ):
    path_length = 0
    direction = ''
    road_length = 0

    q_front = queue.Queue()   # for forward iteration
    q_back = queue.Queue()    # for backward iteration
    q_front.put(starting)
    q_back.put(ending)

    collision_city = ''
    front_path = []     # path taken in forward iteration
    back_path = []      # path taken in backward iteration
    visited = list()    # list of city visited
    flag = True
    visited.append(starting)
    visited.append(ending)

    while flag is True:

        if not q_front.empty():
            temp = q_front.get()
            front_path.append(temp)
            path_length += 1
            neighbour = graph.get(temp)     # get list of neighbouring city

            for city in neighbour:
                if city not in visited:     # neighbour not visited
                    q_front.put(city)
                    visited.append(city)
                elif city not in front_path:    # city not used in forward iteration but its visited before
                    collision_city = city       # city where forward and backward iteration meets
                    flag = False
                    direction = " forward"
                    road_length = len(front_path)
                    break

        if flag is False:
            break
        elif not q_back.empty():
            temp = q_back.get()
            back_path.append(temp)
            path_length += 1
            neighbour = graph.get(temp)     # get list of neighbouring city
            for city in neighbour:
                if city not in visited:      # neighbour not visited
                    visited.append(city)
                    q_back.put(city)
                elif city not in back_path:     # city not used in backward iteration but its visited before
                    collision_city = city
                    flag = False
                    direction = "backward"
                    road_length = len(front_path)
                    break

    route = '-> '.join(front_path) + " -> " + collision_city
    for path in reversed(back_path):    # path in backward iteration is in reverse order
        route += "->"+path
    print("Route :", route)
    print("Length : ", path_length)
    print("Direction:", direction)
    print("City: ", collision_city)
    print("Road: ", road_length)

graph = populate_graph('input.txt', 'r')
bidirectional_search(graph)

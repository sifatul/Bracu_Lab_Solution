#Bidirectional Search
Assume you have to travel from Arad city to Bucharest city. You desire to travel this route. Following is a road-map.
The cost of moving from one city to another city is same. There remains multiple paths to reach Bucharest city from Arad city. 
In order to quickly find out a shortest route, you require to apply Breadth First Search from two directions i.e. one from the starting city Arad which we call Forward Search and another from the destination city Bucharest which we call Backward Search. 
The searching process from both directions will terminate as soon as the overlapping city is discovered from any direction.
 
<img src="http://web.cs.ucdavis.edu/~vemuri/classes/ecs170/blindsearches_files/blind_searches_files/romania001.jpg" alt="image of a map" > 

**Input:**
You’ll be given the information of the map, the locations of your starting and the destination city. We’re providing you a sample input (the information needed for the above map) to help you understand the input format.
20 24 (citys,roads)
Arad (Starting Location)
Bucharest (Destination Location)
 [information of 24 roads]
Odarea, Sibiu 
Farara,Urziccini
Riminecu, Pitesi
……………………
..
.




 **Output:**
Print a shortest route with length. You also need to mention (1) the overlapping city with direction (Forward/Backward) on which point you have terminated your search and (2) the number of roads (from the starting city  if it is found in Forward direction or from destination city if it is found in Backward direction) you require to reach there. We’re providing you a sample output.

Route: Arad->Sibiu->Fagaras ->Bucharast

Length: 3

Direction: Forward City: Fagaras #Roads: 2


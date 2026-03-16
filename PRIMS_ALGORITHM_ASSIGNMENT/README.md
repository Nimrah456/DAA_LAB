This program implements Prim’s Algorithm to find the Minimum Spanning Tree (MST) of a weighted undirected graph. The goal of the algorithm is to connect all the vertices in the graph with the minimum total edge weight without forming any cycles.

First, the graph is represented using an adjacency list, where each vertex stores its neighboring vertices along with the weight of the connecting edge. Since the graph is undirected, every edge is added in both directions.

A visited array is used to keep track of which vertices are already included in the Minimum Spanning Tree. This prevents the algorithm from visiting the same vertex multiple times.

A priority queue (min heap) is used to always select the edge with the smallest weight. The algorithm starts from the given start node and inserts it into the priority queue with weight 0.

The algorithm then repeatedly removes the node with the smallest weight from the queue. If the node has not been visited, it is marked as visited and its edge weight is added to the total weight of the Minimum Spanning Tree.

Next, all the neighboring vertices of the current node are checked. If a neighbor has not been visited yet, it is added to the priority queue along with its edge weight.

This process continues until all vertices are visited and the priority queue becomes empty. Finally, the total accumulated weight represents the weight of the Minimum Spanning Tree.

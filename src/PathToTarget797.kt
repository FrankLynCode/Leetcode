/**
 * 797. All Paths From Source to Target
 *Given a directed, acyclic graph of N nodes.  Find all possible paths from node 0 to node N-1, and return them in any order.

The graph is given as follows:  the nodes are 0, 1, ..., graph.length - 1.  graph[i] is a list of all nodes j for which the edge (i, j) exists.

Example:
Input: [[1,2], [3], [3], []]
Output: [[0,1,3],[0,2,3]]
Explanation: The graph looks like this:
0--->1
|    |
v    v
2--->3
There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
 **/
fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
    lateinit var resultPaths : List<List<Int>>
            graph.forEachIndexed{ index, node ->


        }
    }
    return resultPaths
}

fun dfsPaths(graph : Array<IntArray>,result : MutableList<List<Int>>, node : Int){
    if (node == graph.size-1){

    }

    graph[node+1].forEach{ pathTo ->
        dfsPaths(graph,result,pathTo)
    }
}


package dataStructure

class Node (data : Int){
    var next : Node? = null

    fun appendToTail(d: Int){
        val end = Node(d)
        var nextNode = this
        while (this.next != null ) nextNode = nextNode.next!!
        this.next = end
    }
}


package dataStructure

class TN{
    var isLastChar : Boolean =false
    var child = Array<TN?>(26){ _ -> null}
}

class Trie() {

    /** Initialize your data structure here. */
    private val root : TN? = TN()

    /** Inserts a word into the trie. */
    fun insert(word: String) {
        var node = root
        word.forEach{
            if(node!!.child[it-'a']==null)
                node!!.child[it-'a'] = TN()
            node = node!!.child[it-'a']
        }
        node!!.isLastChar = true
    }

    /** Returns if the word is in the trie. */
    fun search(word: String): Boolean {
        var node = root
        word.forEach{
            if(node!!.child[it-'a']==null) return false
            node = node!!.child[it-'a']
        }
        return node!!.isLastChar
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    fun startsWith(prefix: String): Boolean {
        var node = root
        prefix.forEach{
            if(node!!.child[it-'a']==null) return false
            node = node!!.child[it-'a']
        }
        return true
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * var obj = Trie()
 * obj.insert(word)
 * var param_2 = obj.search(word)
 * var param_3 = obj.startsWith(prefix)
 */
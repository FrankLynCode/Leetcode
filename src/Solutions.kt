class Solutions{
/* brute force
    fun defangIPaddress(address : String) : String{
        var newAddress : String = ""
        address.forEach {
            if ( it == ".".single() ){
                newAddress += "[$it]"
            }else{
            newAddress += it
            }
        }
        return newAddress
    }
 **/
    /**
     * one linegit
     *
     */
    fun defineIPAddress(address : String) : String {
        return address.replace(".","[.]")
    }

}

fun main() {
    val solutions = Solutions()
    val address = "192.168.1.1"
    println(solutions.defineIPAddress(address))
}
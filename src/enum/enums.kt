package enum

enum class Network(val enabled:Boolean){
    CONNECTED(true),
    DISCONNECT(false)
}

enum class ApiState{

}

fun getNetwork(network: Network):Boolean{
   return when(network){
        Network.CONNECTED->{
            network.enabled
        }
        Network.DISCONNECT->{
            network.enabled
        }
    }
}

fun main(){
    val res = getNetwork(Network.CONNECTED)
    println(res)
}

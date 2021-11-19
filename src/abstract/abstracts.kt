package abstract

abstract class LoadState{
data class Success(val data:String) : LoadState()
data class Failure(val t:Throwable) : LoadState()
object Loading : LoadState()
object Idle : LoadState()
}

fun getLoadState(loadState: LoadState):Any{
    return when(loadState){
        is LoadState.Success ->{
            loadState.data
        }
        is LoadState.Failure ->{
            loadState.t
        }
        LoadState.Loading ->{}
        LoadState.Idle->{}
        else -> {}
    }
}

fun main(){
    val res = getLoadState(LoadState.Success("hey"))
    println(res)
}
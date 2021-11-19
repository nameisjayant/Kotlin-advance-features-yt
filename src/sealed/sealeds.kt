package sealed

sealed class LoadState1{
    data class Success(val data:String) : LoadState1()
    data class Failure(val t:Throwable) : LoadState1()
    object Loading : LoadState1()
    sealed class Demo {
        data class DemoOne(val data:Int) : Demo()
    }
}

object Idle : LoadState1()

fun getLoad(loadState1: LoadState1):Any{
    return when(loadState1){
        is LoadState1.Success ->{}
        is LoadState1.Failure->{}
        LoadState1.Loading->{}
        Idle -> {}
    }
}

fun main(){
    val res = getLoad(LoadState1.Success("data..."))
}
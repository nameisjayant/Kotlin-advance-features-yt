package sealed

sealed class CommonErrors : UserErrors,LoginErrors{
    object Authorised : CommonErrors()
    object ServerError : CommonErrors()
}

sealed interface UserErrors {
    object EmailAndPasswordError : UserErrors
}

fun getUserErrors(userErrors: UserErrors): Any {
    return when (userErrors) {
        UserErrors.EmailAndPasswordError -> {}
        CommonErrors.Authorised->{}
        CommonErrors.ServerError->{}
    }
}

sealed interface LoginErrors {
    object LoginError : LoginErrors
}
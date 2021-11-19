package sealed

sealed class CommonErrors : UserErrors,LoginErrors{
    object UnAuthorised : CommonErrors()
    object ServerError : CommonErrors()
    object BadRequest : CommonErrors()
}

sealed interface UserErrors {
    data class UserAndEmailError(val data: String) : UserErrors
}

fun getUserErrors(userErrors: UserErrors) {
    return when (userErrors) {
        is UserErrors.UserAndEmailError -> {}
        is CommonErrors.UnAuthorised->{}
        is CommonErrors.BadRequest->{}
        is CommonErrors.ServerError->{}
    }
}

sealed interface LoginErrors {
    object LoginError : LoginErrors

}


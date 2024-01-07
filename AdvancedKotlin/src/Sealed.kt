sealed class Result {

    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> print("Success: ${result.data}")
        is Result.Error -> print("Error: ${result.message}")
    }
}
import java.util.*

//TODO INSTRUCTIONS:
//  1. Now that you have the code in IntelliJ on your computer, use VCS to "Share this project to your GitHub repo
//     that is attached to your student email.  MAKE SURE YOU HAVE THIS REPO SET TO PRIVATE.
//  2. Run the app and familiarise yourself with the output and where each part of the output came from in the code.
//  3. There are multiple TO DO comments - follow this workflow when addressing EACH one:
//       a. Locate a single TO DO item that you want to work on
//       b. Add the required code to address it.
//       c. Commit the change to your local repository, making sure your commit message explains (briefly) what you did.
//       d. Push the change to your remote repository
//  4. REMEMBER TO USE THIS GITHUB WORKFLOW FOR EACH CHANGE - failure to use GitHub in this way will result in
//     a lower grade for the assignment as it is a software development tooling module.
// Hint: the week 2 syntax labs are a good support for completing this project

fun main(args: Array<String>) {
    minimumOf(5,7)
    rangeOf(4)
    inferredTypeOf(0.0F)
    stringContains("wordle")
}

fun minimumOf(number1: Long, number2: Long){
    //TODO This function takes in two numbers and:
    //  if number1 is less than number2, then print a message informing the user of that.
    //  if number1 is greater than or equal to number2, print a message letting the user know that.
    if(number1 < number2) {
        println("Number1 is less than Number2")
    } else if(number1 >= number2) {
        println("Number1 is greater or equal to Number2")
    }
}

fun rangeOf(number: Int){
    //TODO This function takes in a number and prints out the range that the number falls in.
    // The ranges are: (0 or below) (1 to 5), (6 to 10), (11 to 20), (21+)
    // For example, if the number was 7, print out a message saying that the number 7 falls into the range 6 to 10.
    when(number) {
        in Int.MIN_VALUE..0 -> println("$number falls into the range 0 or below")
        in 1..5 -> println("$number falls into the range 1 to 5")
        in 6..10 -> println("$number falls into the range 6 to 10")
        in 11..20 -> println("$number falls into the range 11 to 20")
        in 21..Int.MAX_VALUE -> println("$number falls into the range 21+")
    }
}

fun inferredTypeOf(variable: Any){
    //TODO This function examines the inferred type of the variable passed as a parameter.
    // When the type is Int, print out that the data type of the variable is Int.
    //    Adopt the same approach for the following types: Long, Double, Float or Boolean.
    // When the data type is not Int, Long, Double, Float or Boolean, print that the data type is something else.
    when(variable) {
        is Int -> println("$variable is of type Int")
        is Long -> println("$variable is of type Long")
        is Double -> println("$variable is of type Double")
        is Float -> println("$variable is of type Float")
        is Boolean -> println("$variable is of type Boolean")
        !is Int, Long, Double, Float, Boolean -> println("$variable is something else")
    }
}

fun stringContains(str : String){
    //TODO If the string, passed as a parameter:
    //    - contains the letter A, print the string and say it contains A.
    //    - contains the letter B, print the string and say it contains B.
    //    - contains the letter C, print the string and say it contains C.
    //    - is empty, inform the user that it is empty.
    //    - otherwise print the string and say it doesn't contain A, B or C.
//    if(str.uppercase(Locale.getDefault()).contains('A')) {
//        println("$str contains the letter 'A'")
//    } else if(str.uppercase(Locale.getDefault()).contains('B')) {
//        println("$str contains the letter 'B'")
//    } else if(str.uppercase(Locale.getDefault()).contains('C')) {
//        println("$str contains the letter 'C'")
//    } else if(str.isEmpty()) {
//        println("The String is empty")
//    } else {
//        println("$str doesn't contain A, B or C")
//    }

    when {
        str.contains('A') -> println("$str contains the letter 'A'")
        str.contains('B') -> println("$str contains the letter 'B'")
        str.contains('C') -> println("$str contains the letter 'C'")
        str.isEmpty() -> println("The String is empty")
        !str.contains('A') || !str.contains('B') || !str.contains('C') -> println("$str doesn't contain A, B or C")
    }


}

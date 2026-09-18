// Task 9.4: use of catch blocks

fun main() {
    try {
        print("Enter numerator: ")
        val numerator = readln().toInt()
        print("Enter denominator: ")
        val denominator = readln().toInt()

        val result = numerator / denominator
        val remainder = numerator % denominator
        println("Result = $result remainder $remainder")
    }
    catch (error: NumberFormatException) {
        println("You didn't enter a valid number")
    }
    catch (error: IllegalArgumentException) {
        println("Illegal argument")
    }
    catch (error: Exception) {
        println("Some sort of error occurred")
    }
    catch (error: ArithmeticException) {
        println("You tried to divide by zero")
    }
}

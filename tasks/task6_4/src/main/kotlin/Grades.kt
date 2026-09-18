// Task 6.4: exam grading function

fun grade(mark: Int) = when (mark) {
    in 0..39 -> "Fail"
    in 40..70 -> "Pass"
    in 70..100 -> "Distinction"
    else -> "?"
}

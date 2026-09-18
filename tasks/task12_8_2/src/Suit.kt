// Task 12.8.2: enum class for playing card suits

enum class Suit(val symbol: Char) {
    Clubs('♣'),
    Diamonds('♦'),
    Hearts('♥'),
    Spades('♠');

    val plainSymbol get() = name[0]

    override fun toString() = "$symbol"
}

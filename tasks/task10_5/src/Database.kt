// Task 10.5

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun loadDatabase(filename: String) = buildMap {
    Path(filename).forEachLine {
        val parts = it.split(",")
        put(parts[0].trim(), parts[1].trim())
    }
}

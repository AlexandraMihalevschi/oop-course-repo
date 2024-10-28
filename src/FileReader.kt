import java.io.File

class FileReader {
    fun readFileIntoString(path: String): String {
        return File(path).readText()
    }
}

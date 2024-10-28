class TextData(private val fileName: String, private val text: String) {

    private val vowels = "AEIOUaeiou"
    private val consonants = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz"

    private val numberOfVowels: Int = text.count { it in vowels }
    private val numberOfConsonants: Int = text.count { it in consonants }
    private val numberOfLetters: Int = text.count { it.isLetter() }
    private val numberOfSentences: Int = text.split(Regex("[.!?]")).size - 1
    private val longestWord: String = text.split(Regex("\\W+")).maxByOrNull { it.length } ?: ""

    fun getFileName() = fileName
    fun getText() = text
    fun getNumberOfVowels() = numberOfVowels
    fun getNumberOfConsonants() = numberOfConsonants
    fun getNumberOfLetters() = numberOfLetters
    fun getNumberOfSentences() = numberOfSentences
    fun getLongestWord() = longestWord

    override fun toString(): String {
        return """

Filename: $fileName
Text: $text 

            Number of Vowels: $numberOfVowels
            Number of Consonants: $numberOfConsonants
            Number of Letters: $numberOfLetters
            Number of Sentences: $numberOfSentences
            Longest Word: $longestWord
        """.trimIndent()
    }
}

import java.io.FileReader

fun main(args: Array<String>) {

    // Instantiate three Display objects
    val display1 = Display(3840, 2160, 400f, "Display A") // Best
    val display2 = Display(2560, 1440, 250f, "Display B")
    val display3 = Display(1920, 1080, 150f, "Display C") // Worst

    // Compare displays
    display1.compareSharpness(display2)
    println()
    display1.compareSize(display3)
    println()
    display2.compareWithMonitor(display3)

    // Create an Assistant and assign displays
    val assistant = Assistant("Beyonce")
    println("__________________")
    assistant.assignDisplay(display1)
    assistant.assignDisplay(display2)
    assistant.assignDisplay(display3)

    // Assistant assists with comparisons
    assistant.assist()

    // Example: Buy a display
    assistant.buyDisplay()

    if (args.isEmpty()) {
        println("Please provide the file path as a command-line argument.")
        return
    }

    val filePath = args[0]
    val fileName = filePath.substringAfterLast("/")

    // Use FileReader to read file content
    val fileReader = FileReader()
    val text = fileReader.readFileIntoString(filePath)

    // Analyze the text using TextData
    val textData = TextData(fileName, text)

    // Print the analysis results
    println(textData)
}

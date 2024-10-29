import java.io.FileReader

fun main(args: Array<String>) {
    // Instantiate three Display objects
    val display1 = Display(3840, 2160, 400f, "Display A") // Best
    val display2 = Display(2560, 1440, 250f, "Display B")
    val display3 = Display(1920, 1080, 150f, "Display C") // Worst

    // Compare displays
    val color = "\u001b[36;1m"
    val reset = "\u001b[0m"
    println(color + "🎉 Task nr.1" + reset)
    display1.compareSharpness(display2)
    println()
    display1.compareSize(display3)
    println()
    display2.compareWithMonitor(display3)

    // Create an Assistant and assign displays
    val assistant = Assistant("Beyonce")
    println("__________________")
    println(color + "🎉 Task nr.2" + reset)
    assistant.assignDisplay(display1)
    assistant.assignDisplay(display2)
    assistant.assignDisplay(display3)

    // Assistant assists with comparisons
    assistant.assist()

    // Example: Buy a display
    assistant.buyDisplay()

    println(color + "🎉 Task nr.3 & 4" + reset)
    if (args.isEmpty()) {
        println("Please provide at least one file path as a command-line argument.")
        return
    }

    // Iterate through each file path provided in args
    for (filePath in args) {
        // Extract the file name from the file path
        val fileName = filePath.substringAfterLast("/")

        // Use FileReader to read file content
        val fileReader = FileReader()
        val text = fileReader.readFileIntoString(filePath)

        // Analyze the text using TextData
        val textData = TextData(fileName, text)

        // Print the analysis results for each file
        println(textData)
    }
}

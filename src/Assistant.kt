class Assistant(private val assistantName: String) {
    private var assignedDisplays: List<Display> = listOf()

    // Adds a Display object to the assignedDisplays list
    fun assignDisplay(display: Display) {
        assignedDisplays = assignedDisplays + display
        println(" Assigned display \"${display.getModel()}\" to assistant \"$assistantName\".")
    }

    // Iterates through the assignedDisplays list, comparing each Display object sequentially
    fun assist() {

        if (assignedDisplays.size < 2) {
            println("Not enough displays assigned for comparison.")
            return
        }

        for (i in 0 until assignedDisplays.size - 1) {
            val currentDisplay = assignedDisplays[i]
            val nextDisplay = assignedDisplays[i + 1]

            println("🔹 Comparison ${i + 1}: ${currentDisplay.getModel()} vs ${nextDisplay.getModel()}")
            println("--------------------------------------------------")
            currentDisplay.compareWithMonitor(nextDisplay)
            println("--------------------------------------------------\n")
        }
    }

    // Removes the best display based on PPI and area
    fun buyDisplay(): Display? {
        // Find the display with the highest PPI, and if tied, select the one with the largest area
        val bestDisplay = assignedDisplays.maxByOrNull { it.getPPI() }?.let { topDisplay ->
            assignedDisplays.filter { it.getPPI() == topDisplay.getPPI() }
                .maxByOrNull { it.getArea() }
        }

        return if (bestDisplay != null) {
            assignedDisplays = assignedDisplays - bestDisplay
            println("🛒 Display \"${bestDisplay.getModel()}\" is bought. It has been removed from assistant \"$assistantName\"'s list.")
            println("Remaining displays: ${assignedDisplays.joinToString(", ") { it.getModel() }}")
            bestDisplay
        } else {
            println("No displays found in assistant \"$assistantName\"'s list.")
            null
        }
    }
}

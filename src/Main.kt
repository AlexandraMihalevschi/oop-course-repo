fun main() {
    // Instantiate three Display objects
    val display1 = Display(1920, 1080, 401f, "Display A")
    val display2 = Display(2560, 1440, 326f, "Display B")
    val display3 = Display(3840, 2160, 531f, "Display C")

    // Compare displays
    display1.compareSharpness(display2)
    println()
    display1.compareSize(display3)
    println()
    display2.compareWithMonitor(display3)
}
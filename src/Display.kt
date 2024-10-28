class Display(
    private val width: Int,
    private val height: Int,
    private val ppi: Float,
    private val model: String
) {

    // Compare sizes based on display size area (width * height)
    fun compareSize(m: Display) {
        val thisArea = this.width * this.height
        val otherArea = m.width * m.height

        println("Comparing ${this.model} with ${m.model} for size:")
        if (thisArea > otherArea) {
            println("${this.model} is larger than ${m.model} with an area of $thisArea vs $otherArea.")
        } else if (thisArea < otherArea) {
            println("${m.model} is larger than ${this.model} with an area of $otherArea vs $thisArea.")
        } else {
            println("${this.model} and ${m.model} have the same size with an area of $thisArea.")
        }
    }

    // Compare sharpness based on PPI
    fun compareSharpness(m: Display) {

        println("Comparing ${this.model} with ${m.model} for sharpness:")
        if (this.ppi > m.ppi) {
            println("${this.model} is sharper than ${m.model} with a PPI of ${this.ppi} vs ${m.ppi}.")
        } else if (this.ppi < m.ppi) {
            println("${m.model} is sharper than ${this.model} with a PPI of ${m.ppi} vs ${this.ppi}.")
        } else {
            println("${this.model} and ${m.model} have the same sharpness with a PPI of ${this.ppi}.")
        }
    }

    // Compare both size and sharpness
    fun compareWithMonitor(m: Display) {
        compareSize(m)
        compareSharpness(m)
    }
}

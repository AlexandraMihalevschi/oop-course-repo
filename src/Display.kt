class Display(
    private val width: Int,
    private val height: Int,
    private val ppi: Float,
    private val model: String  // Keep model private
) {

    // Getter function for model
    fun getModel() = model
    fun getArea(): Int {
        return width * height
    }
    // Getter function for PPI
    fun getPPI() = ppi

    // Compare sizes based on display size area (width * height)
    fun compareSize(m: Display) {
        val thisArea = this.width * this.height
        val otherArea = m.width * m.height

        println("Comparing ${this.getModel()} with ${m.getModel()} for size:")
        if (thisArea > otherArea) {
            println("${this.getModel()} is larger than ${m.getModel()} with an area of $thisArea vs $otherArea.")
        } else if (thisArea < otherArea) {
            println("${m.getModel()} is larger than ${this.getModel()} with an area of $otherArea vs $thisArea.")
        } else {
            println("${this.getModel()} and ${m.getModel()} have the same size with an area of $thisArea.")
        }
    }

    // Compare sharpness based on PPI
    fun compareSharpness(m: Display) {
        println("Comparing ${this.getModel()} with ${m.getModel()} for sharpness:")
        if (this.ppi > m.ppi) {
            println("${this.getModel()} is sharper than ${m.getModel()} with a PPI of ${this.ppi} vs ${m.ppi}.")
        } else if (this.ppi < m.ppi) {
            println("${m.getModel()} is sharper than ${this.getModel()} with a PPI of ${m.ppi} vs ${this.ppi}.")
        } else {
            println("${this.getModel()} and ${m.getModel()} have the same sharpness with a PPI of ${this.ppi}.")
        }
    }

    // Compare both size and sharpness
    fun compareWithMonitor(m: Display) {
        compareSize(m)
        compareSharpness(m)
    }
}

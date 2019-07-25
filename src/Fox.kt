class Fox : Canine(){
    override val image = "fox.jpg"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise(){
        println("Yippp!")
    }
    override fun eat(){
        println("The Fox is eating $food")
    }
}

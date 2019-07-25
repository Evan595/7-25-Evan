class Lion : Feline(){
    override val image = "lion.jpg"
    override val food = "meat"
    override val habitat = "safari"
    override fun makeNoise(){
        println("Rowrrrrrrr!")
    }
    override fun eat(){
        println("The Lion is eating $food")
    }
}

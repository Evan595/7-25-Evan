class Cheetah : Feline(){
    override val image = "cheetah.jpg"
    override val food = "meat"
    override val habitat = "safari"
    override fun makeNoise(){
        println("purrrr!")
    }
    override fun eat(){
        println("The Cheetah is eating $food")
    }
}

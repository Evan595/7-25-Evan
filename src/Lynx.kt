class Lynx : Feline(){
    override val image = "lynx.jpg"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise(){
        println("purrrr!")
    }
    override fun eat(){
        println("The Lynx is eating $food")
    }
}

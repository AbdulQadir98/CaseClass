object Points extends App{
    val p1=Point(1,1)
    val p2=Point(2,1)

    val p3=p1.move(2,3)
    val p4=p1+p2

    println(p3)
    println(p4)
    println(p1.distance(p2))
    println(p2.invert())

}

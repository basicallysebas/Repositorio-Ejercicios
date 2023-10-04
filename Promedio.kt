
fun promedio(){
    print("Inserta tu primera calificación (con punto decimal): ")
    var primeraCalif : Float = readln().toFloat()
    print("\nInserta tu segunda calificación (con punto decimal): ")
    var segundaCalif : Float = readln().toFloat()
    print("\nInserta tu tercera calificación (con punto decimal): ")
    var terceraCalif : Float = readln().toFloat()

    var promedio : Float = (primeraCalif+segundaCalif+terceraCalif)/3f
    var parteDecimal : Float = promedio - promedio.toInt()
    var primerDecimal : Int = (parteDecimal * 10).toInt()

    if(promedio>=6.0){
        println("\n¡Aprobaste! Tu calificación es: $promedio")
        if(primerDecimal>=5){
            var redondeo : Int = (promedio.toInt())+1
            println("\nTu calificación redondeada es: $redondeo")
        } else {
            println("\nTu calificación redondeada es: ${promedio.toInt()}")
        }
    } else {
        println("\nReprobado, ni modo")
    }
}




fun promedio(x1: Double=8.0, y1: Double=8.0,z1: Double): Double {
    return (x1+y1+z1)/3
}



fun main() {
    println(promedio(z1=5.0))
}
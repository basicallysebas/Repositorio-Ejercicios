const val a=5
const val b=2
const val c=3
fun main() {
    if(a==b && b==c){
print("Equilatero")
}
else if (a!=b && b!=c && c!=a){
print("Escaleno")
}
else{
print("isosceles")
}
}

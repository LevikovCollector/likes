fun main(){
    val likes = 21
    var text = ""

    if(likes % 10 == 1 && likes % 100 != 11){
        text = "человеку"
    }else {
        text ="людям"
    }
    println("Понравилось $likes $text")
}
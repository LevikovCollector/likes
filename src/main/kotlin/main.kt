fun main(){
    val likes = 0
    var text = ""

    if(likes % 10 == 1){
        text = "человеку"
    }else {
        text ="людям"
    }
    println("Понравилось $likes $text")
}
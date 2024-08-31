package Task3

fun main (){
    val time = 12;
    when(time){
        in 0..5  -> println("Раннее утро")
        in 6..11 -> println("Утро")
        in 12..16 -> println("День")
        in 16..21 -> println("Вечер")
        in 21..23 -> println("Ночь")
    }
}
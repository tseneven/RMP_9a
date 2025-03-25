package prakt9a

open class Moloch constructor(
    val name: String,
    val ves: Int,
    val zhirnost: Int,
    val proizvoditel: String,
    var price: Int,
) {

    //Функция для получения информации о продукте
    fun getInfo(){
        println("Название $name")
        println("Вес $ves")
        println("Жирность $zhirnost")
        println("Производитель $proizvoditel")
        println("Цена $price")
    }

    //Функция для получения цены за кг
    fun priceInKg(){

        price = (price * 1000) / ves
        println("Цена за кг $price")
    }

    //Функция для получения информации о жирности
    fun massZhira(){
        var mass = (zhirnost / 100) * ves
        println("Масса жира $mass")
    }

}
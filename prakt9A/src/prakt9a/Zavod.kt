package prakt9a

class Zavod(
    name: String,
    ves: Int,
    zhirnost: Int,
    proizvoditel: String,
    price: Int,
    var kolvoProd: Int,
    var kolvoTovara: Int,
    var adres: String
) : Moloch(name, ves, zhirnost, proizvoditel, price) {

    //Функция для получения информации о заводе
    fun getZavodInfo() {
        println("Количество произведённых товаров: $kolvoProd")
        println("Количество товаров на складе: $kolvoTovara")
        println("Адрес завода: $adres")
    }

}


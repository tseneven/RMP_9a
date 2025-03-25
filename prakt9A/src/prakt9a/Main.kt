package prakt9a

fun main(){

    //Объект 1
    val moloch1 = Moloch(
        name = "Сыр",
        ves = 100,
        zhirnost = 15,
        proizvoditel = "Челябинский Молочный Завод",
        price = 150,

    )

    //Объект 2
    val moloch2 = Moloch(
        name = "Молоко",
        ves = 1000,
        zhirnost = 10,
        proizvoditel = "Челябинский Молочный Завод",
        price = 100,
    )

    //Объект 3
    val moloch3 = Moloch(
        name = "Сливки",
        ves = 500,
        zhirnost = 30,
        proizvoditel = "Челябинский Молочный Завод",
        price = 300,
    )

    //Объект наследника класса Moloch
    val zavod = Zavod(
        name = "Йогурт",
        ves = 200,
        zhirnost = 8,
        proizvoditel = "Челябинский Молочный Завод",
        price = 120,
        kolvoProd = 5000,
        kolvoTovara = 2000,
        adres = "г. Челябинск, ул. Молочная, д. 5"
    )

    println("\n--- Информация о молочных продуктах ---")
    moloch1.getInfo()
    moloch1.priceInKg()
    moloch1.massZhira()

    moloch2.getInfo()
    moloch2.priceInKg()
    moloch2.massZhira()

    moloch3.getInfo()
    moloch3.priceInKg()
    moloch3.massZhira()

    println("\n--- Информация о заводе ---")
    zavod.getZavodInfo()

}
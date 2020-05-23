package saw.com.coderswag.Services

import saw.com.coderswag.Model.Category
import saw.com.coderswag.Model.Product

object DataService {
 val categories = listOf(
     Category("SHIRTS", "shirtimage"),
     Category("HOODIES","hoodieimage"),
     Category("HATS","hatimage"),
     Category("DIGITAL","digitalgoodsimage"),
     Category("SHIRTS", "shirtimage"),
    Category("HODDIES","hoodieimage"),
    Category("HATS","hatimage"),
    Category("DIGITAL","digitalgoodsimage"),
    Category("SHIRTS", "shirtimage"),
    Category("HODDIES","hoodieimage"),
    Category("HATS","hatimage"),
    Category("DIGITAL","digitalgoodsimage")
 )
    val hats = listOf(
        Product("Develops Graphic Beanie","$18","hat1"),
        Product("Develops Hat Black","$20","hat2"),
        Product("Develops Hat White","$18","hat3"),
        Product("Develops Hat Snapback","$22","hat4")
    )

    val hoodies = listOf(
        Product("Develops Hoodie Gray","$28","hoodie1"),
        Product("Develops Hoodie Red","$32","hoodie2"),
        Product("Develops Gray Hoodie","$28","hoodie3"),
        Product("Develops Black Hoodie","$32","hoodie4")
    )

    val shirts = listOf(
        Product("Develops Shirt Black","$18","shirt1"),
        Product("Develops Badge Light Gray","$20","shirt2"),
        Product("Develops Logo Shirt Red","$22","shirt3"),
        Product("Develops Hustle","$22","shirt4"),
        Product("Kickflip Studios","$18","shirt5")
        )

    var digitalGood = listOf<Product>()

    fun getProducts(category: String): List<Product>{
        when(category){
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return  digitalGood
        }

    }

}
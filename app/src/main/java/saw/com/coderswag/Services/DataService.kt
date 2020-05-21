package saw.com.coderswag.Services

import saw.com.coderswag.Model.Category
import saw.com.coderswag.Model.Product

object DataService {
 val categories = listOf(
     Category("SHIRTS", "shirtimage"),
     Category("HODDIES","hoddieimage"),
     Category("HATS","hatimage"),
     Category("DIGITAL","digitalgoodsimage")
 )
    val hats = listOf(
        Product("Develops Graphic Beanie","$18","hat01"),
        Product("Develops Hat Black","$20","hat02"),
        Product("Develops Hat White","$18","hat03"),
        Product("Develops Hat Snapback","$22","hat04")
    )

    val hoddies = listOf(
        Product("Develops Hoddie Gray","$28","hoddie01"),
        Product("Develops Hoddie Red","$32","hoddie02"),
        Product("Develops Gray Hoddie","$28","hoddie03"),
        Product("Develops Black Hoddie","$32","hoddie04")
    )

    val shirts = listOf(
        Product("Develops Shirt Black","$18","shirt01"),
        Product("Develops Badge Light Gray","$20","shirt02"),
        Product("Develops Logo Shirt Red","$22","shirt03"),
        Product("Develops Hustle","$22","shirt04"),
        Product("Kickflip Studios","$18","shirt05")
        )
}
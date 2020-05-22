package saw.com.coderswag.Services

import saw.com.coderswag.Model.Category
import saw.com.coderswag.Model.Product

object DataService {
 val categories = listOf(
     Category("SHIRTS", "shirtimage"),
     Category("HODDIES","hoodieimage"),
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
        Product("Develops Graphic Beanie","$18","hat01"),
        Product("Develops Hat Black","$20","hat02"),
        Product("Develops Hat White","$18","hat03"),
        Product("Develops Hat Snapback","$22","hat04")
    )

    val hoddies = listOf(
        Product("Develops Hoodie Gray","$28","hoodie01"),
        Product("Develops Hoodie Red","$32","hoodie02"),
        Product("Develops Gray Hoodie","$28","hoodie03"),
        Product("Develops Black Hoodie","$32","hoodie04")
    )

    val shirts = listOf(
        Product("Develops Shirt Black","$18","shirt01"),
        Product("Develops Badge Light Gray","$20","shirt02"),
        Product("Develops Logo Shirt Red","$22","shirt03"),
        Product("Develops Hustle","$22","shirt04"),
        Product("Kickflip Studios","$18","shirt05")
        )
}
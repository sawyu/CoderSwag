package saw.com.coderswag.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_products.*
import saw.com.coderswag.Adapters.ProductsAdapter
import saw.com.coderswag.R
import saw.com.coderswag.Services.DataService
import saw.com.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this,DataService.getProducts(categoryType))
        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        var  screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720){
            spanCount = 3
        }
        val layoutManager = GridLayoutManager(this,spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}
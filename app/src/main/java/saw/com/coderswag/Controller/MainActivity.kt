package saw.com.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import saw.com.coderswag.Adapters.CategoryAdapter
import saw.com.coderswag.Adapters.CategoryRecyleAdapter
import saw.com.coderswag.Model.Category
import saw.com.coderswag.R
import saw.com.coderswag.Services.DataService
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
        val layoutManager  = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

           /* categoryListView.setOnItemClickListener {adapterView, View, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }*/
    }
}
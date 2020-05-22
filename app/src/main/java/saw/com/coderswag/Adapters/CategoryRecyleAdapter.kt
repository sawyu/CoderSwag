package saw.com.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.category_list_item.view.*
import saw.com.coderswag.Model.Category
import saw.com.coderswag.R

class CategoryRecyleAdapter(val context: Context, val categories: List<Category>): RecyclerView.Adapter<CategoryRecyleAdapter.Holder>() {
    inner class Holder(itemview: View?) : RecyclerView.ViewHolder(itemview!!){
        val categoryImage = itemview?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemview?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false )
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position], context)
    }
}
package com.asyabab.endora.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.asyabab.endora.R
import com.asyabab.endora.data.models.payment.getpembelian.Order
import com.asyabab.endora.data.models.payment.getpembelian.Order__
import com.asyabab.endora.data.models.payment.getpembelian.Order___
import com.bumptech.glide.Glide

class RecyclerViewKomplainAdapter internal constructor(
    var context: Context,
    private val subItemList: List<Order___>
) : RecyclerView.Adapter<RecyclerViewKomplainAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.rv_gambarbarangmini, null)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val subItem =
            subItemList[position]
        holder.txthape.text = subItem.item!!.name
        Glide.with(context)
            .load(subItem.item!!.images!![0].name)
            .into(holder.imghape)
    }

    override fun getItemCount(): Int {
        return subItemList.size
    }

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var txthape: TextView
        var imghape: ImageView

        init {
            txthape = itemView.findViewById<View>(R.id.textgambar) as TextView
            imghape =
                itemView.findViewById<View>(R.id.tvGambarBarang) as ImageView
        }
    }

}
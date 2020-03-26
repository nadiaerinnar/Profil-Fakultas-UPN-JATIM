package com.example.profilfakultasupn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_profil_detail.view.*
import kotlinx.android.synthetic.main.contact_list_item.view.*
import kotlinx.android.synthetic.main.contact_list_item.view.img_poster

class ProfilAdapter(
    private val phoneItemList: List<ProfilData>,
    private val clickListener: (ProfilData) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.contact_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(phoneItemList[position], clickListener)
    }

    override fun getItemCount() = phoneItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(phone: ProfilData, clickListener: (ProfilData) -> Unit) {

            //Glide.with(itemView).load(phone.poster).into(itemView.img_poster)
            phone.poster?.let { itemView.img_poster.setImageResource(it) }
            itemView.tv_part_item_name.text = phone.fakultas
            //itemView.tv_part_id.text = phone.jurusan
           // itemView.tv_data_profil.text = phone.profil

            itemView.setOnClickListener { clickListener(phone) }
        }
    }
}

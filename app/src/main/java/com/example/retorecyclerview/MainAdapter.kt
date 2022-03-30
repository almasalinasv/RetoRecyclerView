package com.example.retorecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retorecyclerview.databinding.ItemCardBinding
import org.json.JSONObject

class MainAdapter(private val clothes: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(clothes[position])
    }

    override fun getItemCount(): Int = clothes.size

            class MainHolder(val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root) {

                fun render(items: JSONObject) {
                    binding.tvNombre.setText(items.getString("nombre"))
                    binding.tvDescuento.setText(items.getString("descuento"))
                    binding.tvPrecio.setText(items.getString("precio"))
                    binding.ivItem.setImageResource(R.drawable.image_placeholder)
                }
            }
        }

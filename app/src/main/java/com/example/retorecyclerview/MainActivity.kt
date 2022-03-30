package com.example.retorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retorecyclerview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    val fakeClothesData: Array<JSONObject> = arrayOf(
        JSONObject("{\"nombre\": \"Vestido floral de Pecho fruncido\", \"descuento\": \"Sale\n\", \"precio\": \"$159.00\"}"),
        JSONObject("{\"nombre\": \"Vestido ajustado de lunares\", \"descuento\": \"-5%\n\", \"precio\": \"$260.00\"}"),
        JSONObject("{\"nombre\": \"Vestido de rayas con parche\", \"descuento\": \"-4%\n\", \"precio\": \"$154.00\"}"),
        JSONObject("{\"nombre\": \"Vestido de tirantes con estampado\", \"descuento\": \"-18%\n\", \"precio\": \"$242.00\"}"),
    )
    binding.rvClothes.adapter = MainAdapter(fakeClothesData)
}
}
package com.andryprasetia.jenishewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.andryprasetia.jenishewan.adapter.AdapterHewan
import com.andryprasetia.jenishewan.databinding.ActivityMainBinding
import com.andryprasetia.jenishewan.model.Hewan

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listHewan = ArrayList<Hewan>()
        listHewan.add(Hewan("Rubah",R.drawable.rubah,"Karnivora","Vivipar"))
        listHewan.add(Hewan("Singa",R.drawable.singa,"Karnivora","Vivipar"))
        listHewan.add(Hewan("Kelinci",R.drawable.kelinci,"Herbivora","Vivipar"))
        listHewan.add(Hewan("Beruang",R.drawable.beruang,"Karnivora","Vivipar"))
        listHewan.add(Hewan("Anjing",R.drawable.anjing,"Karnivora","Vivipar"))

        binding.list.adapter = AdapterHewan(this,listHewan,object :AdapterHewan.OnClickListener {
            override fun detailData(item: Hewan?) {
                TODO("Not yet implemented")
            }

        })

    }
}
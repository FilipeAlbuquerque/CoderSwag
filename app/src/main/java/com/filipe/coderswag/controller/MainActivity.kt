package com.filipe.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.filipe.coderswag.R
import com.filipe.coderswag.model.Category
import com.filipe.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Iniciar o adapter
        //Precisa do contexto, tipo da lista, objeto a ser mostrado na lista
        adapter = ArrayAdapter(this,
        android.R.layout.simple_list_item_1,
            DataService.categories)

        categoryListView.adapter = adapter

    }
}

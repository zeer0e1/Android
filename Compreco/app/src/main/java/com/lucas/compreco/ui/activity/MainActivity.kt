package com.lucas.compreco.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.lucas.compreco.R
import com.lucas.compreco.dao.TarefasDAO
import com.lucas.compreco.ui.recyclerview.adapter.ListaTarefasAdapter



class MainActivity: AppCompatActivity(R.layout.activity_main) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()

        val recyclerView =  findViewById<RecyclerView>(R.id.recyclerView)

        Log.i("MainActi", "onCreate: ${TarefasDAO.buscaTodos()}")

        recyclerView.adapter = ListaTarefasAdapter(context = this, tarefas =  TarefasDAO.buscaTodos() )

        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        fab.setOnClickListener{
            val intent = Intent(this, FormTarefaActivity::class.java)
            startActivity(intent)
        }
    }


}
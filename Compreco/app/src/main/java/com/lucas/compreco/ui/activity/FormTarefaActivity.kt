package com.lucas.compreco.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.lucas.compreco.R
import com.lucas.compreco.dao.TarefasDAO
import com.lucas.compreco.modelo.Tarefa

class FormTarefaActivity : AppCompatActivity(
    R.layout.activity_form_tarefa

) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val btSalvar = findViewById<Button>(R.id.bt_salvar)

        btSalvar.setOnClickListener {
            val campoDescricao = findViewById<EditText>(R.id.tarefa_descricao)
            val descricao = campoDescricao.text.toString()
            val novaTarefa = Tarefa(descricao = descricao)
            Log.i("FormAcitivy", "onCreate:$novaTarefa ")

            TarefasDAO.add(novaTarefa)
            Log.i("FormAcitivy", "onCreate:${TarefasDAO.buscaTodos()} ")
            finish()

        }

    }
}
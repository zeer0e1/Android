package com.lucas.compreco.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lucas.compreco.R
import com.lucas.compreco.modelo.Tarefa

class ListaTarefasAdapter(
    private  val context: Context,
    private  val tarefas: List<Tarefa>

) : RecyclerView.Adapter<ListaTarefasAdapter.ViewHolder>() {
    class ViewHolder (view: View): RecyclerView.ViewHolder(view) {
        fun vincula(tarefa: Tarefa) {
            val terafaDescricao = itemView.findViewById<TextView>(R.id.tarefa_descricao)
            terafaDescricao.text = tarefa.descricao

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.tarefa, parent, false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int = tarefas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tarefa = tarefas[position]
        holder.vincula(tarefa)
    }

}

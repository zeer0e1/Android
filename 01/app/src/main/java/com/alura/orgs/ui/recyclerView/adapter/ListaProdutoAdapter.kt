package com.alura.orgs.ui.recyclerView.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alura.orgs.modelo.Produto

class ListaProdutoAdapter (
    private  val produtos: List<Produto>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int  = produtos.size
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}

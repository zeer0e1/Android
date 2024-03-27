package com.lucas.compreco.dao

import com.lucas.compreco.modelo.Tarefa

object TarefasDAO {
    private val tarefas = mutableListOf<Tarefa>()

    fun add(tarefa: Tarefa) {
        tarefas.add(tarefa)
    }

    fun buscaTodos(): List<Tarefa> {
        return tarefas.toList()
    }
}

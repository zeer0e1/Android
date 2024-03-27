package com.alura.orgs.ui.activity

import com.alura.orgs.dao.ProdutosDao
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.alura.orgs.R
import com.alura.orgs.modelo.Produto
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity(R.layout.activity_formulario_produto) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_produto)
        val botaoSalvar = findViewById<Button>(R.id.salvar)

        botaoSalvar.setOnClickListener {
            val campoNome = findViewById<EditText>(R.id.nome)
            val nome = campoNome.text.toString()

            val campoDesc = findViewById<EditText>(R.id.descricao)
            val descricao = campoDesc.text.toString()

            val campoValor = findViewById<EditText>(R.id.preco)
            val valorEmTexto = campoValor.text.toString()
            val valor = if (valorEmTexto.isBlank()) {
                BigDecimal.ZERO
            } else {
                BigDecimal(valorEmTexto)
            }

            val novoProduto = Produto(
                nome = nome,
                descricao = descricao,
                valor = valor

            )

            Log.i("FormularioProduto", "onCreate: $novoProduto")
            val dao = ProdutosDao()
            dao.adiciona(novoProduto)
            Log.i("FormularioProduto", "onCreate: ${dao.buscaTodos()}")
            finish()


        }

    }


}
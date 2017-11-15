package com.brunocarvalho.shoppinglist.view

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.EditText
import android.widget.Toast
import com.brunocarvalho.shoppinglist.R
import com.brunocarvalho.shoppinglist.control.CompraRegra



class Compra : AppCompatActivity() {

    lateinit var editDescricao     : EditText
    lateinit var toolbar           : Toolbar
    lateinit var fab               : FloatingActionButton
    lateinit var regras            : CompraRegra

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compra)
        init()
        loadControls()
    }

    private fun loadControls() {
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            if(regras.salvar(editDescricao.text.toString()))
                Toast.makeText(this, editDescricao.text.toString() + " - Salvo com Sucesso!!!", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, editDescricao.text.toString() + " - Erro ao salvar Compra!!!", Toast.LENGTH_LONG).show()

            finish()
        }
    }

    private fun init(){
        regras          = CompraRegra(this)
        toolbar         = findViewById(R.id.toolbar) as Toolbar
        fab             = findViewById(R.id.fab) as FloatingActionButton
        editDescricao   = findViewById(R.id.compra_editDescricao) as EditText
    }
}

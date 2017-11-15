package com.brunocarvalho.shoppinglist.dao

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by BrunoCarvalho on 15/11/2017.
 */

val BANCO_DADOS : String = "ShoppingList"
val VERSAO : Int = 1

class DataBaseHelper(context: Context?) : SQLiteOpenHelper(context, BANCO_DADOS, null, VERSAO) {

    override fun onCreate(db: SQLiteDatabase?) {
        tableCompra(db)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun tableCompra(db: SQLiteDatabase?){
        var sbQuery : StringBuilder = StringBuilder()
        sbQuery.append(" CREATE TABLE COMPRAS ")
        sbQuery.append(" (_id INTEGER PRIMARY KEY, ")
        sbQuery.append(" DESCRICAO VARCHAR(50)); ")
        db!!.execSQL(sbQuery.toString())
    }

}
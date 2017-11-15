package com.brunocarvalho.shoppinglist.control

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.brunocarvalho.shoppinglist.dao.DataBaseHelper


/**
 * Created by BrunoCarvalho on 15/11/2017.
 */
class CompraRegra(context: Context?){

    var helper : DataBaseHelper = DataBaseHelper(context)


    fun salvar(descricao : String?) : Boolean {
        var db : SQLiteDatabase = helper.writableDatabase
        var values : ContentValues = ContentValues()

        values.put("DESCRICAO", descricao)

        var result : Long = db.insert("COMPRAS", null, values)

        if (result != -1L) return true else return false
    }


}
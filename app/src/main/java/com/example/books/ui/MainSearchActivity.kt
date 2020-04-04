package com.example.books.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.books.R
import kotlinx.android.synthetic.main.main_search.*

class MainSearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_search)

        val book = bookToSearch.text
        //val teste: String = book.toString()

        fun chamarTela(){
            val intent = Intent(this, MainActivity::class.java)
            val bundle = Bundle().apply {
                putString("busca", book.toString())
                putInt("frgToLoad", 0)
            }
                intent.putExtras(bundle)
                startActivity(intent)
        }



        buttonSearch.setOnClickListener{
            if (book.isNullOrEmpty()) {
                Toast.makeText(this, "O nome do livro ou palavra-chave devem ser informados.", Toast.LENGTH_LONG)
                    .show()
            } else{
                Log.i("Teste", "Termo buscado: $book")
                Log.i("Teste", "The first step is working... aparently")
                chamarTela()
            }


            }
        buttonTeste.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            val bundle = Bundle().apply {
                putString("busca", "Android")
                putInt("frgToLoad", 1)
            }
            intent.putExtras(bundle)
            startActivity(intent)


        }
        }
    }

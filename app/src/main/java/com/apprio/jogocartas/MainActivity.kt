package com.apprio.jogocartas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    fun Int.random(): Int = Random().nextInt(this)

    private var lista: MutableList<Int> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()

        lista.add(R.drawable.`as`)
        lista.add(R.drawable.caveira)
        creaateCard()
    }


    fun setListener() {

        btnConfirmar.setOnClickListener(this)
        imageView1.setOnClickListener(this)
        imageView2.setOnClickListener(this)
        imageView3.setOnClickListener(this)

    }


    fun creaateCard() {
        var confirmImageView = true

        if (confirmImageView == true){


            imageView1.setOnClickListener {
                val rond = lista[Random().nextInt(2)]

                btnConfirmar.setOnClickListener {
                    confirmImageView = false
                    imageView1.setImageResource(rond)
                    imageView2.setImageResource(R.drawable.costas)
                    imageView3.setImageResource(R.drawable.costas)

                    veriFicaGanhador(rond, it)
                    btnReiniciar.setOnClickListener {
                        imageView1.setImageResource(R.drawable.costas)
                        imageView2.setImageResource(R.drawable.costas)
                        imageView3.setImageResource(R.drawable.costas)

                        textViewResposta.setVisibility(View.INVISIBLE);

                        confirmImageView = true
                    }

                }


            }
        }
        if (confirmImageView == true){


            imageView2.setOnClickListener {
                val rond = lista[Random().nextInt(2)]

                btnConfirmar.setOnClickListener {
                    confirmImageView = false
                    imageView2.setImageResource(rond)
                    imageView1.setImageResource(R.drawable.costas)
                    imageView3.setImageResource(R.drawable.costas)

                    veriFicaGanhador(rond, it)
                    btnReiniciar.setOnClickListener {
                        imageView1.setImageResource(R.drawable.costas)
                        imageView2.setImageResource(R.drawable.costas)
                        imageView3.setImageResource(R.drawable.costas)
                        textViewResposta.setVisibility(View.INVISIBLE);
                        confirmImageView = true
                    }

                }


            }
        }
        if (confirmImageView == true){


            imageView3.setOnClickListener {
                val rond = lista[Random().nextInt(2)]

                btnConfirmar.setOnClickListener {
                    confirmImageView = false
                    imageView3.setImageResource(rond)
                    imageView2.setImageResource(R.drawable.costas)
                    imageView1.setImageResource(R.drawable.costas)

                    veriFicaGanhador(rond, it)
                    btnReiniciar.setOnClickListener {
                        imageView1.setImageResource(R.drawable.costas)
                        imageView2.setImageResource(R.drawable.costas)
                        imageView3.setImageResource(R.drawable.costas)
                        textViewResposta.setVisibility(View.INVISIBLE);
                        confirmImageView = true
                    }

                }


            }
        }
    }


    fun veriFicaGanhador(rond: Int, it: View) {


        if (rond == R.drawable.caveira) {
            textViewResposta.text = "Você Perdeu"
            //textViewResposta.setTextColor(resources.getColor(R.color.colorAccent))
            // Toast.makeText(this, "Você Perdeu", Toast.LENGTH_LONG).show()
            textViewResposta.visibility = it.visibility
        } else {
            // Toast.makeText(this, "Você Ganhou", Toast.LENGTH_LONG).show()
            textViewResposta.text = "Você Ganhou"
           // textViewResposta.setTextColor(resources.getColor(R.color.colorAccent))
            textViewResposta.visibility = it.visibility
        }
    }


    override fun onClick(view: View) {


    }


}

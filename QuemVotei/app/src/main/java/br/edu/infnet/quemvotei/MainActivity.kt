package br.edu.infnet.quemvotei

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    val TAG = "Quem votei"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAvancar = findViewById<Button>(R.id.btn_avancar)

        Log.d(TAG, "Entou no onCreate")

        btnAvancar.setOnClickListener {
            val usuarioText = findViewById<TextView>(R.id.idade_text)
            val idade = usuarioText.text.toString()

            val status = deveVotar(idade.toInt())

            if (status == PROIBIDO) {
                Toast.makeText(this, "Você não pode usar esse app ainda!", Toast.LENGTH_LONG).show()
            }

            else {
                // Cria uma Intent
                val CadastroIntent = Intent(this,
                    CadastroActivity::class.java)

                CadastroIntent.putExtra("idade", idade)
                // Solicita o início de uma nova Activity
                startActivity(CadastroIntent)
            }

        }
    }









    override fun onStart() {
        super.onStart()
        Log.d(TAG , "Entrou onStart")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG , "Entrou onRestart")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG , "Entrou onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG , "Entrou onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG , "Entrou onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG , "Entrou onDestroy")
    }

}

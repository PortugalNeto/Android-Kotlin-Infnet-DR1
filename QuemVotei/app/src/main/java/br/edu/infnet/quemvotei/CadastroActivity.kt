package br.edu.infnet.quemvotei

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        var idade = findViewById<TextView>(R.id.lblIdade).toString()

        idade = intent.getStringExtra(idade).toString().plus(" anos")

        val btnCadastrar = findViewById<Button>(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener(){

            val nome = findViewById<TextView>(R.id.edtNome).toString()
            val cidade = findViewById<TextView>(R.id.edtCidade).toString()

            val profileIntent = Intent(this,
                ProfileActivity::class.java)
            profileIntent.putExtra("nome", nome)
            profileIntent.putExtra("cidade", cidade)
            profileIntent.putExtra("idade", idade)

            startActivity(profileIntent)
        }

    }
}
package br.edu.infnet.quemvotei

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var idade = findViewById<TextView>(R.id.lblIdadePerfil).toString()
        idade = intent.getStringExtra(idade).toString()

        var nome = findViewById<TextView>(R.id.lblNomePerfil).toString()
        nome = intent.getStringExtra(nome).toString()

        var cidade = findViewById<TextView>(R.id.lblCidadePerfil).toString()
        cidade = intent.getStringExtra(cidade).toString()

    }
}
package br.edu.infnet.quemvotei

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var lblIdadePerfil = findViewById<TextView>(R.id.lblIdadePerfil)
        lblIdadePerfil.text = intent.getStringExtra("idade").toString().plus(" anos")

        var lblNomePerfil = findViewById<TextView>(R.id.lblNomePerfil)
        lblNomePerfil.text = intent.getStringExtra("nome").toString()

        var lblCidadePerfil = findViewById<TextView>(R.id.lblCidadePerfil)
        lblCidadePerfil.text = intent.getStringExtra("cidade").toString()

    }
}
package com.mobildersi.kotlinkodtasarimbaglantisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtSonuc:TextView
    lateinit var btnHesapla: Button
    lateinit var btnMesaj:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtSonuc=findViewById(R.id.textView)
        btnHesapla=findViewById(R.id.button)
        btnMesaj=findViewById(R.id.button2)

        btnMesaj.setOnClickListener(){
            txtSonuc.text="butona tıklandı"
        }
    }

    fun hesapla(view: View){
       toplama(10,20)
    }

    fun toplama(x:Int,y:Int){
        var sonuc=x+y
        txtSonuc.text="Sonuc : ${sonuc}"
    }
}
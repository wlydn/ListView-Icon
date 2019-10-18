package com.example.project_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Ruby",     "Ruby adalah bahasa pemrograman open-source dan berorientasi objek sepenuhnya", R.mipmap.ruby))
        list.add(Model("Rails",     "Ruby dalam Rails adalah kerangka pengembangan aplikasi web sisi server yang ditulis dalam bahasa Ruby", R.mipmap.rails))
        list.add(Model("Python",       "Python ditafsirkan scripting dan bahasa pemrograman berorientasi objek", R.mipmap.py))
        list.add(Model("Java Script",        "JavaScript adalah bahasa scripting berbasis objek", R.mipmap.js))
        list.add(Model("PHP",        "PHP adalah bahasa yang diartikan, yaitu tidak perlu untuk kompilasi", R.mipmap.php))

        listView.adapter = MyListAdapter(this,R.layout.row,list)
        listView.setOnItemClickListener{parent,view,position,id ->
            if (position==0){
                Toast.makeText(this@MainActivity,"Ruby", Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity,"Rails", Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity,"Python", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity,"Java Script", Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity,"PHP", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

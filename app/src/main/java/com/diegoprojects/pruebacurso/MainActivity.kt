package com.diegoprojects.pruebacurso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity(),View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();

    }
    fun init(){
        var bgapp:ImageView?= null
        var clover:ImageView?= null
        var textsplash: LinearLayout? = null
        var texthome:LinearLayout? = null
        var menus:LinearLayout? = null
        var frombottom: Animation? = null
        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        bgapp = findViewById(R.id.bgapp)as ImageView
        clover = findViewById(R.id.clover)as ImageView;
        textsplash = findViewById(R.id.textsplash) as LinearLayout;
        texthome = findViewById(R.id.texthome) as LinearLayout;
        menus = findViewById(R.id.menus);
        bgapp!!.animate().translationY(-1900f).setDuration(1000).setStartDelay(300);
        clover!!.animate().alpha(0f).setDuration(800).setStartDelay(600);
        textsplash!!.animate().translationY(140f).alpha(0f).setDuration(800).setStartDelay(300);
        texthome!!.startAnimation(frombottom);
        menus!!.startAnimation(frombottom);
    }
    override fun onClick(v: View?) {
        var intent:Intent?=null
        when(v!!.id){
            R.id.imgCode->{
                intent=Intent(this,  codeActivity::class.java)
                startActivity(intent)
            }
            R.id.imgProgram->{
                intent=Intent(this,  programActivity::class.java)
                startActivity(intent)
            }
            R.id.imgWeb->{
                intent=Intent(this,  githubActivity::class.java)
                startActivity(intent)
            }
        }
    }

}


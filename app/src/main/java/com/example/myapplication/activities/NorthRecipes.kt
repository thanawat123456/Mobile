package com.example.myapplication.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.myapplication.R
import java.util.ArrayList

class NorthRecipes : AppCompatActivity() {
    var slideModelList: MutableList<SlideModel>? = null
    var imageSlider: ImageSlider? = null
    var bcen: Button? = null
    var bisan: Button? = null
    var bnorth: Button? = null
    var bsouth: Button? = null
    override fun onBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask()
        }
        finishAffinity()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_north_recipes)
        imageSlider = findViewById<View>(R.id.image_slider) as ImageSlider
        addImage()
        bcen = findViewById(R.id.btncen) as Button
        bisan = findViewById(R.id.isan) as Button
        bsouth = findViewById(R.id.south) as Button
        bnorth = findViewById(R.id.north) as Button

        bcen!!.setOnClickListener{
            var intent = Intent(this,CentralRecipes::class.java)
            startActivity(intent)
        }
        bisan!!.setOnClickListener{
            var intent = Intent(this,IsanRecipes::class.java)
            startActivity(intent)
        }
        bnorth!!.setOnClickListener{
            var intent = Intent(this,NorthRecipes::class.java)
            startActivity(intent)
        }
        bsouth!!.setOnClickListener{
            var intent = Intent(this,SouthRecipes::class.java)
            startActivity(intent)
        }

    }

    fun addImage() {
        slideModelList = ArrayList()
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.d1, "????????????????????????????????????????????????", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.d2, "??????????????????????????????????????????????????????????????????", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.d3, "??????????????????", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.d4, "????????????????????????", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.d5, "??????????????????????????????????????????", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.d6, "?????????????????????????????????????????????", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.d7, "???????????????????????????", ScaleTypes.CENTER_CROP))
        imageSlider!!.setImageList(slideModelList as ArrayList<SlideModel>, ScaleTypes.FIT)
    }

    fun ViewAll(view: View) {
        val intent = Intent(this@NorthRecipes, MainActivity::class.java)
        when (view.id) {
            R.id.btnall -> intent.putExtra("condition", 4)
        }
        startActivity(intent)
    }
}

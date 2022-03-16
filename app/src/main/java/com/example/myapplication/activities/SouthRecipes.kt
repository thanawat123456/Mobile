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

class SouthRecipes : AppCompatActivity() {
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
        setContentView(R.layout.activity_sorth_repes)
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
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.c1, "สปลาทรายทอดขมิ้น", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.c2, "แกงคั่วหอยแครงใส่ใบพลู", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.c3, "ข้าวยำ", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.c4, "แกงไตปลา", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.c5, "ขนมจีนน้ำยาใต้", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.c6, "ผักเหลียงผัดไข่", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.c7, "แกงเหลือง", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.c8, "สะตอผัดกะปิกุ้งสด", ScaleTypes.CENTER_CROP))
        imageSlider!!.setImageList(slideModelList as ArrayList<SlideModel>, ScaleTypes.FIT)
    }

    fun ViewAll(view: View) {
        val intent = Intent(this@SouthRecipes, MainActivity::class.java)
        when (view.id) {
            R.id.btnall -> intent.putExtra("condition", 3)
        }
        startActivity(intent)
    }
}

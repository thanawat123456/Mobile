package com.example.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.GridView
import com.example.myapplication.adapter.CustomAdapter
import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import com.example.myapplication.model.Constant
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var condition = 0

    var gridView: GridView? = null
    var customAdapter: CustomAdapter? = null
    var constantList: MutableList<Constant>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridView = findViewById<View>(R.id.gridView) as GridView
        constantList = ArrayList()
        intent = getIntent()
        condition = intent.getIntExtra("condition", 0)
        if (condition == 1) {
            centralRecipes()
        } else if (condition == 2) {
            isanRecipes()
        } else if (condition == 3) {
            SouthwestRecipes()
        } else if (condition == 4) {
            NorthRecipes()
        }
        customAdapter = CustomAdapter(this@MainActivity, constantList as ArrayList<Constant>)
        gridView!!.adapter = customAdapter
    }

    fun centralRecipes() {
        constantList!!.add(Constant(R.drawable.a1, "พะแนงเนื้อ", "", ""))
        constantList!!.add(Constant(R.drawable.a2, "ผัดเผ็ดปลาหมึก", "", ""))
        constantList!!.add(Constant(R.drawable.a3, "ฉู่ฉี่ปลากระพง", "", ""))
        constantList!!.add(Constant(R.drawable.a4, "ฉู่ฉี่กุ้งแม่น้ำ", "", ""))
        constantList!!.add(Constant(R.drawable.a5, "ต้มยำกุ้ง", "", ""))
        constantList!!.add(Constant(R.drawable.a6, "ผัดเปรี้ยวหวาน", "", ""))
        constantList!!.add(Constant(R.drawable.a7, "ผัดไทย", "", ""))
        constantList!!.add(Constant(R.drawable.a8, "ผัดกะเพรา", "", ""))
    }

    fun isanRecipes() {
        constantList!!.add(Constant(R.drawable.b1, "ส้มตำ", "", ""))
        constantList!!.add(Constant(R.drawable.b2, "ลาบ", "", ""))
        constantList!!.add(Constant(R.drawable.b3, "ก้อย", "", ""))
        constantList!!.add(Constant(R.drawable.b4, "อ่อมหมู", "", ""))
        constantList!!.add(Constant(R.drawable.b5, "แกงหน่อไม้", "", ""))
        constantList!!.add(Constant(R.drawable.b6, "ไส้กรอกอีสาน", "", ""))
        constantList!!.add(Constant(R.drawable.b7, "ซุปหน่อไม้", "", ""))
        constantList!!.add(Constant(R.drawable.b8, "ก้อยไข่มดแดง", "", ""))
    }

    fun SouthwestRecipes() {
        constantList!!.add(Constant(R.drawable.c1, "ปลาทรายทอดขมิ้น", "", ""))
        constantList!!.add(Constant(R.drawable.c2, "แกงคั่วหอยแครงใส่ใบพลู", "", ""))
        constantList!!.add(Constant(R.drawable.c3, "ข้าวยำ", "", ""))
        constantList!!.add(Constant(R.drawable.c4, "แกงไตปลา", "", ""))
        constantList!!.add(Constant(R.drawable.c5, "ขนมจีนน้ำยาใต้", "", ""))
        constantList!!.add(Constant(R.drawable.c6, "ผักเหลียงผัดไข่", "", ""))
        constantList!!.add(Constant(R.drawable.c7, "แกงเหลือง", "", ""))
        constantList!!.add(Constant(R.drawable.c8, "สะตอผัดกะปิกุ้งสด", "", ""))
    }

    fun NorthRecipes() {
        constantList!!.add(Constant(R.drawable.d1, "กระบอง", "", ""))
        constantList!!.add(Constant(R.drawable.d2, "ข้าวหลาม", "", ""))
        constantList!!.add(Constant(R.drawable.d3, "ข้าวซอยไก่", "", ""))
        constantList!!.add(Constant(R.drawable.d4, "ขนมจีนน้ำเงี้ยว", "", ""))
        constantList!!.add(Constant(R.drawable.d5, "แกงฮังเล", "", ""))
        constantList!!.add(Constant(R.drawable.d6, "แคปหมูน้ำพริกหนุ่ม", "", ""))
        constantList!!.add(Constant(R.drawable.d7, "ไส้อั่ว", "", ""))
    }
}
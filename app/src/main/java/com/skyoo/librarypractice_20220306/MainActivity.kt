package com.skyoo.librarypractice_20220306

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun setupEvents() {

    }


    fun  setValues() {

        Glide.with(this).load("s://namu.wiki/w/%ED%8C%8C%EC%9D%BC:GettyImages-5323678521530888060667_medium.jpg").into()
    }


}
// 전화걸기 권한 코드
// TedPermission.create()
//        .setPermissionListener(permissionlistener)
//        .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
//        .setPermissions(Manifest.permission.READ_CONTACTS, Manifest.permission.ACCESS_FINE_LOCATION)
//        .check();



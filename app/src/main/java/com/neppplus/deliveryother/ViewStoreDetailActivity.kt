package com.neppplus.deliveryother

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.neppplus.deliveryother.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var mStoreData : StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setValues()
        setupEvents()


    }

    fun setupEvents() {

        btnCall.setOnClickListener {


        }

    }

    fun setValues() {

        mStoreData = intent.getSerializableExtra("store") as StoreData

        txtStoreName.text = mStoreData.name
        txtPhoneNum.text = mStoreData.phoneNum

        Glide.with(this).load(mStoreData.logoURL).into(imgLogo)

    }


}
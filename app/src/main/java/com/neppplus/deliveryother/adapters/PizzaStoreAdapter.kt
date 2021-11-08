package com.neppplus.deliveryother.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.neppplus.deliveryother.R
import com.neppplus.deliveryother.datas.StoreData

class PizzaStoreAdapter(
    val mContext: Context,
    resId: Int,
    val mList: ArrayList<StoreData> ) : ArrayAdapter<StoreData>(mContext,resId,mList) {


    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null ) {

            tempRow = mInflater.inflate(R.layout.store_list_item,null)


        }
        val row = tempRow!!

        return row

    }
}
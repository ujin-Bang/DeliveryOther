package com.neppplus.deliveryother.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.deliveryother.datas.StoreData

class PizzaStoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StoreData> ) : ArrayAdapter<StoreData>(mContext,resId,mList) {
}
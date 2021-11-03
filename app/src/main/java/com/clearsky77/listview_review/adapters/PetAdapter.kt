package com.clearsky77.listview_review.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.clearsky77.listview_review.datas.PetData

class PetAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<PetData>) : ArrayAdapter<PetData>(mContext, resId, mList) {







}
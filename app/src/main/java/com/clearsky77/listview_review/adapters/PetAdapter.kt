package com.clearsky77.listview_review.adapters

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.TextView
import com.clearsky77.listview_review.R
import com.clearsky77.listview_review.datas.PetData

class PetAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<PetData>) : ArrayAdapter<PetData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = mInflater.inflate(resId, null) // 생성시에 xml 구분 번호를 넘겨 줄 것이다.
        }
        val row = tempRow!!
        val data = mList[position]

        // 위치 찾기
        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtAge = row.findViewById<TextView>(R.id.txtAge)
        val txtSkill = row.findViewById<TextView>(R.id.txtSkill)
        val linearRow = row.findViewById<LinearLayout>(R.id.LinearRow)

        txtName.text = data.name
        val age = 2021 - data.birthYear + 1
        txtAge.text = "(${age}세)"
        txtSkill.text = data.skill

        if(position % 2 == 0){
            linearRow.setBackgroundColor( Color.parseColor("#E1D5F4"))
        }

        return row

    }


}
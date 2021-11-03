package com.clearsky77.listview_review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.clearsky77.listview_review.adapters.PetAdapter
import com.clearsky77.listview_review.datas.PetData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val mPetList = ArrayList<PetData>() // 담을 그릇 만들기
    lateinit var mPetAdapter: PetAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPetList.add(PetData("냥냐루", 2015, "식빵 굽기"))
        mPetList.add(PetData("냐냐루", 2020, "솜방망이 펀치"))
        mPetList.add(PetData("냥냐냥", 2019, "물건 떨어트리기"))
        mPetList.add(PetData("리터봇", 2018, "뒷정리"))

        mPetAdapter = PetAdapter(this, R.layout.pet_list_item, mPetList)
        petListView.adapter = mPetAdapter
    }
}
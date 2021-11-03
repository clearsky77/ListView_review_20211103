package com.clearsky77.listview_review

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AlertDialogLayout
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
        mPetList.add(PetData("리터봇", 2018, "뒷정리"))
        mPetList.add(PetData("리터봇", 2018, "뒷정리"))
        mPetList.add(PetData("리터봇", 2018, "뒷정리"))
        mPetList.add(PetData("리터봇", 2018, "뒷정리"))
        mPetList.add(PetData("리터봇", 2018, "뒷정리"))
        mPetList.add(PetData("리터봇", 2018, "뒷정리"))

        mPetAdapter = PetAdapter(this, R.layout.pet_list_item, mPetList)
        petListView.adapter = mPetAdapter

//        길게 누르면 삭제
        petListView.setOnItemLongClickListener { adapterView, view, position, l ->
            val longClickedPet = mPetList[position]
            // 경고창 띄위기
            val alert = AlertDialog.Builder(this)
            alert.setMessage("정말 ${longClickedPet.name}의 정보를 제거하시겠습니까?")
            alert.setPositiveButton("확인", DialogInterface.OnClickListener { dialogInterface, i ->
                mPetAdapter.remove(longClickedPet)
                mPetAdapter.notifyDataSetChanged()
            })
            alert.setNegativeButton("취소",null)
            alert.show()
            return@setOnItemLongClickListener true
        }

    }
}
package com.neppplus.deliveryother.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.deliveryother.EditNicknameActivity
import com.neppplus.deliveryother.R
import kotlinx.android.synthetic.main.fragment_my_profilt.*

class MyProfilFragment : Fragment() {


    val REQ_CODE_NICKNAME = 1000
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_my_profilt, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        
//        동작 관련 코드 작성예정

        btnEdtNickName.setOnClickListener {

            val myIntet = Intent(requireContext(),EditNicknameActivity::class.java)
            startActivityForResult(myIntet,REQ_CODE_NICKNAME)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQ_CODE_NICKNAME) {
            if(resultCode == Activity.RESULT_OK) {

                val newNickname = data!!.getStringExtra("nick")
                txtNickName.text = newNickname

            }
    }
    }
}
package com.neppplus.deliveryother.fragments

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


    val REQ_CODE_NICKNAME
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_pizza_store_list, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        
//        동작 관련 코드 작성예정

        btnEdtNickName.setOnClickListener {

            val myIntet = Intent(requireContext(),EditNicknameActivity::class.java)
            startActivityForResult(myIntet.REQ_CODE_NICKNAME)
        }
    }
}
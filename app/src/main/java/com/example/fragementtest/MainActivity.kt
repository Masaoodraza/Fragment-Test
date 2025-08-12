package com.example.fragementtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.fragementtest.databinding.ActivityMainBinding
import com.example.fragementtest.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnclock.setOnClickListener {
            replaceFramewithFragmengt(Clock_Fragement())
        }
        binding.btnExam.setOnClickListener {
            replaceFramewithFragmengt(Exam_Fragement())

        }
        binding.btnValidate.setOnClickListener {
            replaceFramewithFragmengt(LoginFragment())
        }

    }
    private fun replaceFramewithFragmengt(fragement: Fragment){
//        val fragManeger=supportFragmentManager
//        val fragTransaction=fragManeger.beginTransaction()
//        fragTransaction.replace(R.id.FraneLayour,fragement)
//        fragTransaction.commit()
        supportFragmentManager.beginTransaction().replace(R.id.FraneLayour,fragement).commit()

    }

}
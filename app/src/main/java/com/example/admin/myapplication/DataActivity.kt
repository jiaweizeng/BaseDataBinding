package com.example.admin.myapplication

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.example.admin.myapplication.databinding.ActivityDataBinding

class DataActivity : AppCompatActivity() {

    lateinit var dataBinding: ActivityDataBinding
    lateinit var user:User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_data)

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_data)


        user = User("aaaa", "bbb")

        dataBinding.user=User("aaaa","bbb")
        dataBinding.setVariable(BR.user,user)
        dataBinding.setVariable(BR.presenter,Presenter())

        dataBinding.viewstub.viewStub?.inflate()

        Toast.makeText(this,User("aaaa","bbb").firstName,Toast.LENGTH_LONG).show()

    }

    inner class Presenter{
        fun onTextChanged(s:CharSequence,start:Int,before:Int,count:Int){
//            Toast.makeText(this@DataActivity,s.toString(),Toast.LENGTH_SHORT).show()
//            user.setFirstName(s.toString())
//            user.setLastName(s.toString())
            dataBinding.followEdittext.text=s
        }
        fun onClick(view: View){
            user.setIsShow(true)
            Toast.makeText(this@DataActivity,"Don't touch me",Toast.LENGTH_SHORT).show()
        }
        fun onClickListener(user:User){
            Toast.makeText(this@DataActivity,user.lastName,Toast.LENGTH_SHORT).show()
        }
    }
}

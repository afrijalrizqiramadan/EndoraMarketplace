package com.asyabab.endora.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.asyabab.endora.App
import com.asyabab.endora.R
import com.asyabab.endora.utils.DialogHelper
import com.asyabab.endora.data.Repository
import com.facebook.login.LoginManager
import com.google.firebase.auth.FirebaseAuth
import java.io.Serializable

open class BaseFragment : Fragment() {
    private lateinit var progressBar: AlertDialog

    protected val repository: Repository?
        get() = (requireActivity().application as App).repository

    protected val loadingDialog: AlertDialog?
        get() = progressBar

    protected val mAuth: FirebaseAuth?
        get() = FirebaseAuth.getInstance()
    protected val mLoginManager: LoginManager?
        get() = LoginManager.getInstance()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        progressBar = DialogHelper.loading(context)

    }

    fun loadFragment(fragment: Fragment?) {
        if (fragment != null) {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.frame_container, fragment)
                ?.commit()


        }
    }

    fun loadFragment(fragment: Fragment?, string1: String, string2: String) {
        if (fragment != null) {
            val bundle = Bundle()
            bundle.putString("string1", string1)
            bundle.putString("string2", string2)
            fragment.arguments = bundle
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.frame_container, fragment)
                ?.addToBackStack(null)
                ?.commit()
        }
    }

    fun loadFragmentBack(fragment: Fragment?) {
        if (fragment != null) {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.frame_container, fragment)
                ?.addToBackStack(null)
                ?.commit()


        }
    }
}

package com.branislavbily.fitcalendar.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.branislavbily.fitcalendar.BR
import com.branislavbily.fitcalendar.R
import com.branislavbily.fitcalendar.dataBinding.setupDataBinding
import com.branislavbily.fitcalendar.viewModel.LoginFragmentViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class LoginFragment : Fragment() {

    private val loginFragmentViewModel: LoginFragmentViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val dataBinding = setupDataBinding<ViewDataBinding>(
            R.layout.fragment_login,
            BR.viewmodel to loginFragmentViewModel
        )
        setHasOptionsMenu(true)
        loginFragmentViewModel.lifecycleOwner = this
        return dataBinding.root
    }
}
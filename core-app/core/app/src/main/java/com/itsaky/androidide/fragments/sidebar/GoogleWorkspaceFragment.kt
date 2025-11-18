package com.itsaky.androidide.fragments.sidebar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.itsaky.androidide.databinding.FragmentGoogleWorkspaceBinding
import com.itsaky.androidide.fragments.BaseFragment

class GoogleWorkspaceFragment : BaseFragment<FragmentGoogleWorkspaceBinding>() {

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentGoogleWorkspaceBinding {
        return FragmentGoogleWorkspaceBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}

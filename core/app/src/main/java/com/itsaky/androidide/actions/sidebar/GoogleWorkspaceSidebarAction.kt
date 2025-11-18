package com.itsaky.androidide.actions.sidebar

import android.content.Context
import com.itsaky.androidide.R
import com.itsaky.androidide.actions.SidebarActionItem
import com.itsaky.androidide.fragments.sidebar.GoogleWorkspaceFragment

class GoogleWorkspaceSidebarAction(context: Context, order: Int) : SidebarActionItem(
    context,
    ID,
    order,
    R.id.dest_google_workspace,
    R.drawable.ic_google_workspace,
    R.string.title_google_workspace
) {

    override val fragmentClass = GoogleWorkspaceFragment::class.java

    companion object {
        const val ID = "google-workspace"
    }
}

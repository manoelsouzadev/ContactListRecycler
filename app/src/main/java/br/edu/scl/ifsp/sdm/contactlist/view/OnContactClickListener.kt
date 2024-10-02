package br.edu.scl.ifsp.sdm.contactlist.view

sealed interface OnContactClickListener {
    fun onContactClick(position: Int)
    fun onRemoveContactItemMenuItemClick(position: Int)
    fun onEditContactMenuItemClick(position: Int)
}
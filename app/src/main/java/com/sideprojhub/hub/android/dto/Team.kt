package com.sideprojhub.hub.android.dto

data class Team(
    val addItem: AddItem
) {
    data class AddItem(
        val name: String
    )
}

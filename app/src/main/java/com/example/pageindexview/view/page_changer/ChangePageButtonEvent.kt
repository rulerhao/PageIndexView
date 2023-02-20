package com.example.pageindexview.view.page_changer

sealed class ChangePageButtonEvent {
    data class OnDirectionClicked(val direction: Direction) : ChangePageButtonEvent()
}
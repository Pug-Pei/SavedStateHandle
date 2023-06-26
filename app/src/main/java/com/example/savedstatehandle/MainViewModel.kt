package com.example.savedstatehandle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel(
    //viewModelの引数にSavedStarteHandelを指定する
    handle: SavedStateHandle
) : ViewModel() {

    val userTextInput = MutableLiveData<String>("")

    // SavedStateHandleからキー"USER_TEXT_INPUT"にひも付くMutableLiveDataを探して引っ張ってくる。
    // 存在しない場合は新しく作る（そしてSavedStateHandle内でキー"USER_TEXT_INPUT"に対してひも付け、抱えておく）
    // 初期値は空文字。。
    val userTextInputSaved: MutableLiveData<String> = handle.getLiveData<String>("USER_TEXT_INPUT","")
}
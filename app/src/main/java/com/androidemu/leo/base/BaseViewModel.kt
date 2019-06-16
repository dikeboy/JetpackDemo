package com.androidemu.leo.base

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel;

abstract class BaseViewModel( val savedStateHandle: SavedStateHandle) : ViewModel() {
}

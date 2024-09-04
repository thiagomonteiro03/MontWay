package com.montway.start.presentation.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.montway.start.data.repository.LoginRepository
import com.montway.start.domain.model.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEmpty
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val loginRepository: LoginRepository
) : ViewModel() {

    val login: MutableState<String> = mutableStateOf("")
    val password: MutableState<String> = mutableStateOf("")

    val uiState: MutableStateFlow<UiState> = MutableStateFlow(UiState.Empty)

    suspend fun makeLogin(login: String, password: String) = viewModelScope.launch{
        uiState.emit(UiState.Loading)
        loginRepository.authentication(login).map { data ->
            uiState.emit(UiState.Success(User(name = data, email = "")))
        }
            .onEmpty {
                uiState.emit(UiState.Empty)
            }
            .onStart {
                uiState.emit(UiState.Loading)
            }.collect()
    }

    suspend fun backToLogin() = viewModelScope.launch{
        uiState.emit(UiState.Empty)
        login.value = ""
        password.value = ""
    }

    sealed class UiState(){
        data object Empty: UiState()
        data object Error: UiState()
        data object Loading: UiState()
        data class Success(val user: User) : UiState()

    }
}

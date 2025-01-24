package com.example.lyodstesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun emptyUsernameTest() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun usernameAlreadyExsistTest() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "xyz",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password with less than 3 characters returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "test",
            password = "a",
            confirmPassword = "a"
        )
        assertThat(result).isFalse()
    }



    @Test
    fun `password with less than 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "test",
            password = "a1q",
            confirmPassword = "a1q"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun validateUsernameAndRepeatPasswordTest() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "lmn",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isTrue()
    }
}
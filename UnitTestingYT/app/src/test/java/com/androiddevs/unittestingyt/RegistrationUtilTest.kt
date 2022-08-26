package com.androiddevs.unittestingyt


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Philipp",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    // empty password
    // password was repeated incorrectly
    // password contains less than 2 digits

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Test",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Test",
            "12345",
            "54321"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Test",
            "abcdefg5",
            "abcdefg5"
        )
        assertThat(result).isFalse()
    }

//    @Test
//    fun `incorrectly confirmed password returns false`() {
//        val result = RegistrationUtil.validateRegistrationInput(
//            "Philipp",
//            "123456",
//            "abcdefg"
//        )
//        assertThat(result).isFalse()
//    }
//
//    @Test
//    fun `empty password returns false`() {
//        val result = RegistrationUtil.validateRegistrationInput(
//            "Philipp",
//            "",
//            ""
//        )
//        assertThat(result).isFalse()
//    }
//
//    @Test
//    fun `less than 2 digit password returns false`() {
//        val result = RegistrationUtil.validateRegistrationInput(
//            "Philipp",
//            "abcdefg5",
//            "abcdefg5"
//        )
//        assertThat(result).isFalse()
//    }
}
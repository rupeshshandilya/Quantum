package me.khol.quantum

import me.khol.quantum.Qubit.Companion.ONE
import me.khol.quantum.Qubit.Companion.ZERO
import me.khol.quantum.math.Complex
import me.khol.quantum.math.Matrix
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class QubitGateTest {

    @DisplayName("Ket and Bra vector multiplication")
    @Test
    fun ketsAndBras() {
        val result = ZERO.ket * ZERO.bra + ONE.ket * ONE.bra
        assertEquals(Matrix.identity(2), result)
    }

    @DisplayName("Equation maps to Zero qubit")
    @Test
    fun mapsToZeroQubit() {
        val result = (ZERO.ket * ONE.bra) * ONE.ket
        assertEquals(ZERO.ket, result)
    }

    @DisplayName("Equation maps to zero")
    @Test
    fun mapsToZero() {
        val result = (ZERO.ket * ONE.bra) * ZERO.ket
        assertEquals(Matrix(2, 1, Complex.ZERO, Complex.ZERO), result)
    }
}
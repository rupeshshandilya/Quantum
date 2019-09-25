package me.khol.quantum.gate

import me.khol.quantum.math.Complex.Companion.ONE
import me.khol.quantum.math.Complex.Companion.ZERO
import me.khol.quantum.math.Matrix

object GateX : Gate {

    override val qubits = 1
    override val matrix = Matrix(
        arrayOf(
            arrayOf(ZERO, ONE),
            arrayOf(ONE, ZERO)
        )
    )
}
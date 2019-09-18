package me.khol.quantum.math.scalar

interface Scalar<S : Scalar<S>> {

    operator fun unaryPlus(): S
    operator fun unaryMinus(): S

    operator fun plus(s: Double): S
    operator fun minus(s: Double): S
    operator fun times(s: Double): S
    operator fun div(s: Double): S

    operator fun plus(s: S): S
    operator fun minus(s: S): S
    operator fun times(s: S): S
    operator fun div(s: S): S
}

package com.mulhermarav.strategy

enum class Tempo(val milli: Double) {
    HORA(3_600_000.0), DIA(86_400_000.0), MES(30 * 24 * 60 * 60 * 1000.0);
}
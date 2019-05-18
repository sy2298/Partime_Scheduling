package com.example.toro_ver2

class Staff {
    var _name: String? = null
    var _min_time: Int = 0
        private set
    var _max_time: Int = 0
        private set
    var _work_time = 0
        set(time) {
            field += time
        }

    val _minus: Int
        get() = this._min_time - this._work_time

    fun set_min_max_time(min_time: Int, max_time: Int) {
        this._min_time = min_time
        this._max_time = max_time
    }

    fun workable(): Boolean {
        return this._work_time < this._max_time
    }
}

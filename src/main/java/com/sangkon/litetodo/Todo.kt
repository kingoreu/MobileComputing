package com.sangkon.litetodo

data class Todo(val id: Int = generateId(), val date: String, val task: String) {
    companion object {
        private var currentId: Int = 0
        private fun generateId(): Int {
            return ++currentId
        }
    }
}
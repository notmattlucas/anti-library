package com.lucasmatt.antilibrary.goodreads

import org.junit.Test

class GoodreadsTest {

    @Test
    fun tryme() {
        val goodreads = Goodreads("61058109-matthew-lucas")
        val info = goodreads.userInfo()
        println(info)
        val shelves = goodreads.shelves()
        println(shelves)
        for (shelf in shelves) {
            val books = goodreads.contentsOf(shelf)
            println(books)
        }
    }

}
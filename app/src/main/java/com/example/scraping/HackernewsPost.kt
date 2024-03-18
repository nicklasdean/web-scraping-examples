package com.example.scraping

data class HackernewsPost(val title: String, val link:String): Comparable<HackernewsPost> {
    override fun compareTo(other: HackernewsPost): Int {
        TODO("Not yet implemented")
    }
};
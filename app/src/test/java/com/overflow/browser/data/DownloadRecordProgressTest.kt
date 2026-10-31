package com.overflow.browser.data

import org.junit.Assert.*
import org.junit.Test

class DownloadRecordProgressTest {
    @Test
    fun downloadRecord_calculatesProgressCorrectly() {
        val d = DownloadRecord(fileName = "test.zip", url = "http://ex.com/t.zip", totalBytes = 1000L, downloadedBytes = 250L)
        assertEquals(25, (d.downloadedBytes * 100 / d.totalBytes).toInt())
    }
}

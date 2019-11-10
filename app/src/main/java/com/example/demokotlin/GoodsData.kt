package com.example.demokotlin

import com.example.demokotlin.model.Good

class GoodsData {
    var data = listOf(
        arrayOf("Supratman", "Hospital Sadja", "Senin, 21:00 - 05:00 WIB"),
        arrayOf("Superman", "Hell Hospital", "Senin, 21:00 - 05:00 WIB"),
        arrayOf("Bacharuddin Jusuf Habibie", "Hell Hospital", "Senin, 21:00 - 05:00 WIB"),
        arrayOf("Abdurrahman ", "Praktik AbDul", "Senin, 21:00 - 05:00 WIB"),
        arrayOf("Soekarnoputri", "Rumah Sakit Bersalin A", "Senin, 21:00 - 05:00 WIB"),
        arrayOf("Bambang", "Rumah Sakit Bersalin B", "Senin, 21:00 - 05:00 WIB"),
        arrayOf("Joko", "Hospital ABC", "Senin, 21:00 - 05:00 WIB")
    )


    fun getListData(): ArrayList<Good> {
        var good = Good()
        val list = ArrayList<Good>()
        for (aData in data) {

            good.name = aData[0]
            good.price = aData[1]
            good.name = aData[2]

            list.add(good)
        }


        return list
    }
}
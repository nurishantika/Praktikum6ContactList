package com.example.profilfakultas2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createFakData()
        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.setHasFixedSize(true)
        rv_list.adapter = FakAdapter(testData, { fakItem: FakData -> resepItemClicked(fakItem)})
    }

    private fun resepItemClicked(fakItem: FakData) {
        val showDetailActivityIntent = Intent(this, FakDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, fakItem.namaFak.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, fakItem.descFak.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, fakItem.fotoFak.toString())
        showDetailActivityIntent.putExtra(Intent.ACTION_PICK, fakItem.web.toString())
        showDetailActivityIntent.putExtra(Intent.ACTION_CALL, fakItem.email.toString())
        startActivity(showDetailActivityIntent)
    }
    private fun createFakData() : List<FakData> {
        val partList = ArrayList<FakData>()
        partList.add(
            FakData(
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi:\n\n" +
                        "1. Informatika\n" +
                        "2. Sistem Informasi\n" +
                        "3. Sains Data",
                R.drawable.fik,
                "http://fik.upnjatim.ac.id/",
                "fik@upnjatim.ac.id"
            )
        )
        partList.add(
            FakData(
                "Fakultas Teknik",
                "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi:\n\n" +
                        "1. Teknik Kimia\n" +
                        "2. Teknik Industri\n" +
                        "3. Teknik Sipil\n" +
                        "4. Teknik Lingkungan\n" +
                        "5. Teknologi Pangan",
                R.drawable.ft,
                "http://ft.upnjatim.ac.id/",
                "ft@upnjatim.ac.id"
            )
        )
        partList.add(
            FakData(
                "Fakultas Ekonomi Dan Bisnis",
                "Fakultas Ekonomi Dan Bisnis merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi:\n\n" +
                        "1. Ekonomi Pembangunan\n" +
                        "2. Akuntansi\n" +
                        "3. Manajemen",
                R.drawable.feb,
                "http://febis.upnjatim.ac.id/",
                "feb@upnjatim.ac.id"
            )
        )
        partList.add(
            FakData(
                "Fakultas Pertanian",
                "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi:\n\n" +
                        "1. Agroteknologi\n" +
                        "2. Agribisnis",
                R.drawable.fp,
                "http://faperta.upnjatim.ac.id/",
                "fp@upnjatim.ac.id"
            )
        )
        partList.add(
            FakData(
                "Fakultas Arsitektur Dan Desain",
                "Fakultas Arsitektur Dan Desain merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi:\n\n" +
                        "1. Arsitektur\n" +
                        "2. Desain Komunikasi Visual",
                R.drawable.fad,
                "http://fad.upnjatim.ac.id/",
                "fad@upnjatim.ac.id"
            )
        )
        partList.add(
            FakData(
                "Fakultas Ilmu Sosial Dan Ilmu Politik",
                "Fakultas Ilmu Sosial Dan Ilmu Politik merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi:\n\n" +
                        "1. Ilmu Komunikasi\n" +
                        "2. Ilmu Administrasi Negara\n" +
                        "3. Ilmu Administrasi Bisnis\n" +
                        "4. Hubungan Internasional\n" +
                        "5. Pariwisata",
                R.drawable.fisip,
                "http://fisip.upnjatim.ac.id/",
                "fisip@upnjatim.ac.id"
            )
        )
        partList.add(
            FakData(
                "Fakultas Hukum",
                "Fakultas Hukum merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi:\n\n" +
                        "1. Ilmu Hukum",
                R.drawable.fh,
                "http://fhukum.upnjatim.ac.id/",
                "fh@upnjatim.ac.id"
            )
        )
        partList.add(
            FakData(
                "Nurisa Rahma Shantika",
                "Surabaya, 16 September 1999\n" +
                        "Semolowaru Elok Surabaya\n" +
                        "082337477449\n" +
                        "(2006-2012) SDN Baratajaya Surabaya\n" +
                        "(2012-2015) SMPN 39 Surabaya\n" +
                        "(2015-2018) SMA Muhammadiyah 2 Surabaya\n" +
                        "(2018-Sekarang) UPN 'Veteran' Jatim",
                R.drawable.screenshot,
                "http://github.com/nurishantika/",
                "18082010025@student.upnjatim.ac.id"
            )
        )
        return partList
    }
}

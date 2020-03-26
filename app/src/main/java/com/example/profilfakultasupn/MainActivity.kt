package com.example.profilfakultasupn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textData = createPhoneData()

        rv_part.layoutManager = LinearLayoutManager(this)
        rv_part.setHasFixedSize(true)
        rv_part.adapter = ProfilAdapter(textData) { phoneItem: ProfilData ->
            phoneItemClicked(phoneItem)
        }
    }

    private fun phoneItemClicked(phoneItem: ProfilData) {
        val showDetailActivityIntent = Intent(this, ProfilDetailActivity::class.java)
        showDetailActivityIntent.putExtra(ProfilDetailActivity.EXTRA_ITEM, phoneItem)
        startActivity(showDetailActivityIntent)
    }

    private fun createPhoneData(): List<ProfilData> {
        val partList = ArrayList<ProfilData>()
        partList.add(
            ProfilData(
                "FAKULTAS ILMU KOMPUTER",
                R.drawable.fik,
                "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur." +
                        " Yang terdiri dari program studi :",
                "1. Prodi S1 Teknik Informatika" +
                        "\n2. Prodi S1 Sistem Informasi",
                "WEB FAKULTAS : " +
                        "\nhttps://fik.upnjatim.ac.id",
                "WEB JURUSAN : " +
                        "\n1. https://if.upnjatim.ac.id" +
                        "\n2. http://sisfo.upnjatim.ac.id",
                "EMAIL :" +
                        "\n1. informatika@upnjatim.ac.id" +
                        "\n2. piasifo@upnjatim.ac.id",
                "" , "", "", ""

            )
        )

        partList.add(
            ProfilData(
                " FAKULTAS TEKNIK",
                R.drawable.ft,
                "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur." +
                            " Yang terdiri dari program studi : ",
                "1. Prodi S1 Teknik Kimia" +
                        "\n2. Prodi S1 Teknik Industri" +
                        "\n3. Prodi S1 Teknik Sipil" +
                        "\n4. Prodi S1 Teknik Lingkungan" +
                        "\n5. Prodi S1 Teknologi Pangan",
                "WEB FAKULTAS :" +
                        "\nhttp://ft.upnjatim.ac.id/",
                "WEB JURUSAN :" +
                        "\n1. http://tekkimia.upnjatim.ac.id" +
                        "\n2. http://tekindustri.upnjatim.ac.id" +
                        "\n3. http://teksipil.upnjatim.ac.id" +
                        "\n4. http://teklingk.upnjatim.ac.id" +
                        "\n5. http://tekpangan.upnjatim.ac.id",
                "EMAIL :" +
                        "\n1. html.upnvjt@gmail.com" +
                        "\n2. teknik.lingkungan@upnjatim.ac.id",
                "" , "", "", ""

            )
        )

        partList.add(
            ProfilData(
                "FAKULTAS EKONOMI DAN BISNIS 1",
                R.drawable.feb,
                "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur." +
                            " Yang terdiri dari program studi : ",
                "1. Prodi S1 Ekonomi Pembangunan" +
                        "\n2. Prodi S1 Manajemen",
                "WEB FAKULTAS :" +
                        "\nhttp://febis.upnjatim.ac.id",
                "WEB JURUSAN :" +
                        "\n1. http://ekbang.upnjatim.ac.id" +
                        "\n2. http://manajemen.upnjatim.ac.id",
                "EMAIL :" +
                        "\n1. feb@upnjatim.ac.id",
                "" , "", "", ""

            )
        )

        partList.add(
            ProfilData(
                "FAKULTAS EKONOMI DAN BISNIS 2",
                R.drawable.feb2,
                "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur." +
                        " Yang terdiri dari program studi : ",
                "1. Prodi S1 Akuntansi" ,
                "WEB FAKULTAS :" +
                        "\nhttp://febis.upnjatim.ac.id",
                "WEB JURUSAN :" +
                        "\n1. http://akuntansi.upnjatim.ac.id" ,
                "EMAIL :" +
                        "\n1. feb@upnjatim.ac.id" +
                        "\n2. akuntansi@upnjatim.ac.id",
                "" , "", "", ""

            )
        )

        partList.add(
            ProfilData(
                "FAKULTAS PERTANIAN",
                R.drawable.fp,
                "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur." +
                            " Yang terdiri dari program studi : ",
                "1. Prodi S1 Agroteknologi" +
                        "\n2. Prodi S1 Agribisnis ",
                "WEB FAKULTAS : " +
                        "\nhttp://faperta.upnjatim.ac.id",
                "WEB JURUSAN :" +
                        "\n1. http://agrotek.upnjatim.ac.id" +
                        "\n2. https://agribis.upnjatim.ac.id",
                "EMAIL :" +
                        "\n1. humas@upnjatim.ac.id",
                "" , "", "", ""

            )
        )

        partList.add(
            ProfilData(
                "FAKULTAS ILMU SOSIAL DAN ILMU POLITIK",
                R.drawable.fisip,
                "Fakultas Ilmu Sosial dan Ilmu Politik merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur." +
                        " Yang terdiri dari program studi : ",
                "1. Prodi S1 Administrasi Negara" +
                        "\n2. Prodi S1 Administrasi Bisnis" +
                        "\n3. Prodi S1 Ilmu Komunikasi" +
                        "\n4. Prodi S1 Hubungan Internasional ",
                "WEB FAKULTAS :" +
                        "\nhttp://fisip.upnjatim.ac.id",
                "WEB JURUSAN  :" +
                        "\n1. http://adneg.upnjatim.ac.id" +
                        "\n2. https://adbis.upnjatim.ac.id" +
                        "\n3. http://ilkom.upnjatim.ac.id" +
                        "\n4. http://hubint.upnjatim.ac.id",
                "EMAIL :" +
                        " \n1. irwan_dwi_a@yahoo.co.id",
                "" , "", "", ""

            )
        )

        partList.add(
            ProfilData(
                "FAKULTAS ARSITEKTUR DAN DESAIN",
                R.drawable.fad,
                "Fakultas Arsitektur dan Desain merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur." +
                        " Yang terdiri dari program studi : ",
                "1. Prodi S1 Arsitektur" +
                        "\n2. Prodi S1 Desain Komunikasi Visual ",
                "WEB FAKULTAS :" +
                        "\nhttp://fad.upnjatim.ac.id",
                "WEB JURUSAN :" +
                        "\n1. http://arsitektur.upnjatim.ac.id" +
                        "\n2. http://dkv.upnjatim.ac.id",
                "EMAIL :" +
                        "\n1. fad@upnjatim.ac.id",
                "" , "", "", ""

            )
        )

        partList.add(
            ProfilData(
                "FAKULTAS HUKUM",
                R.drawable.fh,
                "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur." +
                        " Yang terdiri dari program studi : ",
                "1. Prodi S1 Agroteknologi",
                "WEB FAKULTAS :" +
                        "\nhttp://fhukum.upnjatim.ac.id",
                "WEB JURUSAN : " +
                        "\nhttp://ilkum.upnjatim.ac.id",
                "EMAIL :" +
                        "\n1. humas@upnjatim.ac.id",
                "" , "", "", ""

            )
        )

        partList.add(
            ProfilData(
                "PROGRAM PASCA SARJANA",
                R.drawable.pascasarjana,
                "Program Pasca Sarjana merupakan satu-satunya pasca sarjana di UPN Veteran Jawa Timur." +
                        " Yang terdiri dari program studi : ",
                "1. Prodi Magister Agribisnis" +
                        "\n2. Prodi Magister Manajemen" +
                        "\n3. Prodi Magister Akuntansi" +
                        "\n4. Prodi Magister Agroteknologi" +
                        "\n5. Prodi Magister Ilmu Lingkungan",
                "WEB FAKULTAS :" +
                        "\nhttp://pasca.upnjatim.ac.id",
                "WEB JURUSAN :" +
                        "\n1. https://magri.upnjatim.ac.id" +
                        "\n2. http://mm.upnjatim.ac.id" +
                        "\n3. http://mak.upnjatim.ac.id" +
                        "\n4. http://magrotek.upnjatim.ac.id" +
                        "\n5. http://mling.upnjatim.ac.id",
                "EMAIL :" +
                        "\npasca@upnjatim.ac.id" +
                        "\npasca.upnjatim@gmail.com",
                "" , "", "", ""

            )
        )

        partList.add(
            ProfilData(
                "NADIA ERINNA RAHMAWATI",
                R.drawable.nadia,
                "Hallo Friend ,Nama saya Nadia Erinna Rahmawati. " +
                        "Saat ini saya menempuh pendidikan di sebuah perguruan tinggi di surabaya yaitu UPN VETERAN JAWA TIMUR" +
                        "Saya mengambil jurusan sistem informasi , tahun masuk kuliah saya tahun 2017, Berikut profil lengkap saya : ",
                "TTL : SURABAYA, 06 APRIL 1999",
                "ALAMAT : KENDANGSARI BLOK A NO. 10 SURABAYA",
                "URL GITHUB : www.github.com/nadiaerahmawati",
                "EMAIL : nadiaerahmawati@gmail.com",
                "NO.HP : +6289678217008",
                "RIWAYAT PENDIDIKAN : " +
                        "\n1. TK AL-IKHLAS SURABAYA" +
                        "\n2. SD KENDANGSARI I SURABAYA" +
                        "\n3. SMP NEGERI 35 SURABAYA" +
                        "\n4. MADRASAH ALIYAH NEGERI SURABAYA",
                "","","",""


            )
        )

        return partList
    }
}

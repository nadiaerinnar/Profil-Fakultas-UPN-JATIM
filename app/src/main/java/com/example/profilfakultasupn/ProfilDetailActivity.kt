package com.example.profilfakultasupn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_profil_detail.*


class ProfilDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ITEM = "extra_item"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_detail)

        if (intent.hasExtra(EXTRA_ITEM)) {
            val fakultas = intent.getParcelableExtra<ProfilData>(EXTRA_ITEM)

            fakultas?.let {
                tv_nama_Fakultas.text = it.fakultas
                tv_penjelasan_fakultas.text = it.penjelasan
                tv_jenis_jurusan.text = it.jurusan
                tv_web_fak.text = it.webfak
                tv_web_jurusan.text = it.webjur
                tv_data_profil.text = it.profil
                tv_TTL.text = it.ttl
                tv_alamat.text = it.alamat
                tv_nomor_hp.text = it.hp
                tv_email.text = it.email
                tv_url_profil.text = it.url
                tv_riwayat_pendidikan.text = it.riwayat

                Glide.with(applicationContext).load(it.poster).centerCrop().into(img_poster)
            }
        }
    }
}
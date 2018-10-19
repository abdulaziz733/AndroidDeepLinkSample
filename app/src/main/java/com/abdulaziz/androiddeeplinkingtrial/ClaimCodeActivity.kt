package com.abdulaziz.androiddeeplinkingtrial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_claim_code.*


class ClaimCodeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_claim_code)

        intent.let { it ->
            val data = it.data
            if (data != null) {
                val promoCode = data.getQueryParameter("promocode")
                promo_code_input.setText(promoCode)
            }
        }

    }
}

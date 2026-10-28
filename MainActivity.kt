package com.example.baheerrepair

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView

class MainActivity : Activity() {
    private data class Item(val title: String, val detail: String, val url: String? = null)

    private val items = listOf(
        Item("Google حساب بېرته ترلاسه کول", "د مالک د Google حساب رسمي recovery پاڼه", "https://accounts.google.com/signin/recovery"),
        Item("Android ADB لارښود", "د USB او Wireless debugging رسمي لارښود", "https://developer.android.com/tools/adb"),
        Item("Samsung", "رسمي ملاتړ او Smart Switch", "https://www.samsung.com/us/support/owners/app/smart-switch/"),
        Item("Xiaomi / Redmi", "رسمي ملاتړ", "https://www.mi.com/global/support/"),
        Item("TECNO", "رسمي ملاتړ", "https://www.tecno-mobile.com/support/"),
        Item("Infinix", "رسمي وېبپاڼه او ملاتړ", "https://www.infinixmobility.com/"),
        Item("OPPO", "رسمي ملاتړ", "https://support.oppo.com/"),
        Item("vivo", "رسمي ملاتړ", "https://www.vivo.com/en/support"),
        Item("Huawei", "رسمي ملاتړ", "https://consumer.huawei.com/en/support/"),
        Item("itel", "رسمي وېبپاڼه", "https://www.itel-life.com/"),
        Item("د Reset مخکې چک‌لېست", "۱) د مالک اجازه واخله\n۲) د عکسونو او فایلونو بیک‌اپ تایید کړه\n۳) د Google حساب معلومات تایید کړه\n۴) د دقیق ماډل رسمي لارښود وګوره", null),
        Item("د Flash مهمه یادونه", "Firmware باید د دقیق ماډل او سیمې سره سم وي. ناسم فایل موبایل خرابولای شي. یوازې د جوړونکي رسمي یا مجاز وسیله وکاروه.", null),
        Item("FRP / Google قفل", "دا اپ قفل نه تېروي. د مالک Google حساب بېرته ترلاسه کړه یا د پېرود ثبوت سره مجاز خدمت ته ورشه.", null)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24, 24, 24, 24)
            setBackgroundColor(Color.rgb(245, 247, 250))
        }
        val scroll = ScrollView(this)
        val body = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        body.addView(TextView(this).apply {
            text = "BaHeeR Android Repair"
            textSize = 25f
            setTypeface(null, Typeface.BOLD)
            setTextColor(Color.rgb(18, 48, 74))
            gravity = Gravity.CENTER
            setPadding(0, 8, 0, 8)
        }, matchWrap())
        body.addView(TextView(this).apply {
            text = "د Android موبایلونو د ترمیم مرستندویه اپلېکېشن"
            textSize = 16f
            gravity = Gravity.CENTER
            setTextColor(Color.DKGRAY)
            setPadding(0, 0, 0, 16)
        }, matchWrap())
        body.addView(TextView(this).apply {
            text = "یادونه: دا لومړنۍ نسخه رسمي لارښوونې پرانیزي؛ مستقیم Flash، factory reset یا FRP bypass نه ترسره کوي."
            textSize = 15f
            setTextColor(Color.rgb(130, 35, 35))
            setPadding(14, 14, 14, 14)
            setBackgroundColor(Color.rgb(255, 232, 232))
        }, matchWrap())
        items.forEach { item ->
            val button = Button(this).apply {
                text = item.title
                isAllCaps = false
                setOnClickListener {
                    if (item.url != null) {
                        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(item.url)))
                    } else {
                        android.app.AlertDialog.Builder(this@MainActivity)
                            .setTitle(item.title).setMessage(item.detail)
                            .setPositiveButton("سمه ده", null).show()
                    }
                }
            }
            body.addView(button, matchWrap())
        }
        scroll.addView(body)
        root.addView(scroll, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
        setContentView(root)
    }

    private fun matchWrap() = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT).apply { bottomMargin = 8 }
}

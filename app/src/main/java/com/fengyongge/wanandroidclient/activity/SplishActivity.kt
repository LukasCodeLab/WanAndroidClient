package com.fengyongge.wanandroidclient.activity

import android.content.Intent
import com.fengyongge.baseframework.BaseActivity
import com.fengyongge.wanandroidclient.R

/**
 * describe
 *
 * @author fengyongge(fengyongge98@gmail.com)
 * @version V1.0
 * @date 2020/09/08
 */
class SplishActivity : com.fengyongge.baseframework.BaseActivity() {
    override fun initLayout(): Int {
        return R.layout.activity_splish
    }

    override fun initView() {
        startActivity(Intent(SplishActivity@this,MainActivity::class.java))
    }

    override fun initData() {
    }

}
package d128.work.fragmentviewpager

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.view.ViewPager

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.view_pager)

        // オンスクリーンの両側に保持するページ数を設定
        // https://developer.android.com/reference/android/support/v4/view/ViewPager#setoffscreenpagelimit
        //viewPager.offscreenPageLimit = 10

        viewPager.adapter = MainFragmentPagerAdapter(supportFragmentManager)
    }

}

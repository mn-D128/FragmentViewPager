package d128.work.fragmentviewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MainFragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 10
    }

    override fun getItem(position: Int): Fragment {
        return MainFragment.newInstance(position)
    }

}
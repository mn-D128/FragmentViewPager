package d128.work.fragmentviewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MainFragment : Fragment() {

    companion object {

        private val BUNDLE_KEY_VALUE = "BUNDLE_KEY_VALUE"

        fun newInstance(value: Int): MainFragment {
            val fragment = MainFragment()
            val bundle = Bundle()
            bundle.putInt(BUNDLE_KEY_VALUE, value)

            fragment.arguments = bundle

            return fragment
        }

    }

    @Override
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, null)
    }

    @Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val textView = view.findViewById<TextView>(R.id.text_view)

        arguments?.let {
            (it[BUNDLE_KEY_VALUE] as? Int)?.let {
                textView.setText(it.toString())
            }
        }
    }

    @Override
    override fun onResume() {
        super.onResume()

        if (userVisibleHint) {
            // TODO: オンスクリーン
            Log.d("","オンスクリーン")
        }
    }

    @Override
    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)

        if (isResumed && isVisibleToUser) {
            // TODO: オンスクリーン
            Log.d("","オンスクリーン")
        }
    }

}
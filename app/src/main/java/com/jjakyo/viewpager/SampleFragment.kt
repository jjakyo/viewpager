package com.jjakyo.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SampleFragment : Fragment() {

    private var title: String? = null
    private var content: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            // 값 부여
            title = it.getString("title", "타이틀 테스트")
            content = it.getString("content", "콘텐츠 테스트")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sample, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val title = view.findViewById<TextView>(R.id.title)
        val content = view.findViewById<TextView>(R.id.content)

        title.text = this.title
        content.text = this.content
    }

    // newInstance 에서 번들 형태로 초기화
    companion object {
        fun newInstance(dataSet: SampleData) =
            SampleFragment().apply {
                arguments = Bundle().apply {
                    putString("title", dataSet.title)
                    putString("content", dataSet.content)
                }
            }
    }
}
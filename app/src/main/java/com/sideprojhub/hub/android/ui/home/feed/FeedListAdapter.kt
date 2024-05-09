package com.sideprojhub.hub.android.ui.home.feed

import android.content.Context
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.RequestManager
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.ItemFeedBinding
import com.sideprojhub.hub.android.dto.Feed
import javax.inject.Inject
import kotlin.math.abs

class FeedListAdapter @Inject constructor(
    val glide: RequestManager,
    val data: List<Feed.Post>,
    val context: Context
) : RecyclerView.Adapter<FeedListAdapter.ViewHolder>() {

    private var clickListener : OnClickListener? = null

    interface OnClickListener {

        fun setCommentingClickListener()
        fun setMoreCommentClickListener()
        fun setMoreTagClickListener(data: List<Feed.ReactedPerson>)
        fun setMoreFavoriteClickListener(data: List<Feed.ReactedPerson>)
        fun setAddFavoriteClickListener()

    }

    fun setOnClickListener(listener: OnClickListener) {
        this.clickListener = listener
    }

    inner class ViewHolder(val binding: ItemFeedBinding) : RecyclerView.ViewHolder(binding.root) {

        init {




        }

        fun bind() {
            val post = data[adapterPosition]

            binding.data = post

            val contents = "<b>${post.writerName}</b> " + post.contents
            binding.tvContents.text = Html.fromHtml(contents, Html.FROM_HTML_MODE_LEGACY)


//            작성자 정보
            glide.load(post.writerProfile).error(R.drawable.ic_default_profile).circleCrop()
                .into(binding.ivProfile)

            if (post.imageList.isNullOrEmpty()) {
                binding.imageSlider.visibility = View.GONE
                binding.layoutImageCount.visibility = View.GONE
            } else {
                binding.imageSlider.offscreenPageLimit = 1
                binding.imageSlider.adapter = FeedViewPagerAdapter(glide, post.imageList)
                val adapter = binding.imageSlider.adapter as FeedViewPagerAdapter
                binding.tvCurrentImageNumber.text = "1"
                binding.tvTotalImage.text = adapter.itemCount.toString()

                binding.imageSlider.registerOnPageChangeCallback(object :
                    ViewPager2.OnPageChangeCallback() {
                    override fun onPageSelected(position: Int) {
                        super.onPageSelected(position)
                        binding.tvCurrentImageNumber.text = position.plus(1).toString()
                    }
                })

                setViewPagerHeight(binding.imageSlider, post.imageRatio)

                binding.imageSlider.visibility = View.VISIBLE
                binding.layoutImageCount.visibility = View.VISIBLE
            }


            binding.tvTag.setOnClickListener {
                clickListener?.setMoreTagClickListener(post.tagMember)
            }

            binding.icHeart.setOnClickListener {
                clickListener?.setAddFavoriteClickListener()
            }

            binding.tvFavorite.setOnClickListener {
                clickListener?.setMoreFavoriteClickListener(post.favoriteMember)
            }

            binding.tvMoreComment.setOnClickListener {
                clickListener?.setMoreCommentClickListener()
            }

            binding.containerComment.setOnClickListener {
                clickListener?.setCommentingClickListener()
            }
        }

        private fun setViewPagerHeight(viewPager: ViewPager2, imageRatio: Float) {
            val metrics = viewPager.context.resources.displayMetrics
            val screenWidth = metrics.widthPixels.toFloat()

            // 가장 큰 비율을 기준으로 뷰페이저의 높이를 계산
            val viewPagerHeight = (screenWidth / imageRatio).toInt()

            // 뷰페이저의 높이를 설정
            val layoutParams = viewPager.layoutParams
            layoutParams.height = viewPagerHeight
            viewPager.layoutParams = layoutParams
        }

        private fun findBestRatio(width: Int, height: Int): Float {
            val inputRatio = width.toFloat() / height.toFloat()
            val ratios = listOf(1f, 4f / 3, 3f / 4, 16f / 9)

            var bestRatio = 0f
            var minDifference = Float.MAX_VALUE

            for (ratio in ratios) {
                val difference = abs(inputRatio - ratio)
                if (difference < minDifference) {
                    minDifference = difference
                    bestRatio = ratio
                }
            }

            return bestRatio
        }

//            TODO(
//                        "2. createdAt, updatedAt" +
//                        "3. contents 개시글 내용 이름 bold랑 텍스트 붙여야 함." +
//                        "4. imageList 개시글 이미지 viewpager" +
//                        "5. ",
//            )

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder = DataBindingUtil.inflate<ItemFeedBinding>(
        LayoutInflater.from(parent.context),
        R.layout.item_feed,
        parent,
        false
    ).let {
        ViewHolder(it)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

}
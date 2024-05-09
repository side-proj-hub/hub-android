package com.sideprojhub.hub.android.dto

data class Feed(
    val post: Post
) {
    data class Post(
//        작성자 정보
        val writerName: String,
        val writerProfile: String?,
        val writerTeam: String,

//        소속 동호회 정보
        val clubName: String,

//        게시글 정보
        val createdAt: String,
        val updatedAt: String,
        val postType: String, // 게시글, 투표, 공지 등등

//        게시글 내용
        val contents: String,
        val imageList: List<String>?,
        val _imageRatio: String,

//        게시글 부가 정보
        val tagMember: List<ReactedPerson> = listOf(),         // 태그된 사람
        val favoriteMember: List<ReactedPerson> = listOf(),    // 좋아요 누른 사람
        val comment: List<Comment> = listOf(),

//        내가 좋아요 눌렀는지
        var isFavorite: Boolean
    ) {
        val imageRatio: Float
            get() {
                return when (_imageRatio) {
                    "1:1" -> 1f
                    "4:3" -> 4f / 3
                    "3:4" -> 3f / 4
                    "16:9" -> 16f / 9
                    else -> 1f
                }
            }

    }


    data class Comment(
        val writer: String,     // 작성자
        val profile: String,    // 프로필 이미지
        val team: String,       // 소속 팀
        val detail: String      // 댓글
    )

    data class ReactedPerson(
        val name: String,       // 김미정
        val profile: String,    // 프로필 이미지
        val team: String,       // 디자인팀
        val club: String,       // 디스이즈컴페티션
    )
}

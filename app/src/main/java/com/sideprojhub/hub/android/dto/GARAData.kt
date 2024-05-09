package com.sideprojhub.hub.android.dto

val feed: List<Feed.Post> = listOf(
    Feed.Post(
        writerName = "1번 작성자",
        writerProfile = "https://cdn.pixabay.com/photo/2021/06/25/13/22/girl-6363743_1280.jpg",
        writerTeam = "1번 팀",

        clubName = "1번 동호회",

        createdAt = "",
        updatedAt = "",
        postType = "게시글",

        contents = "What is Lorem Ipsum?\n" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum",
        imageList = listOf(
            "https://cdn.pixabay.com/photo/2014/09/26/10/09/track-462121_1280.jpg",
            "https://cdn.pixabay.com/photo/2015/12/01/20/28/road-1072823_1280.jpg",
            "https://cdn.pixabay.com/photo/2017/02/01/22/02/mountain-landscape-2031539_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/05/05/02/37/sunset-1373171_1280.jpg",
            "https://cdn.pixabay.com/photo/2023/12/06/08/41/mountain-8433234_1280.jpg",
        ),
        _imageRatio = "3:4",

        tagMember = listOf(
            Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ), Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ),
            Feed.ReactedPerson(
                name = "2번 태그된 사람",
                team = "2번 팀",
                club = "2번 동호회",
                profile = "https://cdn.pixabay.com/photo/2021/02/22/12/25/portrait-6040015_1280.jpg"
            ),
        ),
        favoriteMember = listOf(
            Feed.ReactedPerson(
                name = "1번 좋아한 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2017/02/20/22/17/horse-2084060_1280.jpg"
            ),
            Feed.ReactedPerson(
                name = "2번 좋아한 사람",
                team = "2번 팀",
                club = "2번 동호회",
                profile = "https://cdn.pixabay.com/photo/2022/10/14/07/12/muslim-7520627_1280.jpg"
            )
        ),
        comment = listOf(
            Feed.Comment(
                writer = "1번 댓글 작성자",
                profile = "https://cdn.pixabay.com/photo/2015/01/08/18/25/desk-593327_1280.jpg",
                team = "1번 팀",
                detail = "아싸 댓글 1빠"
            ),
            Feed.Comment(
                writer = "2번 댓글 작성자",
                profile = "https://cdn.pixabay.com/photo/2016/11/29/09/16/architecture-1868667_1280.jpg",
                team = "2번 팀",
                detail = "까비 2빠"
            ),
        ),

        isFavorite = true,
    ),

    Feed.Post(
        writerName = "2번 작성자",
        writerProfile = "https://cdn.pixabay.com/photo/2019/11/03/20/11/portrait-4599553_1280.jpg",
        writerTeam = "2번 팀",

        clubName = "2번 동호회",

        createdAt = "",
        updatedAt = "",
        postType = "게시글",

        contents = "Where does it come from?\n" +
                "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.",
        imageList = listOf(),

        tagMember = listOf(
            Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ),
            Feed.ReactedPerson(
                name = "2번 태그된 사람",
                team = "2번 팀",
                club = "2번 동호회",
                profile = "https://cdn.pixabay.com/photo/2021/02/22/12/25/portrait-6040015_1280.jpg"
            ),
        ),
        favoriteMember = listOf(
            Feed.ReactedPerson(
                name = "1번 좋아한 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2017/02/20/22/17/horse-2084060_1280.jpg"
            ),
            Feed.ReactedPerson(
                name = "2번 좋아한 사람",
                team = "2번 팀",
                club = "2번 동호회",
                profile = "https://cdn.pixabay.com/photo/2022/10/14/07/12/muslim-7520627_1280.jpg"
            )
        ),
        _imageRatio = "1f",
        comment = listOf(
            Feed.Comment(
                writer = "1번 댓글 작성자",
                profile = "https://cdn.pixabay.com/photo/2015/01/08/18/25/desk-593327_1280.jpg",
                team = "1번 팀",
                detail = "아싸 댓글 1빠"
            ),
            Feed.Comment(
                writer = "2번 댓글 작성자",
                profile = "https://cdn.pixabay.com/photo/2016/11/29/09/16/architecture-1868667_1280.jpg",
                team = "2번 팀",
                detail = "까비 2빠"
            ),
        ),
        isFavorite = false,
    ),

    Feed.Post(
        writerName = "3번 작성자",
        writerProfile = "https://cdn.pixabay.com/photo/2019/11/03/20/11/portrait-4599553_1280.jpg",
        writerTeam = "3번 팀",

        clubName = "3번 동호회",

        createdAt = "",
        updatedAt = "",
        postType = "게시글",

        contents = "Why do we use it?\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        imageList = listOf(
            "https://cdn.pixabay.com/photo/2015/09/09/18/08/race-932254_1280.jpg",
            "https://cdn.pixabay.com/photo/2013/11/14/20/52/sports-210661_1280.jpg",
            "https://cdn.pixabay.com/photo/2017/06/02/14/43/marathon-2366475_1280.jpg",
        ),

        tagMember = listOf(
            Feed.ReactedPerson(
                name = "1번 태그된 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2019/11/29/21/30/girl-4662158_1280.jpg"
            ),
            Feed.ReactedPerson(
                name = "2번 태그된 사람",
                team = "2번 팀",
                club = "2번 동호회",
                profile = "https://cdn.pixabay.com/photo/2021/02/22/12/25/portrait-6040015_1280.jpg"
            ),
        ),
        favoriteMember = listOf(
            Feed.ReactedPerson(
                name = "1번 좋아한 사람",
                team = "1번 팀",
                club = "1번 동호회",
                profile = "https://cdn.pixabay.com/photo/2017/02/20/22/17/horse-2084060_1280.jpg"
            ),
            Feed.ReactedPerson(
                name = "2번 좋아한 사람",
                team = "2번 팀",
                club = "2번 동호회",
                profile = "https://cdn.pixabay.com/photo/2022/10/14/07/12/muslim-7520627_1280.jpg"
            )
        ),
        _imageRatio = "16:9",
        comment = listOf(
            Feed.Comment(
                writer = "1번 댓글 작성자",
                profile = "https://cdn.pixabay.com/photo/2015/01/08/18/25/desk-593327_1280.jpg",
                team = "1번 팀",
                detail = "아싸 댓글 1빠"
            ),
            Feed.Comment(
                writer = "2번 댓글 작성자",
                profile = "https://cdn.pixabay.com/photo/2016/11/29/09/16/architecture-1868667_1280.jpg",
                team = "2번 팀",
                detail = "까비 2빠"
            ),
        ),
        isFavorite = false,
    )
)
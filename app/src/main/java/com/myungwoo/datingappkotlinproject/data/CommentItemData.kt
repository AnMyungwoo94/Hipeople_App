package com.myungwoo.datingappkotlinproject.data

// 댓글 데이터 클래스
data class CommentItemData(
    var key: String = "",
    var tvAuthor: String = "",
    var tvComment: String = "",
    val tvWriterUid: String = ""
)
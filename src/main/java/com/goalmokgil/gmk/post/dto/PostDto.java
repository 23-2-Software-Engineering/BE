package com.goalmokgil.gmk.post.dto;

import com.goalmokgil.gmk.course.entity.CourseData;
import com.goalmokgil.gmk.post.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

    private Long memberId; // 게시글을 작성한 사용자의 ID
    private Set<Long> courseIds; // 관련 코스의 ID들
    private String title; // 게시글 제목
    private String content; // 게시글 내용
    private CourseData courseData;
    private Date createdDate;
    private Date modifiedDate;

    public PostDto(Long memberId, Set<Long> courseIds, String title, String content, CourseData courseData, Date createdDate, Date modifiedDate) {
        this.memberId = memberId;
        this.courseIds = courseIds;
        this.title = title;
        this.content = content;
        this.courseData = courseData;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}

package com.goalmokgil.gmk.post.entity;

import jakarta.persistence.Entity;
import com.goalmokgil.gmk.account.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@Table(name = "post_likes") // 예약어 피하기
public class Likes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId")
    private Post post;


    public Likes(Member member, Post post) {
        this.member = member;
        this.post = post;
    }
}
package com.haservi.kotlinoauth2.global.entity

import org.hibernate.annotations.Comment
import org.hibernate.annotations.CreationTimestamp
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseTime {

    @Comment("사용여부(0:사용, 9:미사용)")
    var useYn: Int? = 0

    @CreationTimestamp
    @Comment("생성 시각")
    var createdDate: LocalDateTime? = null

    @CreationTimestamp
    @LastModifiedDate
    @Comment("수정 시각")
    var updatedDate: LocalDateTime? = null
}
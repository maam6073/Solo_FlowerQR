package com.sujung.flowerQR.common;

import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @CreatedDate
    @ColumnDefault("CURRENT_TIMESTAMP()")
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createAt = LocalDateTime.now();

    @LastModifiedDate
    @ColumnDefault("CURRENT_TIMESTAMP()")
    @Column(name = "last_modified_at", nullable = false)
    private LocalDateTime lastModifiedAt = LocalDateTime.now();
}

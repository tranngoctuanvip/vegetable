package com.thuanthanh.vegetables.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "emailcontact", length = 50)
    private String emailContact; // email liên hệ
    @Column(name = "contentContact")
    private String contentContact; // nội dung
    @Column(name = "replycontent")
    private String replyContent; //phản hồi
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
    private Date contactDate; //ngày liên hệ
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
    private Date replyDate; //ngày phản hồi

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}

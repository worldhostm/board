package com.study.domain.post;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostResponse {

    private Long id;                       // PK
    private String title;                  // ����
    private String content;                // ����
    private String writer;                 // �ۼ���
    private int viewCnt;                   // ��ȸ ��
    private Boolean noticeYn;              // ������ ����
    private Boolean deleteYn;              // ���� ����
    private LocalDateTime createdDate;     // �����Ͻ�
    private LocalDateTime modifiedDate;    // ���� �����Ͻ�

}
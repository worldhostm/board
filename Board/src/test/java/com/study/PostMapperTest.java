package com.study;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.study.common.dto.SearchDto;
import com.study.domain.post.PostMapper;
import com.study.domain.post.PostRequest;
import com.study.domain.post.PostResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PostMapperTest {

    @Autowired
    PostMapper postMapper;

//    @Test
//    void save() {
//        PostRequest params = new PostRequest();
//        params.setTitle("1�� �Խñ� ����");
//        params.setContent("1�� �Խñ� ����");
//        params.setWriter("�׽���");
//        params.setNoticeYn(false);
//        postMapper.save(params);
//
//        List<PostResponse> posts = postMapper.findAll();
//        System.out.println("��ü �Խñ� ������ : " + posts.size() + "���Դϴ�.");
//    }
//
//    @Test
//    void update() {
//        // 1. �Խñ� ����
//        PostRequest params = new PostRequest();
//        params.setId(1L);
//        params.setTitle("1�� �Խñ� ���� �����մϴ�.");
//        params.setContent("1�� �Խñ� ���� �����մϴ�.");
//        params.setWriter("������");
//        params.setNoticeYn(true);
//        postMapper.update(params);
//
//        // 2. �Խñ� ������ ��ȸ
//        PostResponse post = postMapper.findById(1L);
//        try {
//            String postJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(post);
//            System.out.println(postJson);
//
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    
//    @Test
//    void delete() {
//        System.out.println("���� ������ ��ü �Խñ� ������ : " + postMapper.findAll(SearchDto dto).size() + "���Դϴ�.");
//        postMapper.deleteById(1L);
//        System.out.println("���� ������ ��ü �Խñ� ������ : " + postMapper.findAll(SearchDto dto).size() + "���Դϴ�.");
//    }
}
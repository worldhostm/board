package com.study.domain.post;

import org.apache.ibatis.annotations.Mapper;

import com.study.common.dto.SearchDto;

import java.util.List;

@Mapper
public interface PostMapper {

    /**
     * �Խñ� ����
     * @param params - �Խñ� ����
     */
    void save(PostRequest params);

    /**
     * �Խñ� ������ ��ȸ
     * @param id - PK
     * @return �Խñ� ������
     */
    PostResponse findById(Long id);
    
    /**
     *	 �Խñ� ����
     * @param params - �Խñ� ����
     */
    void update(PostRequest params);

    /**
     * �Խñ� ����
     * @param id - PK
     */
    void deleteById(Long id);

    /**
     * �Խñ� �� ī����
     * @return �Խñ� ��
     */
    int count();
    /**
     * 게시글 리스트 조회
     * @return 게시글 리스트
     */
    List<PostResponse> findAll(SearchDto params);
    
    List<PostResponse> findAllpost(PostResponse params);

    /**
     * 게시글 수 카운팅
     * @return 게시글 수
     */
    int count(SearchDto params);

}
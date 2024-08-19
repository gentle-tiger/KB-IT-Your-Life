package org.example.dto.post;

import lombok.RequiredArgsConstructor;
import org.example.mapper.PostMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@RequiredArgsConstructor
public class PostRepository {
    private final PostMapper postMapper;


    public List<PostDto> findAll(){
        return postMapper.findAll();
    };

    public List<PostDto> findByCondition(String title, String content){
        return postMapper.findByCondition(title, content);
    }
    // 게시글 삭제
    public int delete(Long id) {
        return postMapper.delete(id);
    }
}

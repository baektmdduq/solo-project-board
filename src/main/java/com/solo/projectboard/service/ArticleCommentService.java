package com.solo.projectboard.service;

import com.solo.projectboard.dto.ArticleCommentDto;
import com.solo.projectboard.repository.ArticleCommentRepository;
import com.solo.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

  private final ArticleRepository articleRepository;
  private final ArticleCommentRepository articleCommentRepository;

  @Transactional(readOnly = true)
  public List<ArticleCommentDto> searchArticleComments(long l) {
    return List.of();
  }

  public void saveArticleComment(ArticleCommentDto dto) {
  }

  public void updateArticleComment(ArticleCommentDto dto) {
  }

  public void deleteArticleComment(Long articleCommentId) {
  }
}

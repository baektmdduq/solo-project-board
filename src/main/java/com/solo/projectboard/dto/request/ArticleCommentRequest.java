package com.solo.projectboard.dto.request;

import com.solo.projectboard.dto.ArticleCommentDto;
import com.solo.projectboard.dto.UserAccountDto;

public record ArticleCommentRequest(Long articleId, String content) {

  public static ArticleCommentRequest of(Long articleId, String content){
    return new ArticleCommentRequest(articleId, content);
  }

  public ArticleCommentDto toDto(UserAccountDto userAccountDto) {
    return ArticleCommentDto.of(
            articleId,
            userAccountDto,
            content
    );
  }
}
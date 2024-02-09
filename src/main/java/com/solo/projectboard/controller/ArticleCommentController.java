package com.solo.projectboard.controller;

import com.solo.projectboard.dto.UserAccountDto;
import com.solo.projectboard.dto.request.ArticleCommentRequest;
import com.solo.projectboard.dto.security.BoardPrincipal;
import com.solo.projectboard.service.ArticleCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@RequestMapping("/comments")
@Controller
public class ArticleCommentController {

  private final ArticleCommentService articleCommentService;

  @PostMapping ("/new")
  public String postNewArticleComment(
          @AuthenticationPrincipal BoardPrincipal boardPrincipal,
          ArticleCommentRequest articleCommentRequest
  ) {
    articleCommentService.saveArticleComment(articleCommentRequest.toDto(boardPrincipal.toDto()));

    return "redirect:/articles/" + articleCommentRequest.articleId();
  }

  @PostMapping ("/{commentId}/delete")
  public String deleteArticleComment(
          @PathVariable(name="commentId") Long commentId,
          @AuthenticationPrincipal BoardPrincipal boardPrincipal,
          @RequestParam(name="articleId")Long articleId
  ) {
    articleCommentService.deleteArticleComment(commentId, boardPrincipal.getUsername());

    return "redirect:/articles/" + articleId;
  }

}

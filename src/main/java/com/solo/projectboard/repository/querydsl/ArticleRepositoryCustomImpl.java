package com.solo.projectboard.repository.querydsl;

import com.solo.projectboard.domain.Article;
import com.solo.projectboard.domain.QArticle;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class ArticleRepositoryCustomImpl extends QuerydslRepositorySupport implements ArticleRepositoryCustom {

  public ArticleRepositoryCustomImpl() {
    super(Article.class);
  }

  @Override
  public List<String> findAllDistinctHashtags() {
    QArticle article = QArticle.article;

    return from(article)
            .distinct()
            .select(article.hashtag)
            .where(article.hashtag.isNotNull())
            .fetch();
  }
}

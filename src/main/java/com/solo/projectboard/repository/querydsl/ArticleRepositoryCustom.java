package com.solo.projectboard.repository.querydsl;

import java.util.List;

public interface ArticleRepositoryCustom {
  List<String> findAllDistinctHashtags();
}

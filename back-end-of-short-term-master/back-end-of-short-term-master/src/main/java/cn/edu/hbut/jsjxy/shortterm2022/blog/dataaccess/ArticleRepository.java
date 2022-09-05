package cn.edu.hbut.jsjxy.shortterm2022.blog.dataaccess;

import cn.edu.hbut.jsjxy.shortterm2022.blog.entity.Article;
import cn.edu.hbut.jsjxy.shortterm2022.blog.entity.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    @Transactional
    void deleteByTitle(String title);

    @Query(value = "update article set title=?1,content=?2 where user_id = ?3 and title=?4 and content=?5", nativeQuery = true)
    @Modifying
    @Transactional
    int updateArticle(String title, String content, Long userId,String oldTitle,String oldContent);
}

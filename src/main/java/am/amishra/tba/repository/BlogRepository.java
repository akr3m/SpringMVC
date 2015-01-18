package am.amishra.tba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import am.amishra.tba.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}

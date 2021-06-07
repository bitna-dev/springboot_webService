package com.jojoldu.book.springboot.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long>{
    //springDataJpa에서 제공하지않는 메소드는 아래와 같이 작성가능
    @Query("SELECT p FROM Posts p order by p.id DESC")
    List<Posts> findAllDesc();

}

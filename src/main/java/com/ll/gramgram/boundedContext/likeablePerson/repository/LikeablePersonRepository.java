package com.ll.gramgram.boundedContext.likeablePerson.repository;

import com.ll.gramgram.boundedContext.likeablePerson.entity.LikeablePerson;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeablePersonRepository extends JpaRepository<LikeablePerson, Integer> {
    List<LikeablePerson> findByFromInstaMemberId(Long fromInstaMemberId);
    Optional<LikeablePerson> findById(Long fromInstaMemberId);
    Optional<LikeablePerson> deleteById(Long fromInstaMemberId);


    LikeablePerson findByFromInstaMemberIdAndToInstaMember_username(long l, String username);
}

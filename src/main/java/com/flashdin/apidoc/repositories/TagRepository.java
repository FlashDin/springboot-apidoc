package com.flashdin.apidoc.repositories;

import com.flashdin.apidoc.pojos.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
}

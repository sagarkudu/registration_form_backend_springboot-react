package com.user.forms.repository;

import com.user.forms.model.Fields;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Fields, Long> {


}

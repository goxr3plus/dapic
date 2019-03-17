package com.intralot.dapic.repository;

import com.intralot.dapic.model.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface SettingRepository extends JpaRepository<Setting, Long> {

    @Procedure(procedureName = "test")
    int getDouble(@Param("value") int personId);
}

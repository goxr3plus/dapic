package com.intralot.dapic.repository;

import com.intralot.dapic.model.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SettingRepository extends JpaRepository<Setting, Long> {

}

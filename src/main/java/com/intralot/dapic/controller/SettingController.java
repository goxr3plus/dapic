package com.intralot.dapic.controller;

import com.intralot.dapic.exception.ResourceNotFoundException;
import com.intralot.dapic.model.Setting;
import com.intralot.dapic.repository.SettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class SettingController {

    @Autowired
    SettingRepository settingRepository;

    @GetMapping("/settings")
    public List<Setting> getAllSettings() {
        return settingRepository.findAll();
    }


    @GetMapping("/setting/{id}")
    public boolean getAllNotes(@PathVariable(value = "id") int settingId) {
        return settingRepository.getSetting(settingId);
    }

    @GetMapping("/settings/{id}")
    public Setting getSettingsById(@PathVariable(value = "id") Long settingId) {
        return settingRepository.findById(settingId)
                .orElseThrow(() -> new ResourceNotFoundException("Settings", "id", settingId));
    }

}

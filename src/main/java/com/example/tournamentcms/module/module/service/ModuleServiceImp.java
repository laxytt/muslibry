package com.example.tournamentcms.module.module.service;

import com.example.tournamentcms.module.module.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tournamentcms.module.module.model.Module;

import java.util.List;

@Service
public class ModuleServiceImp implements ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    @Override
    public List<Module> findAll() {
        return moduleRepository.findAll();
    }

}

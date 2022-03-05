package com.tuanlm.medicine.service;

import com.tuanlm.medicine.entity.BlogUserEntity;
import com.tuanlm.medicine.repository.BlogUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogUserService {

    private final BlogUserRepository userRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogUserService.class);

    public BlogUserService(BlogUserRepository userRepository) {
        this.userRepository = userRepository;
    }

}

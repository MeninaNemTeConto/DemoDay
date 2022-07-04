package com.example.demo.model.service;
import com.example.demo.model.entity.Newsletter;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NewsletterService {

    Newsletter saveNewsletter (Newsletter newsletter);

    List<Newsletter> fetchNewsletterList();

    void deleteNewsletterById(Long newsletterId);

    List<Newsletter> findByEmail (String email);

}

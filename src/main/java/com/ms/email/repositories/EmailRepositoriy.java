package com.ms.email.repositories;

import com.ms.email.entities.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmailRepositoriy extends JpaRepository<EmailModel, UUID> {
}

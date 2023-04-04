package com.ms.email.controllers;

import com.ms.email.dtos.EmailDTO;
import com.ms.email.entities.EmailModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ms.email.services.EmailService;

import javax.validation.Valid;

@RestController
public class EmailController {
    @Autowired
    private EmailService service;

    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> enviarEmail(@RequestBody @Valid EmailDTO emailDTO){
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDTO,emailModel);
        service.enviarEmail(emailModel);
        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }
}

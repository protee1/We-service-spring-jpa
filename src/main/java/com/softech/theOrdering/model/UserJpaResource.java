package com.softech.theOrdering.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserJpaResource {
@Autowired
private UserDaoService service;
}

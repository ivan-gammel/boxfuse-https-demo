package com.esoftworks.oss.boxfusehttps.web;

import com.esoftworks.oss.boxfusehttps.web.resources.Status;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public Status status() {
        return new Status();
    }

}

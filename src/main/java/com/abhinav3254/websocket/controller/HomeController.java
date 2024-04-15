//Controller layer for testing
// websocket connection
package com.abhinav3254.websocket.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller class for handling web requests.
 */
@Controller
public class HomeController {

    /**
     * Handles GET requests to the "/" endpoint.
     *
     * @return View name for the client page.
     */
    @GetMapping("/index")
    public String index() {
        System.out.println("index");
        return "client";
    }
}
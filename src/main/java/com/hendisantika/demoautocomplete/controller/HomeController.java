package com.hendisantika.demoautocomplete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * Created by IntelliJ IDEA.
 * Project : demo-autocomplete
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/10/18
 * Time: 14.43
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class HomeController {
    String index(Model model){
        return "index";
    }
}

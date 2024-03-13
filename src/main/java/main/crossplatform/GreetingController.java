package main.crossplatform;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path="/api/hello")
public class GreetingController {

    @GetMapping
    public String hello(Model model) {
        String message = "Hello, world!";
        List<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");

        model.addAttribute("message", message);
        model.addAttribute("items", items);

        return "index";
    }
}

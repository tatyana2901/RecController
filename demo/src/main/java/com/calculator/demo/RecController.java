package com.calculator.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecController {
    @GetMapping("get_result")
    public String getResultPer(String a, String b, @RequestParam(name="operation") String operation, Model model) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        Rectangle rec = new Rectangle(x, y);
        int perim = (int) rec.perimeter();



        ///вввввв
        System.out.println(perim);
        int area = (int) rec.area();
        model.addAttribute("perim", perim);
        System.out.println(model.getAttribute("perim"));
        System.out.println(model.containsAttribute("perim"));
        return "result";
    }
}

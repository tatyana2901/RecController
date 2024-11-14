package com.calculator.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class RecController {
    public String getResultPer(String a, String b
            , @RequestParam(name = "operation", defaultValue = "****") String operation, Model model){



        model.addAttribute("res", res);



        return "result";

    }





/*    public String getResultFunc(String a, String b
            , @RequestParam(name = "operation", defaultValue = "****") String operation, Model model){
        System.out.println("a = " + a+ " b = "+b+ " operation = "+operation);
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            int res = CalcModel.calc(x, y, operation);
            model.addAttribute("res", res);
            System.out.println("res = " + res);
        }
        catch (NumberFormatException e){
            model.addAttribute("errorMsg", "здесь было не целое число");
        }
        catch (ArithmeticException e){
            model.addAttribute("errorMsg", "На ноль делить низя");
        } catch (Exception e) {
            model.addAttribute("errorMsg", e.getMessage());
        }
        return "result";
    }*/

    @GetMapping("/perimeter")
    public String calcPer(){
        System.out.println("периметр");
        return "result";
    }

    @GetMapping("/area")
    public String calcAr(){
        System.out.println("площадь");
        return "result";
    }
}

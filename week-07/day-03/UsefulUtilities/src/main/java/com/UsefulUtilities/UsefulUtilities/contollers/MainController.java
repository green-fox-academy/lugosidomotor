package com.UsefulUtilities.UsefulUtilities.contollers;
import com.UsefulUtilities.UsefulUtilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  UtilityService utilityService;

  @GetMapping("useful")
  public String showUsefulPage() {
    return "useful";
  }

  @GetMapping("useful/colored")
  public String showColoredPage(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("useful/email")
  public String showEamilPage(@RequestParam (name = "email") String emailParameter, Model model) {
    model.addAttribute("emailAsParameter", emailParameter);
    model.addAttribute("validateEmail", utilityService.emailValidation(emailParameter));
    return "email";
  }



  }
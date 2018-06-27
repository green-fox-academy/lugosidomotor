package com.UsefulUtilities.UsefulUtilities.contollers;
import com.UsefulUtilities.UsefulUtilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  UtilityService randomColor;

  @GetMapping("/useful")
  public String showUsefulPage() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String showColoredPage(Model model) {
    model.addAttribute("color", randomColor.randomColor());
    return "colored";
  }


}

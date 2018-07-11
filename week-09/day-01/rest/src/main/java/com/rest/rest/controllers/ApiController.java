package com.rest.rest.controllers;
import com.rest.rest.models.*;
import com.rest.rest.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ApiController {

  @Autowired
  AppService appService;

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer number) {
    if (number != null) {
      return (new DoubleModel(number));
    }
    return (new ErrorMessage("Please provide an input!"));
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (name != null && title != null) {
      return (new GreeterModel(name, title));
    } else if (name == null) {
      return (new ErrorMessage("Please provide a name!"));
    }
    return (new ErrorMessage("Please provide a title!"));
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable(value = "appendable", required = false) String append) {
    if (append != null) {
      return (new AppendA(append));
    }
    return "redirect:/404";
  }

  @PostMapping("/dountil/{what}")
  public Object dountil(@PathVariable(value = "what", required = false) String what, @RequestBody(required = false) DoUntil dountil) {
    if (what.equals("sum")) {
      return (new DoUntilResult(appService.sum(dountil.getUntil())));
    } else if (what.equals("factor")) {
      return (new DoUntilResult(appService.factor(dountil.getUntil())));
    }
    return (new ErrorMessage("Please provide a number!"));
  }


  @PostMapping("/arrays")
  public Object arrays(@RequestBody(required = false) Array array) {
    if (array.getWhat() != null) {
      return (new ErrorMessage("null array"));
    } else {
        if (array.getWhat().equals("sum")) {
        return (new ArrayResultInt(array.getWhat(), appService.sumNumbers(array.getNumbers())));
      } else if (array.getWhat().equals("multiply")) {
        return (new ArrayResultInt(array.getWhat(), appService.multiplyNumbers(array.getNumbers())));
      } else if (array.getWhat().equals("double")) {
        return (new ArrayResult(array.getWhat(), appService.doubleNumbers(array.getNumbers())));
      }
    }return (new ErrorMessage("Please provide a number!"));

  }
}


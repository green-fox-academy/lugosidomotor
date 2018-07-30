package com.pallidaretake.pallidaretake.controller;

import com.pallidaretake.pallidaretake.model.Warehouse;
import com.pallidaretake.pallidaretake.service.WarehouseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {

  @Autowired
  WarehouseServiceImpl warehouseService;

  @GetMapping("/")
  public String getIndexPageFromRoot(){
    return "redirect:/warehouse";
  }


  @GetMapping("/warehouse")
  public String getIndexPage(Model model){
    model.addAttribute("clothes",warehouseService.findAll());
    model.addAttribute("summary",warehouseService.findDistinctByItemName());
    return "warehouse";
  }


}

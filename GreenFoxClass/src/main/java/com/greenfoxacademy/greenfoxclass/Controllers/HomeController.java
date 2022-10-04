package com.greenfoxacademy.greenfoxclass.Controllers;

import com.greenfoxacademy.greenfoxclass.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    StudentService studentService;

    @Autowired
    public HomeController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String renderHomePage(Model model) {
        model.addAttribute("counter",studentService.count());
        return "index";
    }

    @GetMapping("/gfa/list")
    public String renderListPage(Model model) {
        model.addAttribute("list",studentService.findAll());
        return "list";
    }

    @PostMapping("/gfa/list")
    public String returnListPage(Model model) {
        model.addAttribute("list",studentService.findAll());
        return "list";
    }

    @GetMapping("/gfa/add")
    public String renderAddStudent(@ModelAttribute StudentService studentService) {

        return "add";
    }

    @GetMapping("/gfa/save")
    public String renderSavePage(Model model) {
        model.addAttribute("save", studentService.findAll());
        return "add";
    }

    @PostMapping("/gfa/save")
    public String returnAddStudent(@RequestParam String student) {
        studentService.save(student);
        return "add";
    }

    @PostMapping("/gfa/check")
    public String returnCheckStudent(@RequestParam String check) {
        if (studentService.check(check) == true) {
            return "yes";
        } else {
            return "no";
        }
    }
}

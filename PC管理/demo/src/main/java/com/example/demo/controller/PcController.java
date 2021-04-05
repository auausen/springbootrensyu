package com.example.demo.controller;

import com.example.demo.model.Pc;
import com.example.demo.service.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PcController {

    @Autowired
    private PcService pcService;

    //PC表示
    @GetMapping("/")
    public String ViewPc(Model model) {
        model.addAttribute("listPcs", pcService.getAllpcs());
        return "index";
    }

    @GetMapping("/showNewPcForm")
    public String showNewPcForm(Model model) {
        Pc pc = new Pc();
        model.addAttribute("pc", pc);
        return "new_pc";
    }

    @PostMapping("/savePc")
    public String savePc(@ModelAttribute("pc") Pc pc) {
        //データ保存
        pcService.savePc(pc);
        return "redirect:/";
    }

    @GetMapping("/showFormforUpdate/{id}")
    public String showFormforUpdate(@PathVariable(value = "id") long id, Model model) {

        //serviceよりPC情報取得
        Pc pc = pcService.getPcById(id);

        //入力？
        model.addAttribute("pc", pc);
        return "update_pc";
    }

    @GetMapping("/deletePc/{id}")
    public String deletePc(@PathVariable (value = "id") long id){
        //PC削除
        this.pcService.deletePcById(id);
        return "redirect:/";
    }


}

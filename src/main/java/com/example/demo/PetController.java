package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
public class PetController {

    @Autowired
    PetRepository petRepository;

    @RequestMapping("/mainpage")
    public String mainPage()
    {
        return "mainpage";
    }
    @RequestMapping("/detail")
    public String showPerson( Model model)
    {
        model.addAttribute ( "pets" ,petRepository.findAll (  ));

        return "petlist";
    }

    @RequestMapping("/")
    public String listPet(Model model)
    {
        model.addAttribute ( "pets",petRepository.findAll () );

        return "petlist";
    }

    @GetMapping("/add")
    public String addPet(Model model)
    {
        model.addAttribute ( "pet",new Pet() );

        return "petform";
    }

    @PostMapping("/process")
    public String processForm(@Valid Pet pet , BindingResult result)
    {
        System.out.println (result );
           if(result.hasErrors ())
           {
               return "petform";
           }
           petRepository.save ( pet );

           return "redirect:/";
    }

    @RequestMapping("/petdetail/{id}")
    public String showPet(@PathVariable("id") long id,Model model)
    {
        model.addAttribute ( "pet",petRepository.findOne ( id ) );

        return "petlist";
    }

    @RequestMapping("/update/{id}")
    public String updatePet(@PathVariable("id") long id,Model model)
    {
        model.addAttribute ("pet",petRepository.findOne ( id ) );

        return "petform";
    }

    @RequestMapping("/delete/{id}")

    public String delPet(@PathVariable("id") long id)
    {
        petRepository.delete ( id );

        return "redirect:/";
    }

}

package com.ipi.jva320.controller;

import com.ipi.jva320.exception.SalarieException;
import com.ipi.jva320.model.SalarieAideADomicile;
import com.ipi.jva320.repository.SalarieAideADomicileRepository;
import com.ipi.jva320.service.SalarieAideADomicileService;
import org.h2.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.*;

// HomeController.java :
@Controller
public class HomeController {

    @Autowired
    private SalarieAideADomicileService salarieAideADomicileService;

    @GetMapping(value = "/")
    public String home(final ModelMap model) throws Exception {

        if(salarieAideADomicileService.countSalaries() == 0){
            SalarieAideADomicile salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            salarie = new SalarieAideADomicile("Paul BAYET", LocalDate.now(), LocalDate.now(), 10, 0, 80, 5, 1);
            salarieAideADomicileService.creerSalarieAideADomicile(salarie);
        }

        model.put("salarieCount", salarieAideADomicileService.countSalaries());

        return "home";
    }

    @GetMapping(value = "/salaries")
    public String listSalarie(@RequestParam("page") Long page, @RequestParam("size") Long size, final ModelMap model) throws Exception {

        long nbSalarie = salarieAideADomicileService.countSalaries();
        model.put("salarieCount", (int) nbSalarie);

        List<SalarieAideADomicile> salaries = salarieAideADomicileService.getSalaries();
        salaries.sort(Comparator.comparing(SalarieAideADomicile::getNom));

        int nbPages = (int) Math.ceil((float) nbSalarie / size);
        int beginPage = (int) (size * page);
        int finishPage = (int) ((beginPage + size) - 1) > (nbSalarie - 1) ? (int) (nbSalarie - 1) : (int) ((beginPage + size) - 1);

        System.out.println(page);
        System.out.println(nbPages);

        model.put("salaries", salaries);
        model.put("page", page);
        model.put("nbPage", nbPages);
        model.put("size", size - 1);
        model.put("beginPage", beginPage);
        model.put("finishPage", finishPage);

        return "list";
    }

    @PostMapping(value = "/salaries")
    public String searchListSalarie(@RequestParam("nom") String nom, final ModelMap model) throws Exception {

        model.put("salarieCount", salarieAideADomicileService.countSalaries());

        List<SalarieAideADomicile> salaries = salarieAideADomicileService.getSalaries();

        model.put("salaries", salaries);

        return "redirect:/salarie?page=0&nom=" + nom;
    }

    @GetMapping(value = "/salaries/{id}")
    public String salarie(@PathVariable("id") Long id, final ModelMap model) throws Exception {

        boolean haveSalarie = true;

        model.put("salarieCount", salarieAideADomicileService.countSalaries());

        // use the id variable in your code
        SalarieAideADomicile salarie = salarieAideADomicileService.getSalarie(id);

        if(salarie != null){
            model.put("salarie", salarie);
        }else{
            haveSalarie = false;
        }

        System.out.println(haveSalarie);

        model.put("haveSalarie", haveSalarie);

        return "detail_Salarie";
    }

    @PostMapping(value = "/salaries/{id}")
    public String saveSalarie(@PathVariable("id") Long id, SalarieAideADomicile salary, final ModelMap model)  {

        model.put("salarieCount", salarieAideADomicileService.countSalaries());

        SalarieAideADomicile salarie = salarieAideADomicileService.getSalarie(id);
        List<String> errors = new ArrayList<String>();

        model.put("salarie", salarie);

        if(salary.getNom().isEmpty()) {
            errors.add("Le champ 'nom' ne peut pas être vide !");
        }

        if(errors.size() <= 0){

            try {
                salarieAideADomicileService.updateSalarieAideADomicile(salary);
            } catch (SalarieException e) {
                errors.add(e.getMessage());
                model.put("error", errors.size() > 0);
                model.put("errors", errors);
                throw new RuntimeException(e);
            }

        }else{

            model.put("error", errors.size() > 0);
            model.put("errors", errors);

        }

        return "detail_Salarie";

    }

    @GetMapping(value = "/salaries/new")
    public String newSalarie(final ModelMap model) throws Exception {

        model.put("salarieCount", salarieAideADomicileService.countSalaries());

        model.put("test", "ouiii");

        return "new_Salarie";

    }

    @PostMapping(value = "/salaries/new")
    public String saveNewSalarie(SalarieAideADomicile newSalary, final ModelMap model)  {

        model.put("salarieCount", salarieAideADomicileService.countSalaries());

        List<String> errors = new ArrayList<String>();

        if(newSalary.getNom().isEmpty()) {
            errors.add("Le champ 'nom' ne peut pas être vide !");
        }

        if(errors.size() <= 0){

            try {
                salarieAideADomicileService.creerSalarieAideADomicile(newSalary);
            } catch (SalarieException e) {
                errors.add(e.getMessage());
                model.put("error", errors.size() > 0);
                model.put("errors", errors);
                throw new RuntimeException(e);
            }

        }else{

            model.put("error", errors.size() > 0);
            model.put("errors", errors);

        }

        return "new_Salarie";

    }

    @GetMapping(value = "/salaries/{id}/delete")
    public String deleteSalarie(@PathVariable("id") Long id, final ModelMap model) throws Exception {

        model.put("salarieCount", salarieAideADomicileService.countSalaries());

        salarieAideADomicileService.deleteSalarieAideADomicile(id);

        return "redirect:/salaries?page=0&size=10&sortDirection=ASC&sortProperty=nom";
    }

    @GetMapping(value = "/salarie")
    public String searchSalarie(@RequestParam("nom") String nom, @RequestParam("page") Long page, final ModelMap model) throws Exception {

        List<SalarieAideADomicile> salaries = salarieAideADomicileService.getSalaries(nom);
        salaries.sort(Comparator.comparing(SalarieAideADomicile::getNom));

        long nbSalarie = salaries.stream().count();
        model.put("salarieCount", (int) nbSalarie);

        int nbPages = (int) Math.ceil((float) nbSalarie / 10);
        int beginPage = (int) (10 * page);
        int finishPage = (int) ((beginPage + 11) - 1) > (nbSalarie - 1) ? (int) (nbSalarie - 1) : (int) ((beginPage + 10) - 1);

        System.out.println(page);
        System.out.println(nbPages);

        model.put("salaries", salaries);
        model.put("page", page);
        model.put("nbPage", nbPages);
        model.put("size", 10 - 1);
        model.put("beginPage", beginPage);
        model.put("finishPage", finishPage);

        return "list";

    }
}
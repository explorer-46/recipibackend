package com.nestgigital.recipesbackendnew1.Controller;

import com.nestgigital.recipesbackendnew1.Dao.RecipesDao;
import com.nestgigital.recipesbackendnew1.Model.RecipesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipesController {
    @Autowired
    private RecipesDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addre",consumes = "application/json",produces = "application/json")
    public String addRecipes(@RequestBody RecipesModel recipes){
        dao.save(recipes);
        return "{status:'success'}";
    }

    @CrossOrigin(origins ="*")
    @GetMapping("/viewre")
    public List<RecipesModel> viewRecipes(){
        return (List<RecipesModel>) dao.findAll();

    }
}

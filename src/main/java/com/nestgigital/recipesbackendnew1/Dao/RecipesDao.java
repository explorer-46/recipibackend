package com.nestgigital.recipesbackendnew1.Dao;

import com.nestgigital.recipesbackendnew1.Model.RecipesModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipesDao extends CrudRepository<RecipesModel,Integer> {
}

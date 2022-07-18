package com.dawidkulikowski.gamelibrary.repo;

import com.dawidkulikowski.gamelibrary.model.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepo extends CrudRepository<Game,Integer> {

}

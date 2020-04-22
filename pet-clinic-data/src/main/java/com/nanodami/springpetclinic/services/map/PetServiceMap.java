package com.nanodami.springpetclinic.services.map;

import com.nanodami.springpetclinic.model.Pet;
import com.nanodami.springpetclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}

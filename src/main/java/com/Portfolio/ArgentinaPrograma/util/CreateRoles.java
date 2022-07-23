
package com.Portfolio.ArgentinaPrograma.util;


import com.Portfolio.ArgentinaPrograma.Security.Entity.Rol;
import com.Portfolio.ArgentinaPrograma.Security.Enums.RolNombre;
import com.Portfolio.ArgentinaPrograma.Security.Repository.RolRepository;
import com.Portfolio.ArgentinaPrograma.Security.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;




@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;
    @Autowired
    RolRepository rolRepository;

    @Override
    public void run(String... args) throws Exception {
            loadUser();
    }

    private void loadUser(){
        if(rolRepository.count()==0){
            createRoles();
        }
    }
    
    public void createRoles(){
        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
         
    }
}

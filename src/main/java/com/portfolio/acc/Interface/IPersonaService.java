package com.portfolio.acc.Interface;

import com.portfolio.acc.Entity.Persona;
import java.util.List;

/**
 *
 * @author Claudia
 */
public interface IPersonaService {
    
    /**
     *
     * @return
     */
    public List<Persona> getPersona();
    
    /**
     *
     * @param persona
     */
    public void savePersona(Persona persona);
    
    /**
     *
     * @param id
     */
    public void deletePersona(Long id);
    
    /**
     *
     * @param id
     * @return
     */
    public Persona findPersona(Long id);
    
}

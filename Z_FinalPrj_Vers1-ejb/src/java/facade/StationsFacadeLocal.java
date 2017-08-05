/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import entity.Stations;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author venky
 */
@Local
public interface StationsFacadeLocal {

    void create(Stations stations);

    void edit(Stations stations);

    void remove(Stations stations);

    Stations find(Object id);

    List<Stations> findAll();

    List<Stations> findRange(int[] range);

    int count();
    
}

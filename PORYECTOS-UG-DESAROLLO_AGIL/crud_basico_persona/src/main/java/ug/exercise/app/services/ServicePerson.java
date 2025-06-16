package ug.exercise.app.services;

import java.util.List;

import ug.exercise.domain.interfaces.IRepositoryInterface;
import ug.exercise.domain.model.Person;

public class ServicePerson {
    private final IRepositoryInterface repoInterface;

    public ServicePerson(IRepositoryInterface repoInterface){
        this.repoInterface=repoInterface;
    }

    public int registerRun(String name,int age,char sex){
        Person newPerson=new Person(age, 0, name, sex);
        repoInterface.save(newPerson);
        return  newPerson.getId();
    }

    public List<Person> getAllRun(){
        return repoInterface.getAll();
    }

    public Person searchByIdRun(int id){
        return repoInterface.searchId(id);
    }

    public boolean deleteRun(int id){
        return repoInterface.delete(id);
    }
}

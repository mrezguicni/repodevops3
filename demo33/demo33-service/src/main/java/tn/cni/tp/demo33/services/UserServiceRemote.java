package tn.cni.tp.demo33.services;

import javax.ejb.Remote;

import tn.cni.tp.demo33.entities.User;
import tn.cni.tp.demo33.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}

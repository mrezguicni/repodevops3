package tn.cni.tp.demo33.services;

import javax.ejb.Local;

import tn.cni.tp.demo33.entities.User;
import tn.cni.tp.demo33.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}

package yeniOdev;

import java.util.Calendar;

import Abstract.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		Calendar releaseDate = Calendar.getInstance();
		releaseDate.set(2005, 2, 16);

		Customer customer = new Customer(1, "Mehmet", "Erdemir", releaseDate, "21983489634");

		customerManager.save(customer);

	}

}

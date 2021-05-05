package concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService _customerCheckService;

	public void save(Customer customer) {

		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);

		} else {

			System.out.println("Not a valid person");
		}

	}

}

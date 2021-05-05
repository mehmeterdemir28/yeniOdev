package concrete;

import java.rmi.RemoteException;
import java.util.Calendar;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckMagaer implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		return true;

	}

}

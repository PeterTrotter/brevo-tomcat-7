package brevo;

import sendinblue.ApiClient;
import sendinblue.Configuration;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;


public class BrevoServlet extends HttpServlet {

	public void init(ServletConfig config) {
		ApiClient client = Configuration.getDefaultApiClient();
		if (client != null) {
			System.out.println("client initialised");
		}
	}

	public String getServletInfo() {
		return "brevo.BrevoServlet Information";
	}
}

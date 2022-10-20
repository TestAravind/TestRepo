import java.util.Objects;
 
public class ClassFileDemo {
    public static void main(String[] args) {
        System.out.println(new MessageGenerator().generateMessage("Aravind"));
    }
}
 
class MessageGenerator {
    public String generateMessage(String username) {
        if (Objects.nonNull(username))
            return "Hello" + username + "!";
        else
            return "Hello world!";
    }
}

class OWASPtest {
	//A01:2021 – Broken Access Control
    public brokenAccessControl() {
        PreparedStatement pStmt = null;
		String query = "insert into tablename values(?);

		pStmt = conn.prepareStatement(query);
		pStmt.setString(1, request.getParameter("desc"));
		pstmt.setString(1, request.getParameter("acct"));
		ResultSet results = pstmt.executeQuery();
		//pStmt.executeUpdate();
    }
	//A02:2021 – Cryptographic Failures
	//--CWE-261: Weak Encoding for Password
    public cryptographicFailures() {
        Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));
		String password = Base64.decode(prop.getProperty("password"));
		DriverManager.getConnection(url, usr, password);
    }
	//--CWE-321: Use of Hard-coded Cryptographic Key
    public boolean VerifyAdmin(String password) {
		if (password.equals("68af404b513073584c4b6f22b6c63e6b")) {
			System.out.println("Entering Diagnostic Mode...");
			return true;
		}
		System.out.println("Incorrect Password!");
		return false;
	}
	//--CWE-330: Use of Insufficiently Random Values
    public String GenerateReceiptURL(String baseUrl) {
		Random ranGen = new Random();
		ranGen.setSeed((new Date()).getTime());
		return(baseUrl + ranGen.nextInt(400000000) + ".html");
	}
	
	
	//A03:2021 – Injection
	//--CWE-20: Improper Input Validation
    public improperInputValidation() {
        public static final double price = 20.00;
		int quantity = currentUser.getAttribute("quantity");
		double total = price * quantity;
		chargeUser(total);
    }
	//A01:2021 – Broken Access Control
	//--CWE-89: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
    public SQLi() {
        String query = "SELECT account_balance FROM user_data WHERE user_name = "
             + request.getParameter("customerName");
		try (Connection connection = DriverManager.getConnection(jdbcUrl, jdbcProperties);
			Statement statement = connection.createStatement()) {
			statement.execute(query);
		}
	}
}



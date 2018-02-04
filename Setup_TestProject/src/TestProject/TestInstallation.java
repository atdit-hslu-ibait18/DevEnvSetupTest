package TestProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestInstallation {

	@Test
	void test_installation_status() {
		Installation _inst = new Installation();
		
		String _status = _inst.getInstallationStatus();
		
		String _expected_status = "Everything runs perfectly!!";
		
		assertEquals(_status, _expected_status);
	}

}

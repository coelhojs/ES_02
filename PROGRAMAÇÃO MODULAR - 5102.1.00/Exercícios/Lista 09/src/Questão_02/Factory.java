package Questão_02;

public class Factory {

	public TestCase factory(String key) {
		if (key == "DOM") {
			return new DOMBUILDERTEST();
		} else if (key == "XML") {
			return new XMLBuilderTest();
		} else {
			return null;
		}
	}
}

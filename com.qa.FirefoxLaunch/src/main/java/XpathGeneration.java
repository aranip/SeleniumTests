import org.openqa.selenium.By;

public class XpathGeneration {

	//input[@id ="{0}"]
	//input[@id ="{0}"] and @name ="{1}"]
	public static String createXpath(String xpathExp, Object ...args){
		for(int i =0; i<args.length; i++){
			xpathExp = xpathExp.replace("{"+i+"}", (CharSequence) args[i]);
		}
		return xpathExp;
	}
	
	public static By email = By.xpath(createXpath("//input[@name ='{0}']", "chitramale345@gmail.com"));
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x1 = createXpath("//input[@id ='{0}']", "test");
		System.out.println(x1);
		
		String x2 = createXpath("//input[@id ='{0}' and @name = '{1}']", "email","username");
		System.out.println(x2);
		String x3 = createXpath("//input[@id ='{0}' and @name = '{1}' and @type ='{2}']]", "email","username", "text");
		System.out.println(x3);
		System.out.println(email.toString().substring(email.toString().indexOf("//")));
	}

}

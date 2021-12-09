package WebAutomation.Daraz;

public class Xpaths {
	public static String firstCatagory             = "//span[contains(text(),'Electronic Accessories')]" ;
	public static String secondCatagory            = "//span[contains(text(),'Computer Accessories')]" ;
	public static String thirdCatagory             = "//span[contains(text(),'Power Cord & Adaptors')]" ;
	public static String firstproduct              = "//div[@data-qa-locator='product-item']"  ;                                          //   "//a[contains(text(),'Network Cable Tester RJ45 RJ11 Cat5 Cat6')]" ;
	public static String addToCart                 = "//span[contains(text(),'Add to Cart')]" ;
	public static String loginModal                = "//iframe[@class='login-iframe']" ;
	public static String userEmail                 = "//input[@placeholder='Please enter your Phone Number or Email']" ;
	public static String userPass                  = "//input[@type='password']" ;
	public static String modalLoginButton          = "//button[@type='submit']" ;
	public static String checkout                  = "//button[contains(text(),'CHECK OUT')]" ;
	public static String deliveryFullName          ="//input[@placeholder='Enter your first and last name']" ;
	public static String deliveryPhoneNumber       ="//input[@placeholder='Please enter your phone number']" ;
	public static String deliveryEmail             ="//input[@placeholder='Please enter your email']" ;
	public static String deliveryRegion            ="//span[contains(text(),'Please choose your region')]";
	public static String deliveryRegion_Dhaka      ="//li[@name='Dhaka']";		
	public static String deliveryCity              ="//span[contains(text(),'Please choose your city')]";
	public static String deliveryCity_DhakaSouth   ="//li[@name='Dhaka - South']";
	public static String deliveryArea              ="//span[contains(text(),'Please choose your area')]";
	public static String deliveryArea_Dhanmondi_10A="//li[@name='Dhanmondi 10A']";
	public static String deliveryAddress           ="//input[@placeholder='For Example: House# 123, Street# 123, ABC Road']";
	public static String deliveryTo_Home           ="//span[contains(text(),'HOME')]";
	public static String deliverySaveButton        ="//button[@type='submit']";
	public static String editShippingAddressButton ="//a[@class='address-edit automation-address-edit']";
	public static String addNewAddress             ="//a[contains(text(),'Add new address')]";
	public static String addressSaveButton         ="//button[contains(text(),'SAVE')]";
}

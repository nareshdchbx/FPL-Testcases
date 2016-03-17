		
		package com.TestSuite;
		
		
		import java.util.concurrent.TimeUnit;
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.testng.ITestContext;
		import org.testng.annotations.AfterMethod;
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.DataProvider;
		import org.testng.annotations.Test;
		
		import com.base.BaseClass;
		
		import com.businessutilities.ExcelUtilities;
		import com.dataprovider.ConfigManager;
		import com.pageFunctions.DcGovLoginPage;
		import com.pageFunctions.Securityqsnspage;
		import com.pageFunctions.UAT_CreateAccountFunc;
		import com.pageFunctions.additionaldetailsfunc;
		import com.pageFunctions.addpeoplefunc;
		import com.pageFunctions.annualincomefunc;
		import com.pageFunctions.appgrpmemdetailsfunc;
		import com.pageFunctions.appgrpmemxtradetailsfunc;
		import com.pageFunctions.bedroomsfunc;
		import com.pageFunctions.brokerdetailsfunc;
		import com.pageFunctions.commonelelmentsfunc;
		import com.pageFunctions.dependencyontaxreturnfunc;
		import com.pageFunctions.educationdetailsfunc;
		import com.pageFunctions.eligibilityresultsfunc;
		import com.pageFunctions.gettingstartedfunc;
		import com.pageFunctions.incomeadjustmentsfunc;
		import com.pageFunctions.incomedetailsfunc;
		import com.pageFunctions.incomeinfofunc;
		import com.pageFunctions.infoabtufunc;
		import com.pageFunctions.moreabtudetailsfunc;
		import com.pageFunctions.moreabtufunc;
		import com.pageFunctions.othermembersinappfunc;
		import com.pageFunctions.relationshipfunc;
		import com.pageFunctions.startappfunc;
		import com.pageFunctions.streetresifunc;
		import com.pageFunctions.submitappfunc;
		import com.pageFunctions.taxfilerfunc;
		import com.pageFunctions.taxfilestatusfunc;
		import com.pageFunctions.termsandconditionsfunc;
		import com.pageFunctions.yearhomebuiltfunc;
		import com.utilities.BusinessMethods;
		import com.utilities.LoggerClass;
		
		
		public class AdultVt3Siblings extends BaseClass {
		
			
			WebDriver d; 
			ConfigManager confMngr=new ConfigManager("App");
			
			UAT_CreateAccountFunc lgnpage;
				
				DcGovLoginPage lpage;
				Securityqsnspage secpage;
				startappfunc spage;
			gettingstartedfunc getting_started;
			commonelelmentsfunc common_elements;
			termsandconditionsfunc terms_conditions;
			infoabtufunc info_abtu;
			moreabtufunc moreinfo_abtu;
			moreabtudetailsfunc more_details;
			streetresifunc street_residence;
			yearhomebuiltfunc year_built;
			educationdetailsfunc education_details;
			bedroomsfunc bed_rooms;
			othermembersinappfunc othermembers_app;
			appgrpmemdetailsfunc groupmembers_app;
			appgrpmemxtradetailsfunc groupxtradetails_app;
			addpeoplefunc add_people;
			relationshipfunc relation_ship;
			taxfilerfunc tax_filer;
			taxfilestatusfunc taxfiler_status;
			dependencyontaxreturnfunc dependency_taxreturn;
			incomeinfofunc income_info;
			incomedetailsfunc income_details;
			incomeadjustmentsfunc income_adjustments;
			annualincomefunc annual_income;
			additionaldetailsfunc add_details;
			brokerdetailsfunc broker_details;
		     submitappfunc submit_app;
		     eligibilityresultsfunc eligibilty_results;
		     
			
		     @BeforeMethod
		 	
		 	public void bsateup(ITestContext context) throws InterruptedException
		 	{
		 		
		 		this.d=getdriver(confMngr.getProperty("BrowserName"));
		 		
		 		context.setAttribute("driver", d);	
		 		
		 		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 		
		 		d.get(confMngr.getProperty("APP.URL"));
		 		
		 		
		 		
		 		if(d.findElement(By.xpath("//button[contains(@title,'Close subscription dialog')]")).isDisplayed())
		 			d.findElement(By.xpath("//button[contains(@title,'Close subscription dialog')]")).click();
				
		lgnpage= new UAT_CreateAccountFunc(d);
				
				d.manage().window().maximize();
				
				
				lpage=new DcGovLoginPage(d);
				secpage = new Securityqsnspage(d);
				spage=new startappfunc(d);
				getting_started = new gettingstartedfunc(d);
				common_elements = new commonelelmentsfunc(d);
				terms_conditions = new termsandconditionsfunc(d);
				info_abtu = new infoabtufunc(d);
				moreinfo_abtu= new moreabtufunc(d);
				more_details = new moreabtudetailsfunc(d);
				street_residence = new streetresifunc(d);
				year_built = new yearhomebuiltfunc(d);
				education_details = new educationdetailsfunc(d);
				bed_rooms = new bedroomsfunc(d);
				othermembers_app = new othermembersinappfunc(d);
				groupmembers_app = new appgrpmemdetailsfunc(d);
				groupxtradetails_app = new appgrpmemxtradetailsfunc(d);
				add_people = new addpeoplefunc(d);
				relation_ship = new relationshipfunc(d);
				tax_filer = new taxfilerfunc(d);
				
				dependency_taxreturn = new dependencyontaxreturnfunc(d);
				income_info = new incomeinfofunc(d);
				income_details = new incomedetailsfunc(d);
				income_adjustments = new incomeadjustmentsfunc(d);
				annual_income = new annualincomefunc(d);
				add_details = new additionaldetailsfunc(d);
				broker_details = new brokerdetailsfunc(d);
				submit_app = new submitappfunc(d);
				eligibilty_results = new eligibilityresultsfunc(d);
				
				
			}
			
			public static java.util.logging.Logger logger = LoggerClass.getLogInstance();
			
			@Test(dataProvider = "testcase")
			public void testcase1(String pswd,String Lname,String dob,String sex, String addrl1,  String ct,  String st,String zip1,String elig,String enrlmnt,String newmem,String db1, String gndr1,String enrlt1,String db2, String gndr2,String enrlt2,String db3,String gndr3,String enrlt3,String rltn23,String rltn24,String rltn25,String rltn26,String rltn27,String rltn,String incmtyp,String empname,String strt,String citi,String ste,String zpcd,String amt,String freq,String stdate) throws Exception {
				
			
				String temp=BusinessMethods.getDynamicStr();
				String uname=temp+"@gmail.com";
				
				String Fname=temp;
				String ssn="5"+BusinessMethods.getRandomNumber(8);
				
				String temp4=BusinessMethods.getDynamicStr();
				String f1name=temp4;
				
				String ssn1="6"+BusinessMethods.getRandomNumber(8);
				
				String temp1=BusinessMethods.getDynamicStr();
				String f2name=temp1;
				
				String ssn2="6"+BusinessMethods.getRandomNumber(8);
				
				String temp2=BusinessMethods.getDynamicStr();
				String f3name=temp2;
				
				String ssn3="7"+BusinessMethods.getRandomNumber(8);
				
					
					logger.info("EMAIL: "+uname);
					logger.info("PassWord: "+pswd);
				
				
				lgnpage.CreateAccount(uname,pswd,Fname,Lname,dob,ssn,sex);
				
				 lpage.login(uname,pswd);
				
			    secpage.filing_ans1();
			
				 spage.click();
				 
				getting_started.click();
						
				common_elements.click();
				
				terms_conditions.click();
						
				common_elements.click();
				
				info_abtu.fillin(Fname, Lname,dob,sex,addrl1, st, ct, zip1,elig);
					
				moreinfo_abtu.fillin(ssn,enrlmnt);
						
				common_elements.click();
					
				street_residence.opt();
						
				year_built.opt();
				
				education_details.opt();
					
				bed_rooms.opt();
				
				common_elements.click();
								
				othermembers_app.fillin(newmem);
					
				groupmembers_app.fillin(f1name,Lname,db1,gndr1);
				
				groupxtradetails_app.fillin(ssn1,enrlt1);
					
				common_elements.click();
				
				add_people.yes_morepeople();
				
				groupmembers_app.fillin1(f2name,Lname,db2,gndr2);
			
				groupxtradetails_app.fillin1(ssn2,enrlt2);
				
				common_elements.click();
				
				add_people.yes_morepeople();
				
				groupmembers_app.fillin2(f3name,Lname,db3,gndr3);
			
				groupxtradetails_app.fillin2(ssn3,enrlt3);
			
				add_people.no_morepeople();
				
				relation_ship.fillin6(rltn23,rltn24,rltn25);
				
				relation_ship.fillin1(rltn26,rltn27);
						
				relation_ship.fillin(rltn);
					
				tax_filer.click();
						
				dependency_taxreturn.select1();
								
				dependency_taxreturn.select1();
				
				dependency_taxreturn.select1();
				
				common_elements.click();
				
				common_elements.click();
						
				income_info.yes_income();
				
				income_details.fillin(incmtyp,empname,strt,citi,ste,zpcd,amt,freq,stdate);
					
				common_elements.click();
				
				common_elements.click();
					
				income_info.no_income();
				
				income_info.no_income();
				
				income_info.no_income();
				
				common_elements.click();
			
				common_elements.click();
				
				add_details.fillin5();
					
				common_elements.click();
				
				common_elements.click();
				
				common_elements.click();
			
				common_elements.click();
				
				submit_app.fillin_app(Fname,Lname);
						
				eligibilty_results.click();
				
				midWait(3);
	
		
		}
	
	 @DataProvider (name="testcase")

	  public Object[][] reg() throws Exception
	  {
		  	
		   Object[][] testObjArray = ExcelUtilities.getTableArray2(".\\TestData\\FPL.xlsx","Sheet9", 2,35);
		   return (testObjArray);
		 	

			}
	
	@AfterMethod
		  public void afterMethod() {

			//   d.close();
			   
		}
	}





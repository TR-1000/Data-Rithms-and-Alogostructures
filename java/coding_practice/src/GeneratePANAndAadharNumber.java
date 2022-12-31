import java.util.Arrays;
import java.util.Scanner;

class GeneratePANAndAadharNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String PANNo = null;
        String aadharNo = null;
        String personName = scan.nextLine();
        Integer age = scan.nextInt();
        Long mobileNo = scan.nextLong();
        Person person = new Person(personName, age, mobileNo);

        if (validate(person)) {
            PANNo = generatePANNumber(person);
            aadharNo = generateAadharNumber(person);
            System.out.println("Success: Your PAN Number is:" + PANNo + " and Aadhar Number is:" + aadharNo + ".");

        } else {
            System.out.println("Error: Your PAN and Aadhar Number can't be generated.");
        }

        scan.close();

    }
    
    

    public static Boolean validate(Person person) {
    	// if name is empty
    	if(person.getName().trim().isEmpty()) {
    		System.out.println("Error: Provided Name/Age/MobileNo is Invalid.");
    		return false;
    	}
    	
    	// should only contain alphabets
    	if(person.getName().matches("^[a-zA-Z ]*$") == false) {
    		System.out.println("Error: Provided Name/Age/MobileNo is Invalid.");
    		return false;
    	}
    
    	
    	// each word in name is capitalized
    	String[] wordArray = person.getName().split(" ");
		for (String w : wordArray) {
			if(Character.isUpperCase(w.charAt(0))) {
				continue;
			} else {
				System.out.println("Error: Provided Name/Age/MobileNo is Invalid.");
				return false;
			}
		}
		
		// age must be 18-59
		if(person.getAge() < 18 || person.getAge() > 59) {
			System.out.println("Error: Provided Name/Age/MobileNo is Invalid.");
			return false;
		}
		
		// check if all numbers
		if(String.valueOf(person.getMobileNo()).matches("^[0-9]*$") == false) {
			System.out.println("Error: Provided Name/Age/MobileNo is Invalid.");
		}
		
		// check phone number of digits
		if(String.valueOf(person.getMobileNo()).length() != 10) {
			System.out.println("Error: Provided Name/Age/MobileNo is Invalid.");
			return false;
		}
		
		// check if numbers aren't duplicates
		for (int i = 0; i < String.valueOf(person.getMobileNo()).length(); i++) {
			
			if(i == String.valueOf(person.getMobileNo()).length()-1) {
				System.out.println("Error: Provided Name/Age/MobileNo is Invalid.");
				return false;
			}
			
			if(String.valueOf(person.getMobileNo()).charAt(i) == String.valueOf(person.getMobileNo()).charAt(i + 1)) {
				continue;
			} else {
				break;
			}
				
		}
		
        return true;

    }
    
    

    public static String generatePANNumber(Person person) {
    	//remove white spaces and put name in all caps
    	String name = person.getName().replaceAll(" ", "").toUpperCase();
    	// get age
    	Integer age = person.getAge();
    	
    	// empty pan
    	String pan = "";
    	
    	// pan is first 5 letters of the person's name followed by age twice
    	// followed by 6th character
    	if(name.length() >= 6) {
    		pan = pan
    				.concat(name.substring(0, 5))
    				.concat(String.valueOf(age))
    				.concat(String.valueOf(age))
    				.concat(Character.toString(name.charAt(5)));
    	} else {
    		// if name is shorter than 6 characters, 
    		// fill in with As and 5th character is Z
    		while(name.length()<6) {
    			if(name.length()==5) {
    				name=name.concat("Z");
    			} else {
    				name=name.concat("A");
    			}
  
    		}
    		
    		pan = pan
    				.concat(name.substring(0, 5))
    				.concat(String.valueOf(age))
    				.concat(String.valueOf(age))
    				.concat(Character.toString(name.charAt(5)));
    	}
    	
        return pan;
    }
    
    

    public static String generateAadharNumber(Person person) {
    	String age = String.valueOf(person.getAge());
    	String aadhar = "1234 ".concat(age).concat(age).concat(" 9876");
        return aadhar;

    }


}

class Person {
    private String name;
    private Integer age;
    private Long mobileNo;

    public Person(String name, Integer age, Long mobileNo) {
        super();
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

}
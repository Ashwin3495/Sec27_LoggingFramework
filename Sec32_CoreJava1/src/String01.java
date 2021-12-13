
public class String01 {
	
	public static void main(String[] args) {
		
String a="HelloWorld";
System.out.println(a.charAt(5));
System.out.println(a.indexOf("a"));
System.out.println(a.substring(1,3));
System.out.println(a.substring(6));
System.out.println(a.trim());
System.out.println(a.concat("Jimmy"));

String arr[]=a.split("W");
System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(a.replace('o', 't'));
		
	}

}

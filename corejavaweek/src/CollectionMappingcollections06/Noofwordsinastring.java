package CollectionMappingcollections06;


public class Noofwordsinastring {
	
	public static void main(String[] args) {
		
		String str = "java fggr";
		String s[] = str.split(" ");
		
		int count = 0;
		for(int i =0;i<str.length();i++) {
			
			if(str.charAt(i)!=' ') {
				count++;
				
			}
		}
		System.out.println(count);
		System.out.println(s.length);
		
	}

}

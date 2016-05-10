
public class Main {

	static int i = 1;
	
	public static void main(String[] args) {
//		@ModelAttribute
//		public void getUser(@RequestParam(value="id", required=false) Integer id,
//							Map<String, Object> map)
//		{
//			print("ModelAttribute");
//			if(id !=null)
//			{
//				User user = new User(id, "xdwxf","123456", 25);
//				System.out.println(user);
//				map.put("user", user);
//			}
//			
//		}
		A a = A.instance();
		A aa = A.instance();
		if(a == aa)
			System.out.println("same");
		else
			System.out.println("no same");
			
	}

}

class A
{
	public static A instance()
	{
		if(a == null)
			a = new A();
		return a;
	}
	
	private static A a;
	private A(){}
}

package test0330c;

public class Sandbox_Inner {

	public class Inner{
		public String iMethod(String a){
			return a;
		}
		
	}
	public static class InnerStatic{
		int a = 0;
		public InnerStatic(int i){
			this.a = i;
		}
		public String isMethod1(String a){
			return a;
		}
		public String isMethod2(){
			if(this.a == 0){
				return "abc";
			}else{
				return "def";
			}
		}
	}
}

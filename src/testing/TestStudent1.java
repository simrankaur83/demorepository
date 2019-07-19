package testing;

class TestStudent1{  
	public void set(){
	}
int id;  
String name;  
//method to display the value of id and name  
void display(){System.out.println(id+" "+name);}  
  
public static void main(String args[]){  
//creating objects  
	TestStudent1 s1=new TestStudent1();  
	TestStudent1 s2=new TestStudent1();  
//displaying values of the object  
s1.display();  
s2.display();  

}  
}   
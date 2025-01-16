/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{   
    int age;
    String name;
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return this.age;
    }
    
	public static void main(String[] args) {
	    Main obj = new Main();
	    obj.setAge(20);
	    obj.setName("Bawa Ballam");
		System.out.println("My Name is "+obj.getName()+" and my Age is "+obj.getAge());
	}
}

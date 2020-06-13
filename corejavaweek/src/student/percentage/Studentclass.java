package student.percentage;

import Indroducton.Studentdata.Student;

public class Studentclass {
	private int id=100;
	private String name;
	int m1,m2,m3;
	private static int idgenerator=100;
	
	protected Studentclass() {
		
	}
	
	public Studentclass(String name,int m1,int m2,int m3) {
		
		id=idgenerator++;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
		
	}
      

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	


	public float percentage() {
		return (float)(m1+m2+m3)/3;
	}
            public String toString() {
            	return "id:"+id+" name:"+name+"marks"+m1+","+m2+","+m3+percentage();
            }
	}



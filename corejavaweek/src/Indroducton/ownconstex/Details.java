package Indroducton.ownconstex;

public class Details {
           int id;
           String Name;
           int Sub1;
           int Sub2;
           int Sub3;
           public Details() {
        	   System.out.println("default constructor");
           }
           public Details(int id,String Name,int Sub1,int
        		   Sub2,int Sub3) {
        	   this.id=id;
        	   this.Name=Name;
        	   this.Sub1=Sub1;
        	   this.Sub2=Sub2;
        	   this.Sub3=Sub3;
           } 	   
        			     
       protected void setid(int id) {
   		this.id = id;
   	}

        protected int getid() {
        	return id;
        }
	protected void setName(String Name) {
		this.Name=Name;
	}
		protected String getname() {
			return Name;
		}
           protected void setSub1(int Sub1) {
			  this.Sub1=Sub1;
		}
        		 
           protected int getSub1() {
        	   return Sub1;
			
		}
           
           protected void setSub2(int Sub2) {
			      this.Sub2=Sub2;
		}
        		protected int getSub2() {
        			return Sub2;
					
				}
        		protected void setSub3(int Sub3) {
					this.Sub3=Sub3;
				}
        	   protected int getSub3() {
				return Sub3;
				
			}
        	   protected int totalmarks() {
        		   return Sub1+Sub2+Sub3;
				
			}
        	   protected int Avg() {
        		  return (totalmarks())/3;
				
			}
        	   protected int percentage() {
        		   return (totalmarks()/3*100);
        	   }
        	   public String toString() {
				return "id"+id+"Name"+Name+"marks"+totalmarks()+","+"avg is"+Avg()+" percentage is"+percentage();
        		   
        	   }
           }
 




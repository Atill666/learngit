import java.util.ArrayList;
import java.util.*;

interface way1{
	public boolean addStudent(Integer stuType);
    public String[] parse(String input[]);
    public void print(String s1[],String s2[]);
}



public class SchoolSystem implements way1{
	int a,b,c,e=0,f=0,g=0;
	public SchoolSystem(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public boolean addStudent(Integer stuType) {
		if(stuType==1&&e<a) {
			e++;
    		return true;
    	}else
    	if(stuType==2&&f<b) {
    		f++;
    		return true;
    	}else
    	if(stuType==3&&g<c) {
    		g++;
    		return true;
    	}else
    	return false;
	}


	public String[] parse(String[] input) {
        for(int i=1;i<=input.length;i++) {
        	if(input[i].equals("SchoolSystem")){
        		input[i]="n";
        	}else if(input[i].equals("addStudent")) {
        		input[i]="p";
        	}else {
        		input[i]="error";
        	}
        }
		return input;
	}
	
	public void print(String s1[],String s2[]) {
         for(int i=0;i<s1.length;i++) {
        	 if(i==0) {
        		 s2[i]="null";
        	 }else {
        		 s2[i]=s1[i-1];
        	 }
         }
		 ArrayList<String> end = new ArrayList<>();
		 for(int i=0;i<s1.length-1;i++) {
			 end.add(s2[i]);
		 }
		 System.out.print(end);
		
	}
	public static void main(String[] args) {
        int maxsize;
		ArrayList<String> sc = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		maxsize = s.nextInt();
		for(int i=1;i<=maxsize;i++) {
			sc.add(s.next());
		}
		String[] sr = new String[maxsize+1];
		String[] st = new String[maxsize+1];
		for(int i=1;i<sc.size();i++) {
			sr[i]=sc.get(i);
		}
		ArrayList<Integer> sc1 = new ArrayList<Integer>();
		ArrayList<Integer> sc2 = new ArrayList<Integer>();
		ArrayList<String> sc3 = new ArrayList<String>(); 
        System.out.print("请完成幼儿园管理系统初始化数据：");
		for(int i=0;i<3;i++) {
        	sc1.add(s.nextInt());
        }
		System.out.println("初始化成功！！！");
		System.out.println("请输入各班分配：");
		for(int i=1;i<=maxsize-1;i++) {
			
			sc2.add(s.nextInt());
		}
		SchoolSystem o = new SchoolSystem(sc1.get(0),sc1.get(1),sc1.get(2));
		for(int i=0;i<maxsize-1;i++) {
			if(o.addStudent(sc2.get(i))) {
			     	sc3.add("true");
			}else {
				sc3.add("false");
			}
		}
	    for(int i=0;i<maxsize-1;i++) {
	    	sr[i]=sc3.get(i);
	    }		
		o.print(sr,st);
	}


	
   
      
}

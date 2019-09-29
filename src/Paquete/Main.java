package Paquete;

public class Main 
{
	public static void conversion(String s) 
	{
		
		char []cadena;
		cadena=s.toCharArray();
		Pilas obj1=new Pilas(s.length());
		Pilas obj2=new Pilas(s.length());
		for(int i=0;i<s.length();i++) 
		{
			if(Character.isLetter(cadena[i])) 
			{
				obj1.push(cadena[i]);
			}
			else 
			{
				if(cadena[i]=='(') 
				{
					obj2.push(cadena[i]);
				}
				if(cadena[i]==')'&&!obj2.empty()) 
				{
					while(obj2.stakeTop()!='(') 
					{
						obj1.push(obj2.pop());
					}
					obj2.pop();
				}
				if(cadena[i]=='+'||cadena[i]=='-') 
				{
					if(obj2.stakeTop()=='+'||obj2.stakeTop()=='-'||obj2.stakeTop()=='(') 
					{
						obj2.push(cadena[i]);
					}
					if(obj2.empty()) 
					{
						obj2.push(cadena[i]);
					}
					if(obj2.stakeTop()=='*'||obj2.stakeTop()=='/') 
					{
						obj2.push(cadena[i]);
						while(!obj2.empty()) 
						{
							obj1.push(obj2.pop());
						}
					}
					/*if(obj2.stakeTop()=='+'||obj2.stakeTop()=='-'||obj2.stakeTop()=='(') 
					{
						obj2.push(cadena[i]);
					}*/
				}
				if(cadena[i]=='*'||cadena[i]=='/') 
				{
					if(obj2.stakeTop()=='*'||obj2.stakeTop()=='/'||obj2.stakeTop()=='(') 
					{
						obj2.push(cadena[i]);
					}
					if(obj2.empty()) 
					{
						obj2.push(cadena[i]);
					}
					if(obj2.stakeTop()=='+'||obj2.stakeTop()=='-') 
					{
						obj2.push(cadena[i]);
					}
					/*if(obj2.stakeTop()=='*'||obj2.stakeTop()=='/'||obj2.stakeTop()=='(') 
					{
						obj2.push(cadena[i]);
					}*/
				}
				
			}
		}
		while(!obj1.empty()) 
		{
			obj2.push(obj1.pop());
		}
		while(!obj2.empty()) 
		{
			System.out.print(obj2.pop());
		}
		
	}
	
	public static void main(String[] args) 
	{
		String s="(a*b+c)+(a+b)";
		conversion(s);
	}

}

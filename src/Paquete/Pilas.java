package Paquete;

public class Pilas 
{
	private char [] cadena;
	private int tope;
	public Pilas(int size) 
	{
		cadena=new char[size+1];
		tope=-1;
	}
	public int getTope() 
	{
		return tope;
	}
	public void push(char c) 
	{
		
		tope++;
		cadena[tope]=c;
	}
	public boolean empty() 
	{
		if(tope==-1) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public char pop() 
	{
		char c=0;
		if(tope==-1) 
		{
			System.out.println("La pila está vacía");
		}
		if(tope>=0) 
		{
			c=cadena[tope];
			tope--;
		}
		return c;
	}
	
	public char stakeTop() 
	{
		char c=0;
		if(tope==-1) 
		{
			System.out.println("La pila está vacía");
		}
		else 
		{
			c=cadena[tope];
		}
		return c;
	}
	
	
}

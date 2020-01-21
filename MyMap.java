import java.util.*;


class Node<K extends Comparable<K>,V>
{
	final K key;
	V value;
	Node<K,V> leftChild;
	Node<K,V> rightChild;
	
	public Node(K key,V value)
	{
		this.key=key;
		this.value=value;
		this.leftChild=null;
		this.rightChild=null;
	}
}

public class MyMap<K extends	Comparable<K>,V>
{
	private Node<K,V> mapRoot;
	
	public MyMap()
	{
		this.mapRoot=null;
	}
	
	public void put(K key,V value)
	{
		if(this.mapRoot==null)
		{
			this.mapRoot=new Node<K,V>(key,value);
		}
		else
		{
			
			Node<K,V> temp=this.mapRoot;
			int ret=key.compareTo(temp.key);
			while(temp!=null)
			{
				if(ret>0)
				{
					if(temp.rightChild==null)
					{
						temp.rightChild=new Node<K,V>(key,value);
						break;
					}
					temp=temp.rightChild;
				}
				else if(ret<0)
				{
					if(temp.leftChild==null)
					{
						temp.leftChild=new Node<K,V>(key,value);
						break;
					}
					temp=temp.leftChild;
				}
				else
				{
					temp.value=value;
					break;
				}
			}
		}
	}
	
	public V get(K key)
	{
		if(this.mapRoot==null)
		{
			return null;
		}
		else
		{
			Node<K,V> temp=this.mapRoot;
			int ret=key.compareTo(temp.key);
			while(temp!=null)
			{
				if(ret>0)
				{
					temp=temp.rightChild;
				}
				else if(ret<0)
				{
					temp=temp.leftChild;
				}
				else
				{
					break;
				}
			}
			if(temp==null)
			{
				return null;
			}
			else
			{
				return temp.value;
			}
		}
	}
	
	public void display()
	{
		System.out.print("{");
		Stack nodes = new Stack<>();
		Node<K,V> current = this.mapRoot;

		while (!nodes.isEmpty() || current != null) 
		{

			if (current != null) 
			{
				nodes.push(current);
				current = current.leftChild;
			}
			else 
			{
				Node<K,V> node = (Node)nodes.pop();
				System.out.print(node.key+"="+node.value+"  ");
				current = node.rightChild;
			}

		}
		System.out.print("}");
	}
	
}

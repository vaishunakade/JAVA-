package com.containnment;


/* WAP to use containment for following hierarchy. Fill all data and print all
data: (id is a integer number, name is a String)
Class Institute id name
Branch id name
Subject id name
Topic id name
SubTopic id name
Question id name
*/
class Question
{
	int qid;
	String qname;
	
	public void setQid(int id)
	{
		this.qid=id;
	}
	public void setQname(String name)
	{
		this.qname=name; 
	}
	public int getQid()
	{
		return qid;
	}
	public String getQname()
	{
		return qname;
	}
	
	public String toString()
	{
		return qid+" "+qname;
	}
}
class Subtopic 
{
	int sbid;
	String sbname;
	Question question;
	public void setSbid(int id)
	{
		this.sbid=id;
	}
	public void setSbname(String n)
	{
		this.sbname=n;
	}
	public void setQuestion(Question q)
	{
		this.question=q;
	}
	public int getSbid()
	{
		return sbid;
	}
	public String getSbname()
	{
		return sbname;
	}
	public Question getQuestion()
	{
		return question;
	}
	public String toString()
	{
		return sbid+" "+sbname+" "+question;
	}
}
class Topic
{
	int tid;
	String tname;
	Subtopic subtopic;
	public void setTid(int id)
	{
		this.tid=id;
	}
	public void setTname(String n)
	{
		this.tname=n;
	}
	public void setSubtopic(Subtopic st)
	{
		this.subtopic=st;
	}
	public int getTid()
	{
		return tid;
	}
	public String getTname()
	{
		return tname;
	}
	public Subtopic getSubtopic()
	{
		return subtopic;
	}
	public String toString()
	{
		return tid+" "+tname+" "+subtopic;
	}
}
class Subject
{
	int sid;
	String sname;
	Topic topic;
	public void setSid(int id)
	{
		this.sid=id;
	}
	public void setSname(String n)
	{
		this.sname=n;
	}
	public void setTopic(Topic t)
	{
		this.topic=t;
	}
	public int getSid()
	{
		return sid;
	}
	public String getSname()
	{
		return sname;
	}
	public Topic getTopic()
	{
		return topic;
	}
	public String toString()
	{
		return sid+" "+sname+" "+topic;
	}
}
class Branch
{
	int bid;
	String bname;
	Subject subject;
	public void setBid(int id)
	{
		this.bid=id;
	}
	public void setBname(String n)
	{
		this.bname=n;
	}
	public void setSubject(Subject s)
	{
		this.subject=s;
	}
	public int getBid()
	{
		return bid;
	}
	public String getBname()
	{
		return bname;
	}
	public Subject getSubject()
	{
		return subject;
	}
	public String toString()
	{
		return  bid+" "+bname+" "+subject;
	}
}
class Institute
{
	int id;
	String name;
	Branch branch;
	public void setId(int i)
	{
		this.id=i;
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public void setBranch(Branch b)
	{
		this.branch=b;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Branch getBranch()
	{
		return branch;
	}
	public String toString()
	{
		return id+" "+name+" "+branch;
	}
}

public class Using_getter_setter_Inst {

	public static void main(String[] args) {
		Institute in=new Institute();
		
	

	}

}

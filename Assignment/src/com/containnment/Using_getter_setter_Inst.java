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
	}
class Institute
{
	int id;
	String name;
	Branch branch;
}

public class Using_getter_setter_Inst {

	public static void main(String[] args) {
		

	}

}

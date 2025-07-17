package Com.Entity;

public class College {
private int sid;
private String Cname;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
@Override
public String toString() {
	return "College [sid=" + sid + ", Cname=" + Cname + "]";
}

}

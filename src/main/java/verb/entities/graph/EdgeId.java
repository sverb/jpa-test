package verb.entities.graph;

import java.io.Serializable;

import verb.entities.Employee;

public class EdgeId implements Serializable{

	private static final long serialVersionUID = 1900992528367161984L;

	private long fromId;
	private long toId;
	
	public EdgeId(long fromId, long toId){
		this.fromId = fromId;
		this.toId = toId;
	}
	
	public boolean equals(Object o){
		if(o.getClass().equals(this.getClass())){
			EdgeId pk = (EdgeId) o;
			return fromId == pk.getFromId() && toId == pk.getToId();
		}
		else{
			return false;
		}
	}
	
	public int hashCode(){
		return (int) (31*fromId*toId);
	}
	
	public long getFromId() {
		return fromId;
	}

	public void setFromId(long fromId) {
		this.fromId = fromId;
	}

	public long getToId() {
		return toId;
	}

	public void setToId(long toId) {
		this.toId = toId;
	}
}

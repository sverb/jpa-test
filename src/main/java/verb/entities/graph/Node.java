package verb.entities.graph;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NODE")
public class Node {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "NODE_ID")
	private long id;

	@Column
	private String name;

	@ManyToMany
	@JoinTable(name = "EDGE", joinColumns = { @JoinColumn(name = "fromId", referencedColumnName = "NODE_ID", nullable = false) }, inverseJoinColumns = { @JoinColumn(name = "toId", referencedColumnName = "NODE_ID", nullable = false) })
	private List<Node> children = new ArrayList<Node>();

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public Node() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

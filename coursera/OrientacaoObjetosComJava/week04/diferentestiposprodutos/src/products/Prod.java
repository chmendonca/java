/*
 * Author: CASSIO HENRIQUE MENDONCA
 * Date: May 18th, 2020
 * Course: Orientação a objetos com Java
 * Week: 4 (homework)
 * Release Changes: first release
 * Main Resources:
 * http://www.matera.com/blog/post/desvendando-os-metodos-equals-e-hashcode
 * https://blog.cvinicius.com.br/2017/03/melhorando-sobrescrita-dos-metodos.html
 * http://www.linhadecodigo.com.br/artigo/3669/trabalhando-com-a-interface-set-no-java.aspx
 * https://www.devmedia.com.br/sobrescrevendo-o-metodo-hashcode-em-java/26488
 * https://blog.algaworks.com/entendendo-o-equals-e-hashcode/
 */

package products;

import java.util.Objects;

public class Prod {
	
	public String name;
	public String id;
	public double price;

	public Prod(String id, String name, double price) {
		this.name = name.toUpperCase();
		if (id != null) {
			this.id = id.toUpperCase();			
		}
		this.price = price;
		setName(this.name);
		setId(this.id);
		setPrice(this.price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product ID: " + id + ", Product Name: " + name + ", Product Price: " + price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Prod) {
			if (!((Prod) obj).getId().equals(this.id)) {
				return false;
			} else {
				return true;
			}
			
		} else {
			return true;
		}
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id);
	}

}

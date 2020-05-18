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

public class ProdSize extends Prod {

	public String size;

	public ProdSize(String id, String name, double price, String size) {
		super(id, name, price);
		this.size = size.toUpperCase();
		setSize(this.size);
	}
	
		public String getSize() {
		return size.toUpperCase();
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Product ID: " + this.id + ", Name: " + this.name + ", Price: " + this.price + ", Size: " + this.size;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Prod) {
			if (!((Prod) obj).getId().equals(this.id)){
				return false;
			} else if (((Prod) obj).getId().equals(this.id) && !((ProdSize) obj).getSize().contentEquals(this.size)){
				return false;
			} else {
			}
				return true;
		} else {
			return true;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		return result;
	}

}

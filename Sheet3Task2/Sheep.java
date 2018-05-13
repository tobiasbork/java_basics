
public class Sheep {
		public String name;
		public Fur fur;
		public Sheep(String name, Fur fur) {
			this.name = name;
			this.fur = fur;
		}
		public void shear() {
			fur.length = 0;
		}
		public String toString() {
			return "Name: " + name + " " + fur.toString();
		}
		
		public boolean equals(Object cmp) {
			return cmp instanceof Sheep && this.name.equals(((Sheep)cmp).name) && this.fur.length == (((Sheep)cmp).fur.length);
		}
		
		public Sheep clone() {
			return this;
		}
		
		public Sheep deepClone() {
			return new Sheep(this.name, new Fur(this.fur.length));
		}
		
		public Sheep shallowClone() {
			return new Sheep(this.name, this.fur);
		}
	}
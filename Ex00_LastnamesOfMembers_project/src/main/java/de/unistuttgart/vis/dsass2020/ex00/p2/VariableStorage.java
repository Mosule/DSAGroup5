package de.unistuttgart.vis.dsass2020.ex00.p2;

public class VariableStorage<T> implements IVariableStorage<T> {

	private T var;
	public void set(T var) {
		this.var = var;
	}
	public T get() {
		return var;
	}

}

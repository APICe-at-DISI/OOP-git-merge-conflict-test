public final class HelloWorld {

	public static void main(final String[] args) {
		System.out.println("This program is running in a PC with " + procNumber() + " logic processors!");
	}

	public static int procNumber() {
		return Runtime.getRuntime().availableProcessors();
	}

}

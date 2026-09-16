int procNumber() {
	return Runtime.getRuntime().availableProcessors();
}

void main() {
	System.out.println("This program is running in a PC with " + procNumber() + " logic processors!");
}

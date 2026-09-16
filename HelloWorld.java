int procNumber() {
	return Runtime.getRuntime().availableProcessors();
}

void main() {
	IO.println("This program is running in a PC with " + procNumber() + " logic processors!");
}

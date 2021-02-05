module edunova {
	requires java.desktop;
	requires com.google.gson;
	opens edunova.crud to com.google.gson;
}
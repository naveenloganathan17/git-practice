package com.Configuration;

import java.io.IOException;

public class FileReadermanager {

	private FileReadermanager() {
	}

	public static FileReadermanager GetFileRead() {
		FileReadermanager frm = new FileReadermanager();
		return frm;
	}

	public Configreader Getconfig() throws IOException {
		Configreader c = new Configreader();
		return c;

	}

}

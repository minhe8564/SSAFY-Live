package com.ssafy.day05.b_interface.module;

public class PrintClient {
	// class 기반 관계 - tight coupling
	// 유지보수성이 떨어짐
//	private InkjetPrinter ip;

	// interface를 통해서 관계 맺음 - loose coupling
    private Printer printer;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printThis(String fileName) {
        printer.print(fileName);
    }
}
